package 基础知识.接口.Interface03;

/*
从Java 8开始，接口允许定义静态方法。

格式：public static 返回值类型 静态方法名(参数列表){
          //......
     }

提示：就是将abstract或default关键字换成static关键字，带上方法体即可。

====================================================================================

注意事项：不能通过接口 ”实现类“ 的对象来调用接口的静态方法！！！ 【重点】

正确使用：接口名称.静态方法名(参数);                        【重点】

记住：静态是最简单的，静态和对象是没有关系的，静态和类相关的，类名称.静态方法名(参数);

*/

public class Interface {

    public static void main(String[] args) {

        /**
        //创建实现类对象。
        MyInterfaceStaticImpl impl = new MyInterfaceStaticImpl();


        //这种使用方法是错误的！！！
        impl.method();

         */

        //正确使用方法
        MyInterfaceStatic.method();

        //这个都没用实现类，更别说用实现类了
        MyInterfaceStatic2.method();

        //调用Static类的静态方法
        Static.method();


    }

}
