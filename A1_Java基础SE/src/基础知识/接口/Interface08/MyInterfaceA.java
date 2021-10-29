package 基础知识.接口.Interface08;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommonA();

    public default void methodDefault(){
        System.out.println("AAA");
    }

}
