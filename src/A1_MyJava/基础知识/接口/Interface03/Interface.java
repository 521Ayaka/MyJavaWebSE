package A1_MyJava.����֪ʶ.�ӿ�.Interface03;

/*
��Java 8��ʼ���ӿ������徲̬������

��ʽ��public static ����ֵ���� ��̬������(�����б�){
          //......
     }

��ʾ�����ǽ�abstract��default�ؼ��ֻ���static�ؼ��֣����Ϸ����弴�ɡ�

====================================================================================

ע���������ͨ���ӿ� ��ʵ���ࡰ �Ķ��������ýӿڵľ�̬���������� ���ص㡿

��ȷʹ�ã��ӿ�����.��̬������(����);                        ���ص㡿

��ס����̬����򵥵ģ���̬�Ͷ�����û�й�ϵ�ģ���̬������صģ�������.��̬������(����);

*/

public class Interface {

    public static void main(String[] args) {

        /**
        //����ʵ�������
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();


        //����ʹ�÷����Ǵ���ģ�����
        impl.method();

         */

        //��ȷʹ�÷���
        MyInterfaceStatic.method();

        //�����û��ʵ���࣬����˵��ʵ������
        MyInterfaceStatic2.method();

        //����Static��ľ�̬����
        Static.method();


    }

}
