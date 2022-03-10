package 基础知识.接口.interface07;

public interface MyInterfaceB {

    /*静态代码块      不能定义

    static{
        //内容
    }

    */


    /*构造器          不能定义

    public MyInterface(){
         //内容
    }

    */

    public abstract void methodB();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
