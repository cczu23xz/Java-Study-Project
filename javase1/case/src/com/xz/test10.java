package com.xz;

import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
            int[] userNumbers =  UserSelectnumbers();
            PrintArray(userNumbers);
            int[] luckNumbers = createLuckNumbers();
            PrintArray(luckNumbers);
            judge(userNumbers,luckNumbers);
    }

    public static int[] UserSelectnumbers() {
        int[] numbers = new int[7];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {

            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红球号码（1-33之间，不能重复)");
                int number = sc.nextInt();
                if (number < 1 || number > 33) {
                    System.out.println("抱歉输入的号码不在1-33之间");

                } else {

                    if (exist(numbers, number)) {
                        System.out.println("抱歉，当前输入重复");
                    } else {
                        numbers[i] = number;
                        break;
                    }
                }
            }
        }
        while (true) {


            System.out.println("请输入最后一个蓝球号码(1-16之间，不能重复");
            int number = sc.nextInt();
            if (number < 1 || number > 16) {
                System.out.println("输入不正确");
            } else {
                numbers[6] = number;
                break;
            }
        }
        sc.close();
        return numbers;

    }

    private static boolean exist(int[] numbers, int number) {
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] == 0) {
                break;
            }
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    private static void PrintArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(i==numbers.length-1 ? numbers[i]:numbers[i]+",");
        }
        System.out.print("]");
    }

    private static int[] createLuckNumbers() {
        int[] numbers = new int[7];
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                int number = r.nextInt(33) + 1;
                if (!exist(numbers, number)) {
                    numbers[i] = number;
                    break;
                }

            }
        }
        numbers[6]=r.nextInt(16)+1;
        return numbers;
    }

    private static void judge(int[]usernumbers,int[] lucknumbers){
        int rednum = 0;
        int bluenum = 0;

        for (int i = 0; i < usernumbers.length-1; i++) {
            for (int j = 0; j < lucknumbers.length-1; j++) {
                    if (usernumbers[i]==lucknumbers[j]){
                        rednum++;
                        break;
                    }
            }
        }
        bluenum = lucknumbers[6] == usernumbers[6] ? 1 : 0;
        System.out.println("你命中的红球个数："+rednum);
        System.out.println("你命中的蓝球个数："+bluenum);
        if (rednum==6&&bluenum==1){
            System.out.println("恭喜中奖一亿元！");

        } else if (rednum==6&&bluenum==0) {
            System.out.println("恭喜中奖500万。");

        }else if (rednum==5&&bluenum==1){
            System.out.println("恭喜中奖3000元。");
        } else if (rednum==5&&bluenum==0) {
            System.out.println("恭喜中奖200元。");
        } else if (rednum==4) {
            System.out.println("恭喜小中10元！");
        }else {
            System.out.println("感谢您对福彩的支持！");
        }
    }

}



