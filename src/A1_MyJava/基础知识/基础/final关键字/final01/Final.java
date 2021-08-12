package A1_MyJava.基础知识.基础.final关键字.final01;
/*
1. 使用final关键字修饰一个类:

当final关键字修饰一个类的时候，格式:
public final class 类名称{
    //......
}

含义: 当前这个类，不能有任何子类 [太监类] 。 但是太监有父亲，有父类。
注意: 一个类如果是final关键字修饰的，那么其中所有的的成员方法都不能覆盖重写。[因为没有儿子]
*/
public final class Final extends Object{

    public static void main(String[] args) {
        System.out.println("方法执行");
    }

}
