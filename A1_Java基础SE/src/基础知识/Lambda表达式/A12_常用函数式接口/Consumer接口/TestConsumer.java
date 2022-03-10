package 基础知识.Lambda表达式.A12_常用函数式接口.Consumer接口;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        //使用Lambda表达式
        setAccept( "Saber",(s)-> System.out.println(s) );
        //使用Lambda 使用方法引用 简写。
        setAccept("GanGa",System.out::println);

        System.out.println("======================");

        //消费者 操作
        /*setAccept("尴尬酱",s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });*/
        setAccept("尴尬酱",(s) -> System.out.println(new StringBuilder(s).reverse().toString()) );

    }

    private static void setAccept(String name, Consumer<String> consumer){
        consumer.accept(name);
    }



}
