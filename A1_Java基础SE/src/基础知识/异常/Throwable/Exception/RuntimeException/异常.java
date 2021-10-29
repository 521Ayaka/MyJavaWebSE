package 基础知识.异常.Throwable.Exception.RuntimeException;
/*
ArrayIndexOutOfBoundsException --> IndexOutOfBoundsException --> RuntimeException --> Exception --> Throwable

ArrayIndexOutOfBoundsException是异常
属于Exception的 RuntimeException异常
其中:
Exception称为异常类，它是指程序本身可以处理的问题
RuntimeException: 在编译期间是不会检查的，编译出现问题时，需要我们返回程序修改代码

======================================================================

发现异常后，class文件被修改
指出错误的 原因 和 位置 等。
出错后边的程序将不再运行

*/
public class 异常 {

    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("程序开始");
        method();
        System.out.println("==========");
        System.out.println("程序结束");
    }

    public static void method(){
        int [] array = {0,1,2,3,4,5};

        System.out.println(array[3]);
        System.out.println(array[6]); //ArrayIndexOutOfBoundsException

    }

    /*
    运行结果:

    ==========
    程序开始
    3
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at MyJava.基础知识.异常.Throwable.Exception.RuntimeException.异常.method(异常.java:17)
    	at MyJava.基础知识.异常.Throwable.Exception.RuntimeException.异常.main(异常.java:8)

    进程已结束，退出代码为 1

    */

}
