package com.xz;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的数据：");
        int num = sc.nextInt();
        System.out.println("加密后的数据"+encrypt(num));
    }
    public static String encrypt(int num){    //加密
        int[] numbers = spilt(num);
        for(int i = 0;i<numbers.length;i++){
            numbers[i]=(numbers[i]+5)%10;
        }
        reverse(numbers);

        String data = "";
        for(int i = 0;i < numbers.length;i++){
            data+=numbers[i];

        }
        return data;
    }

    public static void reverse(int[] numbers) {
        for(int i = 0,j = numbers.length-1;i<j;i++,j--){
            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;
        }

    }

    public static int[] spilt(int num) {
        int[] numbers = new int[4];
        numbers[0] = num / 1000;
        numbers[1] = (num / 100)%10;
        numbers[2] = (num / 10)%10;
        numbers[3] = num %10;
        return numbers;

    }
}

