package com.xz;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        System.out.println(creatcode(5));
    }
    public static String creatcode(int n){
        Random r= new Random();

        String code = "";
        for (int i=1;i<=n;i++){
            int type=r.nextInt(3);
            switch(type){
                case 0://随机0-9
                    code+=r.nextInt(10);
                    break;
                case 1://随机大写字母
                    char ch1=(char)(r.nextInt(26)+65);
                    code+=ch1;
                    break;
                case 2://随机小写字母
                    char ch2=(char)(r.nextInt(26)+97);
                    code+=ch2;
                    break;
            }
        }
        return code;
    }
}
