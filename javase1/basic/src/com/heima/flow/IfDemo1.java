package com.heima.flow;

public class IfDemo1 {
    public static void main(String[] args) {
        double t = 39.9;
        if (t > 30) {
            System.out.println("你太烧了！");
        }
        double money =19.09;
        if (money > 20)
        {
            System.out.println("你真烧！");

        }
        else {
            System.out.println("你真小气！");

        }
        int sss = 12;
        if (sss<=10)
        {
            System.out.println("G");

        }
        else if (sss > 11 && sss<=15) {
            System.out.println("F");
        }
        else if (sss>16) {
            System.out.println("加油！");

        }

    }
}
