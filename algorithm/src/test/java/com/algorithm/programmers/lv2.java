package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lv2
{
    // 최댓값, 최솟값 구하기
    @Test
    public void maxAndMin()
    {
        String s = "1 2 3 4";

        String sArr[] = s.split(" ");
        int iArr[] = new int[sArr.length];

        int maxNum = 0;
        int minNum = 0;

        for (int i = 0; i < sArr.length; i++)
        {
            iArr[i] = Integer.parseInt(sArr[i]);
        }

        for(int i = 0; i < iArr.length; i++)
        {
            if(i == 0)
            {
                maxNum = iArr[i];
                minNum = iArr[i];
            }
            else
            {
                if(maxNum < iArr[i])
                {
                    maxNum = iArr[i];
                }

                if(iArr[i] < minNum)
                {
                    minNum = iArr[i];
                }
            }
        }

        String result  = minNum + " " + maxNum;

        System.out.println("result = " + result);
    }

    // JadenCase 문자열 만들기
    @Test
    public void jadenCase()
    {
        String s = "3people  unFollowed me ";
        String result = "";

        String arr[] = s.toLowerCase().split(" ");

        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(""))
            {
                result += " ";
            }
            else
            {
                String str1 = arr[i].substring(0, 1).toUpperCase();
                String str2 = arr[i].substring(1);

                if(i == arr.length - 1)
                {
                    result += str1 + str2;
                }
                else
                {
                    result += str1 + str2 + " ";
                }
            }
        }

        if(s.charAt(s.length() - 1) == ' ')
        {
            result += " ";
        }

        System.out.println("result = " + result);
    }

    // 최솟값 만들기
    @Test
    public void makeMin()
    {
        int arrA[] = {1, 4, 2};
        int arrB[] = {5, 4, 4};

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        int result = 0;

        for(int i = 0; i < arrA.length; i++)
        {
            result = result + (arrA[i] * arrB[arrB.length - (i + 1)]);
        }

        System.out.println("result = " + result);
    }

    // 올바른 괄호 확인
    @Test
    public void correctBracket()
    {
        String str = "()())(()";

        boolean result = true;
        int num = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(num == 0)
            {
                if(str.charAt(i) == '(')
                {
                    num++;
                }
                else
                {
                    num--;

                    break;
                }
            }
            else if(num > 0)
            {
                if(str.charAt(i) == '(')
                {
                    num++;
                }
                else
                {
                    num--;
                }
            }
            else
            {
                num--;

                break;
            }
        }

        if(num == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        System.out.println("result = " + result);
    }

    // 2진변환
    @Test
    public void changeBinary()
    {
        String str = "1111111";
        int result[] = new int[2];

        while (!str.equals("1"))
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == '0')
                {
                    result[1]++;
                }
            }

            result[0]++;

            str = str.replace("0", "");

            int length = str.length();
            String binary = "";

            while (length != 1)
            {
                binary = (length % 2) + binary;
                length = length / 2;
            }

            str = 1 + binary;
        }

        System.out.println("result = [" + result[0] + "] [" + result[1] + "]");
    }

    // 연속 수로 표현
    @Test
    public void continueNumber()
    {
        int num = 15;
        int sum = 0;
        int result = 1;

        for(int i = 1; i <= num; i++)
        {
            int add = 1;

            sum = i;

            while(sum <= num)
            {
                sum = sum + (i + add);
                add++;
                
                if(sum == num)
                {
                    result++;

                    break;
                }
                else if(sum < num)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
        }

        System.out.println("result = " + result);
    }

    // 피보나치 수
    @Test
    public void fibonacci()
    {
        int num = 5;
        int result = 0;

        int num1 = 1;
        int num2 = 0;

        for(int i = 2; i <= num; i++)
        {
            result = num1 + num2;

            num2 = num1;
            num1 = result;
        }

        System.out.println("result = " + result);
    }

    // 2진수 큰 수 찾기
    @Test
    public void findBinary()
    {
        int num = 78;
        int result = num;

        boolean check = false;

        String binary = Integer.toBinaryString(num);
        binary = binary.replace("0", "");

        String nextBinary = "";

        while(!check)
        {
            result++;

            nextBinary = Integer.toBinaryString(result);
            nextBinary = nextBinary.replace("0", "");

            if(binary.length() == nextBinary.length())
            {
                check = true;
            }
        }

        System.out.println("result = " + result);
    }

    // 카펫 배열 찾기
    @Test
    public void carpet()
    {
        int num1 = 10;
        int num2 = 2;
        int sum = num1 + num2;

        int result[] = new int[2];

        for1 : for(int i = 1; i < sum; i++)
        {
            for2 : for(int j = 1; j < sum; j++)
            {
                if((i * j) == sum)
                {
                    if(((i -2) * (j - 2)) == num2)
                    {
                        result[0] = j;
                        result[1] = i;

                        break for1;
                    }
                }
            }
        }

        System.out.println("result = [" + result[0] + "][" + result[1] +"]");
    }

    // 짝지어 제거
    @Test
    public void removePair()
    {
        String str = "ccddc";

        int result = 0;
        int index = 0;

        List<Character> list = new ArrayList<Character>();

        for(int i = 0; i < str.length(); i++)
        {
            if(list.size() == 0)
            {
                list.add(str.charAt(i));

                index++;
            }
            else
            {
                if(list.get(index - 1) == str.charAt(i))
                {
                    list.remove(index - 1);

                    index--;
                }
                else
                {
                    list.add(str.charAt(i));

                    index++;
                }
            }
        }

        if(list.isEmpty())
        {
            result = 1;
        }

        System.out.println("list = " + list);
        System.out.println("result = " + result);
    }

    // 행렬의 곱셈
    @Test
    public void multiplicationArray()
    {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] result = new int[arr1.length][arr2.length];
        
        for(int i = 0; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2[0].length; j++)
            {
                for(int k = 0; k < arr1[0].length; k++)
                {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        for(int i = 0; i < result.length; i++)
        {
            for(int j = 0; j < result[0].length; j++)
            {
                System.out.print("[" + result[i][j] + "]");
            }

            System.out.println();
        }
    }

    // 끝말잇기
    @Test
    public void followup()
    {
        int num = 3;
        int result[] = new int[2];

        String arr[] = {"tank", "kick", "know", "wheel", "land", "dreamk", "kick", "mother", "robot", "tank"};

        for1 : for(int i = 1; i < arr.length; i++)
        {
            if(arr[i - 1].charAt(arr[i - 1].length() - 1) != arr[i].charAt(0))
            {
                result[0] = (i % num) + 1;
                result[1] = (i / num) + 1;

                break for1;
            }
            else
            {
                for2 : for(int j = 0; j < i; j++)
                {
                    if(arr[j] == arr[i])
                    {
                        result[0] = (i % num) + 1;
                        result[1] = (i / num) + 1;

                        break for1;
                    }
                    else
                    {
                        if(arr[0] == arr[arr.length - 1])
                        {
                            result[0] = ((arr.length - 1) % num) + 1;
                            result[1] = ((arr.length - 1) / num) + 1;
                        }
                        else
                        {

                            result[0] = 0;
                            result[1] = 0;
                        }
                    }
                }
            }
        }

        System.out.println("result = [" + result[0] + "]" + "[" + result[1] + "]");
    }

    // 구명보트
    @Test
    public void lifeboat()
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int limit = 100;

        int sum = 0;
        int index = 0;
        
        Arrays.sort(arr);

        while(sum <= limit)
        {
            sum = arr[index] + arr[arr.length - (index + 1)];

            if(sum <= limit)
            {
                
            }
        }
    }
}