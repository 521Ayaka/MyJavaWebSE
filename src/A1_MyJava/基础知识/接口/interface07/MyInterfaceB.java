package A1_MyJava.����֪ʶ.�ӿ�.interface07;

public interface MyInterfaceB {

    /*��̬�����      ���ܶ���

    static{
        //����
    }

    */


    /*������          ���ܶ���

    public MyInterface(){
         //����
    }

    */

    public abstract void methodB();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("Ĭ�Ϸ���BBB");
    }
}
