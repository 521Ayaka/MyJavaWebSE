package A1_MyJava.基础知识.接口.Interface08;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {

    public abstract void method();

    public abstract void methodCommonA();

    public abstract void methodCommonB();

    @Override//注意：要带有default关键字。
    public default void methodDefault() {
        System.out.println("多个父接口重复要进行覆盖重写。");
    }



}
