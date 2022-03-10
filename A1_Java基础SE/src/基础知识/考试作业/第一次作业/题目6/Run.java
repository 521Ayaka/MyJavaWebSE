package 基础知识.考试作业.第一次作业.题目6;

//导包 Number与该类在同一包下，不用导包
import java.util.Scanner;

public class Run {
                                          //谁调用谁要跟着抛出异常
    public static void main(String[] args) throws XXXException {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Number number = new Number(a,b);

        System.out.println("您输入的第一个数为:"+a+", 您输入的第二个数为:"+b);
        System.out.println("=========================================");
        //和
        System.out.println("两数相加的结果为: "+number.addition());
        //差
        System.out.println("第一个数减去第二个数结果为:"+number.subtrationAB());
        System.out.println("第二个数减去第一个数结果为:"+number.subtrationBA());
        //积
        System.out.println("两数相乘的结果为:"+number.multiplication());
        //商
        System.out.println("第一个数除以去第二个数结果为:"+number.divisionAB());
        System.out.println("第二个数除以去第一个数结果为:"+number.divisionBA());

        System.out.println("感谢您的光临使用，谢谢。。。。");

        /**如果其中一个数为零，抛出异常：
         * Exception in thread "main" 题目6.XXXException: 除数不能为0
         * 	at 题目6.Number.divisionBA(Number.java:42)
         * 	at 题目6.Run.main(Run.java:27)*/
    }

}
