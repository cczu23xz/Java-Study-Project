package com.heima.flow;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String week =sc.next();
            switch (week)
            {
                case "1":
                    System.out.println("注意节制");break;
                case"2":
                    System.out.println("小心背后");break;
                case"3":
                    System.out.println("加油啊");break;
                case"4":
                    System.out.println("是你在卷我吗");break;

            }

    }
}
