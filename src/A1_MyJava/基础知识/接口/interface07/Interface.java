package A1_MyJava.基础知识.接口.interface07;
/*
在使用接口时要注意：

1. 接口时不能有静态代码块或者构造方法的。
2. 一个类的直接父类只能有一个，但是一个类可以 ”实现“ 多个接口。
格式:
     public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
        //必须覆盖重写所实现的所有接口的所有抽象方法，否则该类时抽象类在class前面加上abstract关键字。
     }

3. 如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
4. 如果实现类所实现的多个接口当中，没有覆盖重写所有的抽象方法，这个类就必须时抽象方法，看2。
5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定覆盖重写冲突的默认方法。
6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
*/

public class Interface {

    public static void main(String[] args) {

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
        impl.method();
        impl.methodDefault();
        System.out.println("==========");
        impl.methodGanGa();
    }

}
