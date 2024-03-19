package com.heima.flow;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int lucknum = r.nextInt(100)+1;
        Scanner rc = new Scanner(System.in);

        //System.out.println("请猜测");
        System.out.println("你只有6次机会！");
        for (int i=0;i<6;i++){
            System.out.println("请猜测");
            int guess = rc.nextInt();
            if(guess > lucknum){
                System.out.println("大了！");
            }
            if(guess < lucknum){
                System.out.println("小了！");
            }
            if(guess == lucknum){
                System.out.println("你猜中了！");
                break;
            }
            if(i>6)
            {
                System.out.println("你输了！");
                break;
            }
        }
    }
}
