package ����֪ʶ.�ӿ�.Interface05;

public class Interface {

    public static void main(String[] args) {

        //���ýӿڵĳ���
        System.out.println(MyInterfaceConst.NUM_OF_MY_CLASS);
        System.out.println(MyInterfaceConst.BOOL_MY_LIU_BU_LIU);
        System.out.println(MyInterfaceConst.STR_CONST);

        System.out.println("=================================");

        //�����ӿڵ�ʵ�������
        MyInterfaceConstImpl impl = new MyInterfaceConstImpl();
        impl.method();

        //���ǲ����޸Ľӿڵĳ�����ֵ
/**
        MyInterfaceConst.BOOL_MY_LIU_BU_LIU = false;
        impl.BOOL_MY_LIU_BU_LIU = false ;
        impl.NUM_OF_MY_CLASS = 521;
*/

    }

}
