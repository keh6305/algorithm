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
}