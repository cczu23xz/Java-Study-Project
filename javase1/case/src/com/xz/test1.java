package com.xz;

public class test1 {
    public static void main(String[] args) {
        //计算优惠飞机票
        double price=choose(1000,6,"头等舱");
        System.out.println("优惠价格"+price);
    }

    public static double choose(double price,int month,String type){
        if (month>=5 && month<=10) {
            switch(type){
                case"头等舱":
                    price*=0.9;break;
                case"经济舱":
                    price*=0.85;break;
            }
        }
        else {
            switch(type){
                case"头等舱":
                    price*=0.7;break;
                case"经济舱":
                    price*=0.65;break;
            }
        }
        return price;
    }
}
