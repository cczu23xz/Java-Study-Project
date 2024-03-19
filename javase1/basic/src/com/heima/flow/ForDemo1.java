package com.heima.flow;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1;i<=100;i++)
        {
            sum += i;
        }
        System.out.println("1~100的和为："+sum);

        int sum1 = 0;
        for (int i=1;i<=100;i+=2)
        {
          sum1 += i;

        }
        System.out.println("1~100的奇数和："+sum1);

    }
}
