package 基础知识.接口.Interface02;

public class MyInterfaceDefaultImplA implements MyInterfaceDefault{


    @Override
    public void methodAbs() {
        System.out.println("methodAbs抽象类覆盖重写，AAA");
    }

    //继承了新添加的默认方法，也可以覆盖重写这个新添加的默认方法。
}
