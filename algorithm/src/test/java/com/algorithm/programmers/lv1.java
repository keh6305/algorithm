package com.algorithm.programmers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.UpperCase;

import java.util.*;

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

    // 나머지가 1이 되는 수 찾기
    @Test
    public void divisionOne()
    {
        int num = 12;
        int result = 1;

        while((num % result) != 1)
        {
            result++;
        }

        assertThat(result).isEqualTo(11);
    }

    // 내림차순으로 정렬
    @Test
    public void descOrder()
    {
        long num = 3463825;
        long result = 0;

        String str = String.valueOf(num);
        String arr[] = new String[str.length()];

        for(int i = 0; i < str.length(); i++)
        {
            arr[i] = String.valueOf(str.charAt(i));
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String descArr[] = new String[str.length()];

        String str2 = "";

        for(int i = 0; i < arr.length; i++)
        {
            str2 += arr[i];
        }

        result = Long.parseLong(str2);

        System.out.println("result = " + result);
    }

    // 내림차순으로 정렬2
    @Test
    public void descOrder2()
    {
        long n = 3463825;

        String[] list = String.valueOf(n).split("");
        Arrays.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String aList : list) sb.append(aList);

        System.out.println(Long.parseLong(sb.reverse().toString()));
    }

    // 두 정수의 사이 값 더하기
    @Test
    public void addBetweenNumber()
    {
        int a = 5;
        int b = 2;

        long result = 0;

        int min = 0;
        int max = 0;

        if(a <= b)
        {
            min = a;
            max = b;
        }
        else
        {
            min = b;
            max = a;
        }

        for(int i = min; i < (max + 1); i++)
        {
            result += i;
        }

        System.out.println("result = " + result);
    }

    // Collatz 추측
    @Test
    public void collatz()
    {
        long num = 626331;
        int result = 0;

        while(num != 1)
        {
            if(result >= 500)
            {
                result = -1;

                break;
            }

            if((num % 2) == 0)
            {
                num = num / 2;

                result++;
            }
            else
            {
                num = (num * 3) + 1;

                result++;
            }
        }

        System.out.println("result = " + result);
    }

    // 이름찾기
    @Test
    public void findName()
    {
        String arr[] = {"Jane", "Kim"};
        String result = "";

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals("Kim"))
            {
                result = "김서방은 " + i + "에 있다.";
            }
        }

        System.out.println("result = " + result);
    }

    // 핸드폰 번호 가리기
    @Test
    public void blindPhone()
    {
        String phone = "01012345678";
        String result = "";

        for(int i = 0; i < phone.length() - 4; i++)
        {
            result += "*";
        }

        result = result + phone.substring(phone.length() - 4, phone.length());

        System.out.println("result = " + result);
    }

    // 배열 숫자 나누기
    @Test
    public void diviseArray()
    {
        int arr[] = {2, 36, 1, 3};
        int divisor = 3;

        int[] result = {};

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % divisor == 0)
            {
                list.add(arr[i]);
            }
        }
        
        if(list.size() != 0)
        {
            result = new int[list.size()];

            Collections.sort(list);

            for(int i = 0; i < list.size(); i++)
            {
                result[i] = list.get(i);
            }
        }
        else
        {
            result = new int[]{-1};
        }
        
        System.out.print("result = ");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print("[" + result[i] + "]");
        }
        System.out.println();
    }

    // 최솟값 제거
    @Test
    public void removeMin()
    {
        int arr[] = {4, 3, 2, 1, 5};
        int result[] = {};

        if(arr.length == 1)
        {
            result = new int[]{-1};
        }
        else
        {
            result = new int[arr.length - 1];

            int min = arr[0];
            int index = 0;

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < min)
                {
                     min = arr[i];
                }
            }

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] != min)
                {
                    result[index] = arr[i];

                    index++;
                }
            }
        }

        System.out.print("result = ");
        for(int i = 0; i < result.length; i++)
        {
            System.out.print("[" + result[i] + "]");
        }
        System.out.println();
    }
}