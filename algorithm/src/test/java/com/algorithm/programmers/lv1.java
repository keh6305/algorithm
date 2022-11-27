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
}