package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class devMatchTest
{
    @Test
    public void exam2()
    {
        String sArr[] = {"jack:1,2,3,4","bak:4,6,2","det:3,5,2,3"};
        String[][] total = new String[sArr.length][5];

//        Map<String, Object> map = new HashMap<String, Object>();

        for(int i = 0; i < sArr.length; i++)
        {
//            System.out.println("sArr = " + sArr[i].split(":")[0]);
//            System.out.println("sArr = " + sArr[i].split(":")[1]);

            String arr[] = sArr[i].split(":")[1].split(",");

            for(int j = 0; j < arr.length; j++)
            {
                total[i][j] = arr[j];
                System.out.println("total = " + total[i][j]);
            }
        }
    }
}