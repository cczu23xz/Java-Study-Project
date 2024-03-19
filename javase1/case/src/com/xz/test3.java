package com.xz;

import java.util.Scanner;
//评委打分
public class test3 {
    public static void main(String[] args) {
        System.out.println("当前选手得分"+getScore(6));
    }


    public static double getScore(int num){
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[num];
        for(int i = 0;i<scores.length;i++){
            System.out.println("请录入第"+(i+1)+"个评委的分数");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int sum =0;
        int max = scores[0];
        int min = scores[0];

        for(int i=0;i<scores.length;i++){
            int score = scores[1];
            sum+=score;
            if(score > max){
                max = score;
            }
            if(score<min){
                min=score;
            }

        }
        return (sum-min-max)/(num-2);
    }

}
