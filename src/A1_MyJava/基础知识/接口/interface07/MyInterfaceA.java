package A1_MyJava.����֪ʶ.�ӿ�.interface07;

public interface MyInterfaceA {

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

    public abstract void methodA();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("Ĭ�Ϸ���AAA");
    }

    public default void methodGanGa(){
        System.out.println("����");
    }

}
