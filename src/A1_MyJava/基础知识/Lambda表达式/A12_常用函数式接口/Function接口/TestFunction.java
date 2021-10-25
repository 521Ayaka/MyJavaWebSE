package A1_MyJava.基础知识.Lambda表达式.A12_常用函数式接口.Function接口;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        //使用Lambda表达式
        convert("4399", (String s) -> {
            return Integer.parseInt(s);
        });
        //优化
        convert("3213", s -> Integer.parseInt(s));
        //再次优化 类方法引用
        convert("6666", Integer::parseInt);

        System.out.println("===================================");

        convert(4567, i -> String.valueOf(i + 8));

        System.out.println("===================================");

        converts("8838", Integer::parseInt, s -> String.valueOf(s + 10));

    }

    //定义一个方法,把一个字符串转为int类型, 在控制台输出
    private static void convert(String s, Function<String, Integer> function) {
        int i = function.apply(s);
        //这里只是调用apply转换接收
        //具体实现实在Lambda表达式当中来操作的。
        System.out.println(i);
    }

    //定义一个方法,把一个int类型的数据加上一个整数之后, 转为字符串在控制台输出
    private static void convert(int i, Function<Integer, String> function) {
        String str = function.apply(i);
        //这里只是调用apply转换接收
        //具体实现实在Lambda表达式当中来操作的。
        System.out.println(str);
    }

    //定义一个方法,把一个字符串转为int类型, int类型的数据加上一个整数之后再转为字符串, 在控制台输出
    private static void converts(String str, Function<String, Integer> e1, Function<Integer, String> e2) {
        int i = e1.apply(str);
        String newStr = e2.apply(i);
        //具体实现实在Lambda表达式当中来操作的。
        System.out.println("newString:"+newStr);
    }


}
