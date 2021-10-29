package 基础知识.接口.Interface05;

public class Interface {

    public static void main(String[] args) {

        //调用接口的常量
        System.out.println(MyInterfaceConst.NUM_OF_MY_CLASS);
        System.out.println(MyInterfaceConst.BOOL_MY_LIU_BU_LIU);
        System.out.println(MyInterfaceConst.STR_CONST);

        System.out.println("=================================");

        //创建接口的实现类对象
        MyInterfaceConstImpl impl = new MyInterfaceConstImpl();
        impl.method();

        //但是不能修改接口的常量数值
/**
        MyInterfaceConst.BOOL_MY_LIU_BU_LIU = false;
        impl.BOOL_MY_LIU_BU_LIU = false ;
        impl.NUM_OF_MY_CLASS = 521;
*/

    }

}
