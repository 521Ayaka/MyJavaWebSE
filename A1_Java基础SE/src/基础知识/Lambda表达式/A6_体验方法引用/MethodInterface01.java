package 基础知识.Lambda表达式.A6_体验方法引用;

public interface MethodInterface01 {

    void method(String s);

    static void me(String str){
        System.out.println("me重载 参数类型: String :" + str);
        System.out.println("MethodInterface01 内部默认方法。");
    }

    static void me(int a){
        System.out.println("me重载 参数类型: int :" + a);
        System.out.println("MethodInterface01 内部默认方法。");
    }

}
