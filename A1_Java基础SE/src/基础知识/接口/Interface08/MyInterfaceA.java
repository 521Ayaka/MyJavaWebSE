package ����֪ʶ.�ӿ�.Interface08;

public interface MyInterfaceA {

    public abstract void methodA();

    public abstract void methodCommonA();

    public default void methodDefault(){
        System.out.println("AAA");
    }

}
