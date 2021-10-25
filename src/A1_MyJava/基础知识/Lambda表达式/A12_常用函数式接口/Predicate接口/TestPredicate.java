package A1_MyJava.基础知识.Lambda表达式.A12_常用函数式接口.Predicate接口;

import java.util.function.Predicate;
/*
    boolean	test(T t) 在给定的参数上评估这个谓词。

    //逻辑判断 非
    default Predicate<T> negate() 返回表示此谓词的逻辑否定的谓词。

    //逻辑判断 与
    default Predicate<T> and(Predicate<? super T> other)
          返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。

    //逻辑判断 或
    default Predicate<T> or(Predicate<? super T> other)
            返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑或。

*/

public class TestPredicate {

    public static void main(String[] args) {

        //使用Lambda表达式
        boolean p1 = pre1("这就尴尬了", (s) -> {
            return s.length() >= 6;
        });
        System.out.println(p1);//false

        //Lambda表达式 简写
        p1 = pre1("一点都不尴尬", s -> s.length() >= 6);
        System.out.println(p1);//true

        //=======================================================

        boolean p2 = pre2("一点都不尴尬", (s -> s.length() >= 6));
        System.out.println(p2);//false

        //=======================================================

        boolean p3 = pre3("一点都不尴尬", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p3);//false

        //=======================================================

        boolean p4 = pre4("一点都不尴尬", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p4);//true

    }

    //Test 在给定的参数上评估这个谓词。
    private static boolean pre1(String str, Predicate<String> e) {
        //boolean	test(T t) 在给定的参数上评估这个谓词。
        return e.test(str);
    }

    //negate 逻辑非
    private static boolean pre2(String str, Predicate<String> e) {
        //return !e.test(str);
        //default Predicate<T> negate() 返回表示此谓词的逻辑否定的谓词。
        return e.negate().test(str);
        //使用方法 只是非 仍要调用test 先调用negate negate再调用test方法
    }

    //and 逻辑与
    private static boolean pre3(String str, Predicate<String> e1, Predicate<String> e2) {
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。
        return e1.and(e2).test(str);
    }

    //or 逻辑或
    private static boolean pre4(String str,Predicate<String> e1,Predicate<String> e2){
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //返回一个组合的谓词，表示该谓词与另一个谓词的短路逻辑AND。
        return e1.or(e2).test(str);
    }

}
