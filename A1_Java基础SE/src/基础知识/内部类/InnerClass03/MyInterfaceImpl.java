package 基础知识.内部类.InnerClass03;

public class MyInterfaceImpl implements MyInterface{
    @Override
    public void methodA() {
        System.out.println("覆盖重写接口的抽象方法，111-A");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写接口的抽象方法，222-B");
    }
}
