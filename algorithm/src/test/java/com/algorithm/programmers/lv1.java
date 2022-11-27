package com.algorithm.programmers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.Arrays;
import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

public class lv1
{
    // 약수의 합
    @Test
    public void sumDivisor()
    {
        int num = 12;
        int result = 0;

        for (int i = 1; i <= num; i++)
        {
            if ((num % i) == 0)
            {
                result += i;
            }
        }

        assertThat(result).isEqualTo(28);
    }

    // 짝수, 홀수
    @Test
    public void oddEven()
    {
        String result = "";
        int num = 3;

        if((num % 2) == 0)
        {
            result = "Even";
        }
        else
        {
            result = "Odd";
        }

        System.out.println("result = " + result);
    }

    // 자릿수 더하기
    @Test
    public void addDigits()
    {
        int result = 0;
        int num = 123;

        while(num > 0)
        {
            result += num % 10;

            num = num / 10;
        }

        assertThat(result).isEqualTo(6);
    }

    // 자연수 뒤집기
    @Test
    public void numberFlip()
    {
        long num = 12345;
        
        String str = String.valueOf(num);

        int[] result = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
        {
            result[i] = Integer.parseInt(String.valueOf(str.charAt(str.length() - (i + 1))));
        }
    }
}