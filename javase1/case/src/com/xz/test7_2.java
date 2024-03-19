package com.xz;
//找素数2
public class test7_2 {
    public static void main(String[] args) {
        int count = 0;

        out:
        for(int i = 101;i <= 200;i++){

            for (int j = 2; j <=i/2 ; j++) {
                if(i%j==0){
                    continue out;
                }
            }
            count++;
            System.out.println(i);
        }
        System.out.println("素数的个数是"+count);
    }
}
