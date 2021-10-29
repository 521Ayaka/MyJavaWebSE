package 基础知识.考试作业.第一次作业.题目3;
/*
那题写了半天是让算阶乘,,,,真没看出来,,,,
比较简单，写具体点了就:
*/

import java.util.Scanner;

public class For_method {

    public static void main(String[] args) {

        System.out.println("请输入一个大于等于0的整数:");
        int n = new Scanner(System.in).nextInt();
        //定义一个结果
        int num = 0;
        //判断是否有错
        if ( n < 0 ){
            do {//有错就会让你一直重新输入！！！
                System.out.println("输入的数错误！\n请输入一个大于等于0的整数:");
                n = new Scanner(System.in).nextInt();
            }while (n < 0);
        }
        //两种情况
        if (n == 0){
            num = 1;
        }else{
            num = method(n); //调用方法
        }
        System.out.println(n+"!="+num);

    }

    //n>0的时候求阶乘的方法
    public static int method(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * method(n - 1);
        }
    }

}
