package 基础知识.接口.interface07;

public class MyInterfaceImpl extends MyInterfaceImplFu implements MyInterfaceA, MyInterfaceB {


    @Override
    public void methodA() {
        System.out.println("覆盖重写了接口A当中的抽象方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了接口B当中的抽象方法");
    }

    @Override
    public void method() {
        System.out.println("覆盖重写一次多个接口当中重复的抽象方法");
    }

    @Override
    public void methodDefault() {
        System.out.println("覆盖重写重复的默认方法，成为一个普通方法。");
    }


}
