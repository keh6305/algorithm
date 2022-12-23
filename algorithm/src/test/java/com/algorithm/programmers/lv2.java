package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

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
}