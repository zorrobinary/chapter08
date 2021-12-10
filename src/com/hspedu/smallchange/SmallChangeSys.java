package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        /***
         * 1) 先完成显示菜单，并可以选择
         * 2) 完成零钱通明细.
         * 3) 完成收益入账
         * 4) 消费
         * 5) 退出
         * */
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        double money = 0;
        double balance = 0;
        String name = null;
        Date date = null ;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        String Detail = "---------------零钱通明细-----------------";

        do{
            System.out.println("------------------------零钱通菜单-------------");
            System.out.println("\t\t\t" +"1 零钱通明细");
            System.out.println("\t\t\t" +"2 收益入账");
            System.out.println("\t\t\t" +"3 消费");
            System.out.println("\t\t\t" +"4 退    出");
            System.out.println("请选择(1-4):");

            String key  = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(Detail + "\n");
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();//应该校验
                    if(money <= 0) {
                        System.out.println("收益大于零");
                        break;
                    }
                    balance += money;
                    date  = new Date();//获取当前时间
                    Detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) +"\t余额："+ balance;
                    break;
                case "3":
                    System.out.println("支出项目");
                    name = scanner.next();
                    money = scanner.nextDouble();
                    if(money <= 0 || balance < money) {
                        System.out.println("消费不能大于余额，消费不能是负数");
                        break;
                    }

                    balance -= money;
                    date = new Date();
                    Detail += "\n" + name  + "\t-" + money +"\t" + sdf.format(date) +"\t余额：" + balance;
                    break;
                case "4":
                    //1.是否退出是输入y、否输入n，其他输入显示输入有误。
                    String choice = "";
                    while (true) {
                        System.out.println("是否退出？，是请输入y，否请输入n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                                break;
                        }
                    }
                    if(choice.equals("y")) {
                        loop = false;
                    }
                    break;

                default:
                    System.out.println("输入有误，请重新输入");
            }


        }while (loop);
        System.out.println("退出了零钱通项目");
    }
}
