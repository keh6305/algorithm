package com.algorithm.programmers;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

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

    // 올바른 괄호 확인 ver.1
    @Test
    public void correctBracket1()
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

        result = (num == 0) ? true : false;

        System.out.println("result = " + result);
    }

    // 올바른 괄호 확인 ver.2
    @Test
    public void correctBracket2()
    {
        String str = "()()()";

        boolean result = true;
        Stack<Character> stack = new Stack<Character>();

        try
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == '(')
                {
                    stack.push('(');
                }
                else
                {
                    stack.pop();
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("error = " + e);
        }

        System.out.println("stack.empty() = " + stack.empty());
        System.out.println("stack.isEmpty() = " + stack.isEmpty());

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
        int arr[] = {70, 50, 80, 50};
        int limit = 100;

        int result = 0;
        int max = arr.length - 1;
        
        Arrays.sort(arr);

        for(int i = 0; i < max; i++)
        {
            if((arr[i] + arr[max]) <= limit)
            {
                max--;
                result++;
            }
            else
            {
                max--;
                i--;
            }
        }

        result = result + (arr.length - (result * 2));

        System.out.println("result = " + result);
    }

    // 최소공배수
    @Test
    public void leastCommonMultiple()
    {
        int[] arr = {2, 6, 8, 14};
        int result = 0;

        boolean check = true;
        int index = 1;
        int length = 0;

        Arrays.sort(arr);

        while(check)
        {
            for(int i = 0; i < arr.length; i++)
            {
                if(((arr[arr.length - 1] * index) % arr[i]) == 0)
                {
                    length++;
                }
            }

            if(length == arr.length)
            {
                check = false;
            }
            else
            {
                index++;
                length = 0;
            }
        }

        result = arr[arr.length - 1] * index;

        assertThat(result).isEqualTo(168);
    }

    // 대진표
    @Test
    public void barket()
    {
        int num = 8;
        int a = 4;
        int b = 7;

        int result = 0;

        boolean check = true;

        while (check)
        {
            if((a + 1) / 2 == (b + 1) / 2)
            {
                check = false;
            }
            else
            {
                num /= 2;
                a = (a / 2) + (a % 2);
                b = (b / 2) + (b % 2);
            }

            result++;
        }

        System.out.println("result = " + result);
    }

    // 순간이동
    @Test
    public void teleport()
    {
        int num = 5000;
        int teleport = 1;

        int result = 0;

        while(0 < num)
        {
            if((teleport * 2) <= num)
            {
                teleport *= 2;
            }
            else
            {
                num = num - teleport;
                teleport = 1;
                result++;
            }
        }

        System.out.println("result = " + result);
    }

    // 멀리뛰기(피보나치수)
    @Test
    public void jump()
    {
        int num = 5;
        long result = 0;

        int num1 = 1;
        int num2 = 0;

        for(int i = 2; i <= num; i++)
        {
            result = num1 + num2;

            num2 = num1;
            num1 = (int) result;
        }

        System.out.println("result = " + result);
    }

    // h-index
    @Test
    public void hindex()
    {
        int[] arr = {3, 0, 6, 1, 5};

        int hnum = 0;
        int result = 0;

        for(int i = 0; i <= arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(i <= arr[j])
                {
                    hnum++;
                }
            }

            if(result <= hnum && i <= hnum)
            {
                result = i;
            }

            hnum = 0;
        }

        System.out.println("result = " + result);
    }

    // 괄호 회전하기
    @Test
    public void twistBracket()
    {
        String str = "[](){}" ;

        int a = 0;
        int b = 0;

        for(int i = 0; i < str.length(); i++)
        {
            a += checkBracket(str.substring(i, str.length()) + str.substring(0, i));
            b += checkBracket2(str.substring(i, str.length()) + str.substring(0, i));
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public int checkBracket(String str)
    {
        int a = 0;
        int b = 0;
        int c = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == '[')
            {
                a++;
            }
            else if(str.charAt(i) == '{')
            {
                b++;
            }
            else if(str.charAt(i) == '(')
            {
                c++;
            }
            else if(str.charAt(i) == ']' && (0 < a))
            {
                a--;
            }
            else if(str.charAt(i) == '}' && (0 < b))
            {
                b--;
            }
            else if(str.charAt(i) == ')' && (0 < c))
            {
                c--;
            }
            else
            {
                a++;

                break;
            }
        }

        if(a + b + c != 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    public int checkBracket2(String str)
    {
        System.out.println("str = " + str);

        Stack<Character> stack = new Stack<>();

        try
        {
            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(')
                {
                    stack.add(str.charAt(i));
                }
                else if(str.charAt(i) == ']')
                {
                    if(stack.peek() == '[')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return 0;
                    }
                }
                else if(str.charAt(i) == '}')
                {
                    if(stack.peek() == '{')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return 0;
                    }
                }
                else if(str.charAt(i) == ')')
                {
                    if(stack.peek() == '(')
                    {
                        stack.pop();
                    }
                    else
                    {
                        return 0;
                    }
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("error = " + e);

            return 0;
        }

        return stack.isEmpty() ? 1 : 0;
    }

    // 귤 고르기
    @Test
    public void pickMandarin()
    {
        int[] arr = {1, 3, 2, 5, 4, 5, 2, 3, 2};
        int num = 6;

        int result = 0;

        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < arr.length; i++)
        {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(num > 0)
            {
                num -= list.get(i).getValue();

                result++;
            }
        }

        System.out.println("result = " + result);
    }
}