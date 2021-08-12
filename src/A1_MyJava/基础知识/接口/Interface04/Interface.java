package A1_MyJava.基础知识.接口.Interface04;

public class Interface {

    public static void main(String[] args) {

        MyInterfacePrivateImpl impl = new MyInterfacePrivateImpl();

        impl.method1();
        System.out.println("======================");
        impl.method2();

        //这样该接口的 “实现类” 对象就不能调用该接口method1、2方法的共有方法了。
        //impl.methodCommon();//此时，错误写法



    }

}
