package com.algorithm.baekjoon;

import java.util.Scanner;

public class step1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.print("a = ");
        a = sc.nextInt();

        System.out.print("b = ");
        b = sc.nextInt();

        System.out.println(a - b);
    }
}