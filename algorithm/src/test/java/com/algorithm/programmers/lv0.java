package com.algorithm.programmers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    // 나이구하기
    @Test
    public void age()
    {
        int age = 40;

        int result = 2022 - (age - 1);

        assertThat(result).isEqualTo(1983);
    }

    // 두 수 비교하기
    @Test
    public void difference()
    {
        int num1 = 3;
        int num2 = 5;
        int num3 = 3;

        int result1 = 0;
        int result2 = 0;

        if(num1 == num2)
        {
            result1 = 1;
        }
        else
        {
            result1 = -1;
        }
        if(num1 == num3)
        {
            result2 = 1;
        }
        else
        {
            result2 = -1;
        }

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }

    // 각도 구하기
    @Test
    public void angle()
    {
        int angle = 91;
        int answer = 0;

        if(0 < angle && angle < 90)
        {
            answer = 1;
        }
        else if(angle == 90)
        {
            answer = 2;
        }
        else if(90 < angle && angle < 180)
        {
            answer = 3;
        }
        else
        {
            answer = 4;
        }

        System.out.println("answer = " + answer);
    }

    // 두 수 나누기
    @Test
    public void divide()
    {
        int num1 = 3;
        int num2 = 2;

        int result = 0;

        double num3 = (double) num1 / num2;

        result = (int)(num3 * 1000);

        assertThat(result).isEqualTo(1500);
    }

    // 짝수 더하기
    @Test
    public void addEven()
    {
        int num = 10;
        int result = 0;

        for(int i = 0; i <= num; i += 2)
        {
            result += i;
        }

        System.out.println("result = " + result);
    }

    // 배열 평균 구하기
    @Test
    public void arrAverage()
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        double num = 0;

        for(int i = 0; i < arr.length; i++)
        {
            num += arr[i];
        }

        double result = num / arr.length;

        System.out.println("result = " + result);
    }

    // 피자 나누기1
    @Test
    public void dividePizza1()
    {
        int n = 15;
        int i = 1;

        while ((7 * i) < n)
        {
            i++;
        }

        System.out.println("i = " + i);
    }

    // 피자 나누기2
    @Test
    public void dividePizza2()
    {
        int n = 10;
        int i = 1;

        while ((i * 6) % n != 0)
        {
            i++;
        }

        System.out.println("i = " + i);
    }

    // 배열 뒤집기
    @Test
    public void reverseArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int rArr[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            rArr[arr.length - (i + 1)] = arr[i];
        }

        for(int i = 0; i < rArr.length; i++)
        {
            System.out.println("rArr[" + i + "] = " + rArr[i]);
        }
    }

    // 문자열 뒤집기
    @Test
    public void reverseString()
    {
        String str = "bread";
        String result = "";

        for(int i = (str.length()); i > 0 ; i--)
        {
            result += str.substring(i - 1, i);
        }

        assertThat(result).isEqualTo("daerb");

        // StringBuilder reverse
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();

        assertThat(sb).isEqualTo("daerb");
    }

    // 짝수, 홀수 확인
    @Test
    public void checkOddEven()
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = {0, 0};

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                result[0] += 1;
            }
            else
            {
                result[1] += 1;
            }
        }

        System.out.println("짝수의 갯수 : " + result[0] + ", 홀수의 갯수 : " + result[1]);
    }
    
    // 배열 두배만들기
    @Test
    public void doubleArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int result[] = new int[arr.length]; 
        
        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i] * 2;

            System.out.println("result[" + i + "] = " + result[i]);
        }
    }

    // 사분면 구하기
    @Test
    public void quadrant()
    {
        int arr[] = {3, 2};
        int result = 0;

        if(arr[0] > 0 && arr[1] > 0)
        {
            result = 1;
        }
        else if(arr[0] < 0 && arr[1] > 0)
        {
            result = 2;
        }
        else if(arr[0] < 0 && arr[1] < 0)
        {
            result = 3;
        }
        else
        {
            result = 4;
        }

        assertThat(result).isEqualTo(1);
    }

    // 문자열 글자수 구하기
    @Test
    public void stringCount()
    {
        String arr[] = {"We", "are", "the", "world!"};
        int result[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++)
        {
            result[i] = arr[i].length();

            System.out.println("result[" + i + "] = " + result[i]);
        }
    }

    // 배열 자르기
    @Test
    public void splitArray()
    {
        int arr[] = {1, 2, 3, 4, 5};
        int start = 1;
        int end = 3;

        int result[] = new int[end - start + 1];
        int index = 0;

        for(int i = start; i <= end; i++)
        {
            result[index] = arr[i];
            index++;
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 최대값 만들기1
    @Test
    public void makeMaxNumber1()
    {
        int arr[] = {0, 31, 24, 10, 1, 9};
//        int arr[] = {1, 2, 3, 4, 5};
        int result = 0;

        int first = 0;
        int second = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > second)
            {
                if(arr[i] > first)
                {
                    if(first > second)
                    {
                        second = first;
                    }

                    first = arr[i];
                }
                else
                {
                    second = arr[i];
                }
            }
        }

        result = first * second;
        
        Arrays.sort(arr);

        System.out.println("arr[arr.length - 1] * arr[arr.length - 2] = " + arr[arr.length - 1] * arr[arr.length - 2]);
        System.out.println("result = " + result);
    }

    // 쵀대값 만들기2
    @Test
    public void makeMaxNumber2()
    {
        int[] arr = {1, 2, -3, 4, -5};

        Arrays.sort(arr);

        System.out.println((arr[0] * arr[1]) < (arr[arr.length - 1] * arr[arr.length - 2]) ? (arr[arr.length - 1] * arr[arr.length - 2]) : (arr[0] * arr[1]));
        System.out.println("Math.max() = " + Math.max((arr[0] * arr[1]), (arr[arr.length - 1] * arr[arr.length - 2])));
    }

    // 특정문자 제거
    @Test
    public void splitChar()
    {
        String str = "abcdef";
        String ch = "f";

        String result = "";

        result = str.replace(ch, "");

        System.out.println("result = " + result);
    }

    // 삼각형 완성 1
    @Test
    public void triangle1()
    {
        int arr[] = {3, 6, 2};
        int result = 0;

        Arrays.sort(arr);

        if(arr[2] < (arr[0] + arr[1]))
        {
            result = 1;
        }
        else
        {
            result = 2;
        }

        System.out.println("result = " + result);
    }

    // 문자 반복
    @Test
    public void repeatString()
    {
        String str = "hello";
        int num = 5;

        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            for(int j = 0; j < num; j++)
            {
                result += str.charAt(i);
            }
        }

        System.out.println("result = " + result);
    }

    // 홀수 배열
    @Test
    public void oddNumberArray()
    {
        int num  = 10;

        if(num % 2 == 0)
        {
            num = num / 2;
        }
        else
        {
            num = (num / 2) + 1;
        }

        int result[] = new int[num];

        for (int i = 0; i < num; i++)
        {
            result[i] = (i * 2) + 1;
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 중앙값 구하기
    @Test
    public void centerNumber()
    {
        int arr[] = {1, 3, 5, 7, 4};
        int result = 0;

        Arrays.sort(arr);

        result = arr[arr.length / 2];

        System.out.println("result = " + result);
    }

    // 순서쌍
    @Test
    public void pair()
    {
        int num = 20;
        int result = 0;

        for(int i = 1; i <= 20; i++)
        {
            if(num % i == 0)
            {
                result++;
            }
        }

        assertThat(result).isEqualTo(6);
    }

    // 가격 할인
    @Test
    public void discount()
    {
        int num = 150000;
        int result = 0;

        if(100000 <= num && num < 300000)
        {
            result = (int) (num * 0.95);
        }
        else if(300000 <= num && num < 500000)
        {
            result = (int) (num * 0.9);
        }
        else if(500000 <= num)
        {
            result = (int) (num * 0.8);
        }
        else
        {
            result = num;
        }
    }

    // 자릿수 더하기
    @Test
    public void addDigit()
    {
        int num = 12345;
        int result = 0;

        String str = String.valueOf(num);

        for(int i = 0; i < str.length(); i++)
        {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        assertThat(result).isEqualTo(15);
    }

    // 문자열 포함
    @Test
    public void containString()
    {
        String str = "ab6CDE443fgh22iJKlmn1o";
        String word = "6CDE4";

        int result = (str.contains(word) ? 1 : 2);

        System.out.println("result = " + result);
    }

    // 제곱수 판별하기
    @Test
    public void squareNumber()
    {
        int num = 144;
        double sqrt = Math.sqrt(num);

        int result = (sqrt == (int)sqrt) ? 1 : 2;

        System.out.println("result = " + result);
    }

    // 문장 속 자연수
    @Test
    public void stringOfNumber()
    {
        String str = "aAb1B2cC34oOp";
        int result = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(Character.getNumericValue(str.charAt(i)) < 10)
            {
                result += Character.getNumericValue(str.charAt(i));
            }
        }

        System.out.println("result = " + result);
    }

    // 모음 제거
    @Test
    public void removeVowel()
    {
        String str = "nice to meet you";
        String result = "";

        result = str.replaceAll("[aeiou]", "");

        System.out.println("result = " + result);
    }

    // 증식
    @Test
    public void breeding()
    {
        int n = 7;
        int s = 15;

        int result = n;

        for(int i = 1; i <= s; i++)
        {
            result = result * 2;
        }

        System.out.println("result = " + result);
    }

    // 대소문자 변경
    @Test
    public void caseConversion()
    {
        String str = "abCdEfghIJ";
        String result = "";

        for(int i = 0; i < str.length(); i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                result += Character.toLowerCase(str.charAt(i));
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                result += Character.toUpperCase(str.charAt(i));
            }
        }

        System.out.println("result = " + result);
    }

    // 문자열 정렬하기 ver.1
    @Test
    public void sortStringNumber1()
    {
        String str = "hiZ12392";

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < str.length(); i++)
        {
            if(0 <= (int)(str.charAt(i) - '0') && (int)(str.charAt(i) - '0') <= 9)
            {
                list.add((int)(str.charAt(i) - '0'));
            }
        }

        Collections.sort(list);

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 문자열 정렬하기 ver.2
    @Test
    public void sortStringNumber2()
    {
        String str = "hiZ12392";

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < str.length(); i++)
        {
            if(0 <= Character.getNumericValue(str.charAt(i)) && Character.getNumericValue(str.charAt(i)) <= 9)
            {
                list.add(Character.getNumericValue(str.charAt(i)));
            }
        }

        Collections.sort(list);

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // 문자열 정렬하기 ver.3
    @Test
    public void sortStringNumber3()
    {
        String str = "hiZ12392";

        System.out.println("str.replaceAll(\"\\\\D\", \"\") = " + str.replaceAll("\\D", ""));
        System.out.println("str.replaceAll(\"[A-z]\", \"\") = " + str.replaceAll("[A-z]", ""));
        System.out.println("str.replaceAll(\"[^0-9]\", \"\") = " + str.replaceAll("[^0-9]", ""));

        str = str.replaceAll("[a-z]","");

        int[] result = new int[str.length()];

        for(int i = 0; i < str.length(); i++)
        {
            result[i] = Character.getNumericValue(str.charAt(i));
        }

        Arrays.sort(result);

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }
    }

    // n의 배수 고르기
    @Test
    public void checkMultiple()
    {
        int[] arr = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int num = 3;

        List<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < arr.length; i++)
        {
            if((arr[i] % 3) == 0)
            {
                list.add(arr[i]);
            }
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            result[i] = list.get(i);
        }

        for(int i = 0; i < result.length; i++)
        {
            System.out.println("result = " + result[i]);
        }

        int[] result2 = Arrays.stream(arr).filter(value -> value % num == 0).toArray();

        for(int i = 0; i < result2.length; i++)
        {
            System.out.println("result2 = " + result2[i]);
        }
    }

    // 직각 삼각형 출력하기
    @Test
    public void printTriangle()
    {
        int num = 3;

        for(int i = 0; i < num; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1; i <= num; i++)
        {
            System.out.println("*".repeat(i));
        }
    }

    // 인덱스 바꾸기
    @Test
    public void changeIndex()
    {
        String str = "hello";
        char[] arr = str.toCharArray();

        arr[1] = str.charAt(2);
        arr[2] = str.charAt(1);

        String result = String.valueOf(arr);


        List<String> list = new ArrayList<>(List.of(str.split("")));
        Collections.swap(list, 1, 2);

        String answer = String.join("", list);
        
        System.out.println("result = " + result);
        System.out.println("answer = " + answer);
    }

    // 옹알이
    @Test
    public void babbling()
    {
        String sArr[] = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        String bArr[] = {"aya", "ye", "woo", "ma"};

        int result = 0;

        for(int i = 0; i < sArr.length; i++)
        {
            for(int j = 0; j < bArr.length; j++)
            {
                if((sArr[i].replaceAll(" ", "").length() == 0))
                {
                    result++;

                    break;
                }
                else
                {
                    if(sArr[i].contains(bArr[j]))
                    {
                        sArr[i] = sArr[i].replaceAll(bArr[j], " ");

                        j = 0;

                        continue;
                    }
                }
            }
        }

        System.out.println("result = " + result);
    }
}