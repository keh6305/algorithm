package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

public class lv3
{
    // 정수 삼각형
    @Test
    public void triangle()
    {
        int[][] arr = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        int[][] sumArr = new int[arr.length][arr[arr.length - 1].length];

        int result = 0;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                if(i == 0)
                {
                    sumArr[0][0] = arr[0][0];
                }
                else if(j == 0)
                {
                    sumArr[i][0] = sumArr[i - 1][0] + arr[i][0];
                }
                else if(j == arr[i].length - 1)
                {
                    sumArr[i][j] = sumArr[i - 1][i - 1] + arr[i][i];
                }
                else
                {
                    sumArr[i][j] = Math.max(sumArr[i - 1][j], sumArr[i - 1][j - 1]) + arr[i][j];
                }
            }
        }

        for (int i = 0; i < sumArr.length; i++)
        {
            result = Math.max(result, sumArr[sumArr.length - 1][i]);
        }

        System.out.println("result = " + result);
    }
}