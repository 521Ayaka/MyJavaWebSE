package A1_MyJava.����֪ʶ.�ӿ�.Interface08;

public interface MyInterfaceB {

    public abstract void methodB();

    public abstract void methodCommonB();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
