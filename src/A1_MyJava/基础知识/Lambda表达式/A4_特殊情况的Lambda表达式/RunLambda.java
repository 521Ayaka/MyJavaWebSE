package A1_MyJava.基础知识.Lambda表达式.A4_特殊情况的Lambda表达式;

public class RunLambda {

    //Lambda表达式遇到特殊的接口或方法
    public static void main(String[] args) {

        //使用Lambda表达式
        me((String ssss) -> {
            System.out.println(ssss + 4);
        });

        //可以省略参数类型
        me((sss) -> {
            System.out.println(sss + 3);
        });

        //如果参数列表只有一个, 还可以直接省略 "()" 直接 参数->{ }
        me(ss -> {
            System.out.println(ss + 2);
        });

        //如果{代码块} 中 只有一条语句,还可以省略 该语句的";"  和 "{"   "}"
        me(s -> System.out.println(s + 1));


    }

    private static void me(MyInterface impl) {
        impl.method("这就尴尬了");
    }

}
