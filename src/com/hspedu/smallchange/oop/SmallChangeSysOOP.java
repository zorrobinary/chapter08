package com.hspedu.smallchange.oop;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/***
 * 该类是完成零钱通的各个功能。
 * 1.明细  方法名：detail
 * 2.收入  方法名：revenue
 * 3.支出  方法名：consume
 * 4.退出  方法：  exit
 * */
public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    double money = 0;
    double balance = 0;
    String name = null;
    Date date = null ;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String Detail = "---------------零钱通明细-----------------";
    String choice = "";
    public void menu() {
        do{
            System.out.println("------------------------零钱通菜单-----------------");
            System.out.println("\t\t\t" +"1 零钱通明细");
            System.out.println("\t\t\t" +"2 收益入账");
            System.out.println("\t\t\t" +"3 消费");
            System.out.println("\t\t\t" +"4 退    出");
            System.out.println("请选择(1-4):");

            String key  = scanner.next();
            switch (key) {
                case "1":
                this.detail();
                    break;
                case "2":
                    this.revenue();
                case "3":
                    this.cost();
                case "4":
                    this.exit();
                    break;

                default:
                    System.out.println("输入有误，请重新输入");
            }


        }while (loop);

    }
    public void detail() {
        System.out.println(Detail + "\n");
    }


    public void revenue() {
        System.out.println("收益入账金额：");
        money = scanner.nextDouble();//应该校验
        if(money <= 0) {
            System.out.println("收益大于零");
            return;
        }
        balance += money;
        date  = new Date();//获取当前时间
        Detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) +"\t余额："+ balance;

    }

    public void cost() {
        System.out.println("支出项目");
        name = scanner.next();
        money = scanner.nextDouble();
        if(money <= 0 || balance < money) {
            System.out.println("消费不能大于余额，消费不能是负数");
            return;
        }

        balance -= money;
        date = new Date();
        Detail += "\n" + name  + "\t-" + money +"\t" + sdf.format(date) +"\t余额：" + balance;
    }


    public void exit() {
        while (true) {
            System.out.println("是否退出？，是请输入y，否请输入n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
            if (choice.equals("y")) {
                loop = false;
            }
    }


}
