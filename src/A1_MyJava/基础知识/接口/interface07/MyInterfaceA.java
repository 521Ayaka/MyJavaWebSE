package A1_MyJava.基础知识.接口.interface07;

public interface MyInterfaceA {

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

    public abstract void methodA();

    public abstract void method();

    public default void methodDefault(){
        System.out.println("默认方法AAA");
    }

    public default void methodGanGa(){
        System.out.println("尴尬");
    }

}
