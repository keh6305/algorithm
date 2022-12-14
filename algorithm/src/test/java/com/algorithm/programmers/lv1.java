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

    // 제곱근 판별
    @Test
    public void checkSquare()
    {
        long result = 0;
        int num = 121;

        long sqrt = (long)Math.sqrt(num);
        long pow = (long)Math.pow(sqrt, 2);

        if(num == pow)
        {
            result = (long)Math.pow((sqrt + 1), 2);
        }
        else
        {
            result = -1;
        }

        assertThat(result).isEqualTo(144);
    }

    // 문자열내 문자 구하기
    @Test
    public void letterOfString()
    {
        String str = "pPoooyY";

        int p = 0;
        int y = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(String.valueOf(str.charAt(i)).equals("p") || String.valueOf(str.charAt(i)).equals("P"))
            {
                p++;
            }
            if(String.valueOf(str.charAt(i)).equals("y") || String.valueOf(str.charAt(i)).equals("Y"))
            {
                y++;
            }
        }

        assertThat(p).isEqualTo(y);
    }

    // 간격 배열 구하기
    @Test
    public void termArray()
    {
        int x = 2;
        int n = 5;

        long result[] = new long[n];

        for(int i = 0; i < n; i++)
        {
            result[i] = x + ((long)x * i);

            System.out.println("result = " + result[i]);
        }
    }

    // 문자열 숫자로 전환
    @Test
    public void stringToInt()
    {
        int result = 0;
        String str = "-12345";

        result = Integer.parseInt(str);

        assertThat(result).isEqualTo(-12345);
    }

    // 하샤드수
    @Test
    public void hashadsNumber()
    {
        boolean result = true;

        int num = 18;
        int origin = num;
        int sum = 0;

        while (num > 0)
        {
            sum += (num % 10);

            num = num / 10;
        }

        if(origin % sum != 0)
        {
            result = false;
        }

        assertThat(result).isEqualTo(true);
    }
}