package A1_MyJava.基础知识.接口.Interface08;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommonB();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
