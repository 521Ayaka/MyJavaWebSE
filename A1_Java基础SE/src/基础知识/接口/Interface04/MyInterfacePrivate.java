package 基础知识.接口.Interface04;
/*
问题描述:
为了减少重复代码的情况，我们需要创建一个共有的方法，用来解决此问题。
但是：又不能通过接口的 “实现类” 对象进行调用该共有的方法。

解决方法：
使用Java9 ,JDK9开始，java允许创建私有的方法。

1.普通私有方法：解决多个默认方法之间的重复代码问题。
格式：
private 返回值类型 方法名称(参数列表){
     //方法体
}


2.静态是有方法：解决多个静态方法之间的重复代码问题。
格式：
private static 返回值类型 方法名称(参数列表){
     //方法体
}

 */

public interface MyInterfacePrivate {

    public default void method1(){
        System.out.println("默认方法1执行！");
        methodCommon();
    }

    public default void method2(){
        System.out.println("默认方法2执行");
        methodCommon();
    }

    /**

    //为了不重复method1，2的代码，抽取共同体
    //但是这种方法是不对的，相当于又创建了一个默认方法，此时 “实现类” 就可以调用这个方法了，这是不想看到的
    public default void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    */


    //此时，可以用私有化进行定义 Java9可以实现
    //使用普通的私有化方法
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
