package com.xz;

import java.util.Random;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[] money = {9,666,188,520,999};
        start(money);
    }
    public static void start(int[] money){

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        for (int i=1;i<=5;i++){
            System.out.println("请您输入任意内容进行抽奖");
            sc.next();

            while (true) {
                int index = r.nextInt(money.length);
                int mon =money[index];

                if(mon != 0){
                    System.out.println("恭喜您，抽中了红包："+mon);
                    money[index] = 0;
                    break;
                }
            }
        }
        System.out.println("活动结束。。。");
    }
}
