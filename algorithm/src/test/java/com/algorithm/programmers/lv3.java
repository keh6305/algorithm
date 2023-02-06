package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    // 이중우선순위큐
    @Test
    public void dualPriorityQueue()
    {
        String arr[] = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};

        int result[] = {0, 0};
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].charAt(0) == 'I')
            {
                list.add(Integer.parseInt(arr[i].substring(2, arr[i].length())));

                Collections.sort(list);
            }
            else
            {
                if(arr[i].substring(2, arr[i].length()).equals("1") && list.size() != 0)
                {
                    list.remove(list.size() - 1);
                }
                if(arr[i].substring(2, arr[i].length()).equals("-1") && list.size() != 0)
                {
                    list.remove(0);
                }
            }
        }

        if(list.size() != 0)
        {
            result[0] = list.get(list.size() - 1);
            result[1] = list.get(0);
        }

        System.out.println("list = " + list);
        System.out.println("result = [" + result[0] + "][" + result[1] + "]");
    }

    // 최고의 집합
    @Test
    public void bestArray()
    {
        int n = 6;
        int s = 100;

        int[] result;

        if(n > s)
        {
            result = new int[]{-1};
        }
        else
        {
            result = new int[n];

            int num = s % n;

            for(int i = 0; i < n; i++)
            {
                if(i < (n - num))
                {
                    result[i] = s / n;
                }
                else
                {
                    result[i] = (s / n) + 1;
                }
            }
        }

        System.out.print("result = ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("[" + result[i] + "]");
        }
        System.out.println();
    }

    @Test
    public void network()
    {
        int num = 3;
        int[][] arr = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        boolean[] con = new boolean[arr.length];

        for(int i = 0; i < con.length; i++)
        {
            if(con[i] == false)
            {

            }
        }
    }
}