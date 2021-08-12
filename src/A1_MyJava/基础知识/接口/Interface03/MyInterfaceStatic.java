package A1_MyJava.基础知识.接口.Interface03;

/*
从Java 8开始，接口允许定义静态方法。

格式：public static 返回值类型 静态方法名(参数列表){
          //......
     }

提示：就是将abstract或default关键字换成static关键字，带上方法体即可。

====================================================================================

注意事项：不能通过接口 ”实现类“ 的对象来调用接口的静态方法！！！ 【重点】

正确使用：接口名称.静态方法名;                             【重点】

*/

public interface MyInterfaceStatic {

    public static void method(){
        System.out.println("接口的静态方法。");
    }
    //public也是可以省略的。


}
