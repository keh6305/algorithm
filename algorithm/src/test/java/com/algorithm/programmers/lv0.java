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

        int result1 = num1 / num2;

        assertThat(result1).isEqualTo(5);
    }
}