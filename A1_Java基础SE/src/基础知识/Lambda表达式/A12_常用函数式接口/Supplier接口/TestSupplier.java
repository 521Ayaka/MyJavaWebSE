package 基础知识.Lambda表达式.A12_常用函数式接口.Supplier接口;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {

        //使用Lambda表达式进行调用
//        getString( () -> {
//            return "Supplier接口";
//        } );

        //Lambda表达式简写
        String str = getString(() -> "Supplier函数式接口");
        System.out.println(str);

        //Lambda表达式获取
        Integer anInt = getInt(() -> 666);
        System.out.println(anInt);


    }

    //使用Supplier接口, 获取一个字符串
    private static String getString(Supplier<String> sup){
        return sup.get(); //Supplier里面有一个get()方法 , 用于返回泛型内容
    }

    //使用Supplier接口, 获取一个Integer
    private static Integer getInt(Supplier<Integer> sup){
        return sup.get(); //Supplier里面有一个get()方法 , 用于返回泛型内容
    }

}
