package 基础知识.静态.Static01;
/**

构建静态代码块

*/

public class Static04Person {

    //静态代码块
    static {
        System.out.println("静态代码块执行！");
    }

    public Static04Person() {
        System.out.println("构造方法执行！");
    }

}
