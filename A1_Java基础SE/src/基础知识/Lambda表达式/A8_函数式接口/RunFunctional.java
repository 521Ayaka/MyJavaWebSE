package 基础知识.Lambda表达式.A8_函数式接口;

public class RunFunctional {

    public static void main(String[] args) {
        String str = "正在听《封锁我一生--王杰》";

        //通过Lambda表达式创建 函数式接口对象
        MyInterface mi1 = () -> System.out.println(str);

        //调用方法
        mi1.method();

    }
}
