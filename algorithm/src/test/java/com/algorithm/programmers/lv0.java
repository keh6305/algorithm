package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

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

    // 피자 나누기
    @Test
    public void dividePizza()
    {
        int n = 15;
        int i = 1;

        while ((7 * i) < n)
        {
            i++;
        }

        System.out.println("i = " + i);
    }

    // 배열 뒤집기
    @Test
    public void arrayReverse()
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
}