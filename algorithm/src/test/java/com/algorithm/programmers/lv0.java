package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class lv0
{
    // 몫구하기
    @Test
    public void findShare()
    {
        int num1 = 10;
        int num2 = 2;

        int result = num1 / num2;

        assertThat(result).isEqualTo(5);
    }

    // 두 수의 차
    @Test
    public void subtraction()
    {
        int num1 = 2;
        int num2 = 3;

        int result = num1 - num2;

        assertThat(result).isEqualTo(-1);
    }

    // 나이구하기
    @Test
    public void age()
    {
        int age = 40;

        int result = 2022 - (age - 1);

        assertThat(result).isEqualTo(1983);
    }

    // 두 수 비교하기
    @Test
    public void difference()
    {
        int num1 = 3;
        int num2 = 5;
        int num3 = 3;

        int result1 = 0;
        int result2 = 0;

        if(num1 == num2)
        {
            result1 = 1;
        }
        else
        {
            result1 = -1;
        }
        if(num1 == num3)
        {
            result2 = 1;
        }
        else
        {
            result2 = -1;
        }

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    // 각도 구하기
    @Test
    public void angle()
    {
        int angle = 91;
        int answer = 0;

        if(0 < angle && angle < 90)
        {
            answer = 1;
        }
        else if(angle == 90)
        {
            answer = 2;
        }
        else if(90 < angle && angle < 180)
        {
            answer = 3;
        }
        else
        {
            answer = 4;
        }

        System.out.println("answer = " + answer);
    }

    // 두 수 나누기
    @Test
    public void divide()
    {
        int num1 = 3;
        int num2 = 2;

        int result = 0;

        double num3 = (double) num1 / num2;

        result = (int)(num3 * 1000);

        assertThat(result).isEqualTo(1500);
    }

    // 짝수 더하기
    @Test
    public void addEven()
    {
        int num = 10;
        int result = 0;

        for(int i = 0; i <= num; i += 2)
        {
            result += i;
        }

        System.out.println("result = " + result);
    }

    // 배열 평균 구하기
    @Test
    public void arrAverage()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double num = 0;

        for(int i = 0; i < arr.length; i++)
        {
            num += arr[i];
        }

        double result = num / arr.length;

        System.out.println("result = " + result);
    }

    // 피자 나누기1
    @Test
    public void dividePizza1()
    {
        int n = 15;
        int i = 1;

        while ((7 * i) < n)
        {
            i++;
        }

        System.out.println("i = " + i);
    }

    // 피자 나누기2
    @Test
    public void dividePizza2()
    {
        int n = 10;
        int i = 1;

        while ((i * 6) % n != 0)
        {
            i++;
        }

        System.out.println("i = " + i);
    }

    // 배열 뒤집기
    @Test
    public void reverseArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int rArr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            rArr[arr.length - (i + 1)] = arr[i];
        }

        for(int i = 0; i < rArr.length; i++)
        {
            System.out.println("rArr[" + i + "] = " + rArr[i]);
        }
    }

    // 문자열 뒤집기
    @Test
    public void reverseString()
    {
        String str = "bread";
        String result = "";

        for(int i = (str.length()); i > 0 ; i--)
        {
            result += str.substring(i - 1, i);
        }

        assertThat(result).isEqualTo("daerb");

        // StringBuilder reverse
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        assertThat(sb).isEqualTo("daerb");
    }

    // 짝수, 홀수 확인
    @Test
    public void checkOddEven()
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {0, 0};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                result[0] += 1;
            }
            else
            {
                result[1] += 1;
            }
        }

        System.out.println("짝수의 갯수 : " + result[0] + ", 홀수의 갯수 : " + result[1]);
    }
    
    // 배열 두배만들기
    @Test
    public void doubleArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int result[] = new int[arr.length]; 
        
        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] * 2;

            System.out.println("result[" + i + "] = " + result[i]);
        }
    }

    // 사분면 구하기
    @Test
    public void quadrant()
    {
        int arr[] = {3, 2};
        int result = 0;

        if(arr[0] > 0 && arr[1] > 0)
        {
            result = 1;
        }
        else if(arr[0] < 0 && arr[1] > 0)
        {
            result = 2;
        }
        else if(arr[0] < 0 && arr[1] < 0)
        {
            result = 3;
        }
        else
        {
            result = 4;
        }

        assertThat(result).isEqualTo(1);
    }

    // 문자열 글자수 구하기
    @Test
    public void stringCount()
    {
        String arr[] = {"We", "are", "the", "world!"};
        int result[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i].length();

            System.out.println("result[" + i + "] = " + result[i]);
        }
    }

    // 배열 자르기
    @Test
    public void splitArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;

        int result[] = new int[end - start + 1];
        int index = 0;

        for(int i = start; i <= end; i++)
        {
            result[index] = arr[i];
            index++;
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 최대값 만들기
    @Test
    public void makeMax()
    {
        int arr[] = {0, 31, 24, 10, 1, 9};
//        int arr[] = {1, 2, 3, 4, 5};
        int result = 0;

        int first = 0;
        int second = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > second)
            {
                if(arr[i] > first)
                {
                    if(first > second)
                    {
                        second = first;
                    }

                    first = arr[i];
                }
                else
                {
                    second = arr[i];
                }
            }
        }

        result = first * second;

        System.out.println("result = " + result);
    }

    // 특정문자 제거
    @Test
    public void splitChar()
    {
        String str = "abcdef";
        String ch = "f";

        String result = "";

        result = str.replace(ch, "");

        System.out.println("result = " + result);
    }

    // 삼각형 완성 1
    @Test
    public void triangle1()
    {
        int arr[] = {3, 6, 2};
        int result = 0;

        Arrays.sort(arr);

        if(arr[2] < (arr[0] + arr[1]))
        {
            result = 1;
        }
        else
        {
            result = 2;
        }

        System.out.println("result = " + result);
    }

    // 문자 반복
    @Test
    public void repeatString()
    {
        String str = "hello";
        int num = 5;

        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < num; j++)
            {
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);
    }

    // 홀수 배열
    @Test
    public void oddNumberArray()
    {
        int num  = 10;

        if(num % 2 == 0)
        {
            num = num / 2;
        }
        else
        {
            num = (num / 2) + 1;
        }

        int result[] = new int[num];

        for (int i = 0; i < num; i++)
        {
            result[i] = (i * 2) + 1;
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 중앙값 구하기
    @Test
    public void centerNumber()
    {
        int arr[] = {1, 3, 5, 7, 4};
        int result = 0;

        Arrays.sort(arr);

        result = arr[arr.length / 2];

        System.out.println("result = " + result);
    }

    // 순서쌍
    @Test
    public void pair()
    {
        int num = 20;
        int result = 0;

        for(int i = 1; i <= 20; i++)
        {
            if(num % i == 0)
            {
                result++;
            }
        }

        assertThat(result).isEqualTo(6);
    }

    // 가격 할인
    @Test
    public void discount()
    {
        int num = 150000;
        int result = 0;

        if(100000 <= num && num < 300000)
        {
            result = (int) (num * 0.95);
        }
        else if(300000 <= num && num < 500000)
        {
            result = (int) (num * 0.9);
        }
        else if(500000 <= num)
        {
            result = (int) (num * 0.8);
        }
        else
        {
            result = num;
        }
    }

    // 옹알이
    @Test
    public void babbling()
    {
        String sArr[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String bArr[] = {"aya", "ye", "woo", "ma"};

        int result = 0;

        for(int i = 0; i < sArr.length; i++)
        {
            for(int j = 0; j < bArr.length; j++)
            {
                if((sArr[i].replaceAll(" ", "").length() == 0))
                {
                    result++;

                    break;
                }
                else
                {
                    if(sArr[i].contains(bArr[j]))
                    {
                        sArr[i] = sArr[i].replaceAll(bArr[j], " ");

                        j = 0;

                        continue;
                    }
                }
            }
        }

        System.out.println("result = " + result);
    }
}