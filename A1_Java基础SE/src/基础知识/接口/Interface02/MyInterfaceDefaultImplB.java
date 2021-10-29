package 基础知识.接口.Interface02;

public class MyInterfaceDefaultImplB implements MyInterfaceDefault{

    //对着MyInterfaceDefaultImplA类按 CTAL+C+V复制类
    @Override
    public void methodAbs() {
        System.out.println("methodAbs抽象类覆盖重写，BBB");
    }

    //覆盖重写接口的默认方法。
    @Override
    public void methodDefault(){
        System.out.println("覆盖重写接口先添加的默认方法。");
    }
}
