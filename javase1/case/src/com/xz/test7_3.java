package com.xz;

public class test7_3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            if(check(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("素数个数为"+count);
    }
    public static boolean check(int data){

        for (int j = 2; j <=data/2 ; j++) {
            if(data%j==0){
                return  false;
            }
        }
        return true;
    }

}
