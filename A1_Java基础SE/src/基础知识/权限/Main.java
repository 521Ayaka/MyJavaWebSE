package 基础知识.权限;
/*
Java当中有四种权限修饰符。

                     public    >     protected    >     (default)     >     private
同一个类                YES               YES               YES                 YES
同一个包                YES               YES               YES                 NO
不同包子类               YES               YES               NO                  NO
不同包非子类              YES               NO                NO                  NO
*/

//导包

import 基础知识.权限.MyLei.MyLei;
import 基础知识.权限.MyLei.MyLeiGan;


public class Main extends MyLei {

    public static int num1 = 1;
    protected static int num2 = 2;
    /*(default)*/ static int num3 = 3;
    private static int num4 = 4;

    public static void main(String[] args) {

        //同一个类
        System.out.println("=======同一个类=======");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        method();

        //同一个包
        System.out.println("=======同一个包=======");
        MyClass myClass = new MyClass();
        System.out.println(myClass.num1);
        System.out.println(myClass.num2);
        System.out.println(myClass.num3);
//      System.out.println(myClass.num4);  //private成员变量 无法调用
//      myClass.method1();                 //private方法方法 无法调用
        myClass.method2();//default

 /*
        //不同包子类
        System.out.println(super.num1);
        System.out.println(super.num2);
        System.out.println(super.num3);
        System.out.println(super.num4);
        //在static main方法中不可调用父类???
        //static当中 不能使用this和super
*/

        //不同包非子类
        System.out.println("======不同包非子类======");
        MyLeiGan gan = new MyLeiGan();
        System.out.println(gan.num1);
//      System.out.println(gan.num2);  //  protected成员方法  不能调用
//      System.out.println(gan.num3);  //  (default)成员方法  不能调用
//      System.out.println(gan.num4);  //  private  成员方法  不能调用
        gan.method4();
//      gan.method3();                 //  同样成员方法也不能调用
//      gan.method2();                 //  同样成员方法也不能调用
//      gan.method1();                 //  同样成员方法也不能调用


    }

    private static void method(){
        System.out.println("私有方法");
    }

    void method0(){
        //不同包子类
        System.out.println(super.num1);
        System.out.println(super.num2);
//      System.out.println(super.num3);  //(default) 不能调用
//      System.out.println(super.num4);  //private   不能调用
    }

}