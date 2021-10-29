package 基础知识.异常.异常处理.Throws_method;  //throws 读 “ 丝肉丝 ”
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
注意事项:
1. throws处理时 写在方法的[ () ]后面。
   [格式]:  修饰符 方法名() throws 异常类 { //方法体 }

2. throws处理异常的时候，有些异常，在所调用的方法也要著名 throws 处理。           【maim() method5() method2() 的调用】
                              或者使用try...catch...处理。                【method3()的调用】

3. 有些异常，在throws处理后，不会再向下运行，要是往下运行还是要try...catch...处理  【method1()的调用】

*/

public class RunThrows {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ParseException{
        System.out.println("程序开始执行。");

        //method1();//不会向下运行
        method2();//如果main也要使用throws异常签名。
        method3();//也可以使用try...catch...处理 。 所以method3没有使用throws处理。
        Method.method5();//仍然需要throws抛出异常。

        System.out.println("程序结束运行。");
    }


    public static void method1() throws ArrayIndexOutOfBoundsException{
        String str = scanner.next();
        String[] array = {str};
        System.out.println(array[1]);/**
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at MyJava.基础知识.异常.异常处理.Throws_method.RunThrows.method(RunThrows.java:16)
        at MyJava.基础知识.异常.异常处理.Throws_method.RunThrows.main(RunThrows.java:10)
        */
    }

    //使用SimpleDateFormat的parse方法。
    private static void method2() throws ParseException {

        System.out.println("日期格式: 年/月/日 ");
        String string = scanner.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = sdf.parse(string); //SimpleDateFormat类的parse方法要使用throws异常签名。
        System.out.println(sdf.format(date));
    }

    public static void method3() {
        System.out.println("再次运行");
        try {
            method2();//仍然需要throws抛出异常。
        }catch(ParseException e){
            e.printStackTrace();
        }
    }

}
