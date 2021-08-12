package A1_MyJava.基础知识.静态.Static01;
/*
 注意事项：
 1. 静态不能直接访问非静态。
 原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
 “先人不知道后人，但是后人知道先人。”
 2. 静态方法当中不能用this。
 原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。

*/
public class MyClass {

    int num; // 成员变量
    static int numStatic; // 静态变量


    // 成员方法
    public void method() {
        System.out.println("这是一个成员方法。");

        // 成员方法可以访问成员变量
        System.out.println(num);

        // 成员方法可以访问静态变量
        System.out.println(numStatic);
    }


    // 静态方法
    public static void methodStatic() {
        System.out.println("这是一个静态方法。");
        // 静态方法可以访问静态变量
        System.out.println(numStatic);



/**     静态不能直接访问非静态【重点】

        System.out.println(num); // 错误写法！

*/


/**     静态方法中不能使用this关键字。

        System.out.println(this); // 错误写法！

 */

    }

}
