package A1_MyJava.基础知识.λ和Stream流.A2_Stream流的生成方式;
/*
    Stream流的常见生成方式:
        1: Collection集合体系 可以使用默认方法stream()生成流
                default Stream<E> stream(){//...}

        2: Map集合体系 不能直接生成 只能间接的生成流

        3: 数组 可以通过Stream接口的静态方法:
                of(T... values)生成流

*/


import java.util.*;
import java.util.stream.Stream;

public class TestNewStream {

    public static void main(String[] args) {
        //1: Collection集合体系 可以使用默认方法stream()生成流
        //      default Stream<E> stream(){//...}
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //2: Map集合体系 不能直接生成 只能间接的生成流
        Map<String,Integer> map =new HashMap<>();
        //通过map的 [键] 和 [值] 来生成Stream流
        Stream<String> mapKeyStream = map.keySet().stream();
        Stream<Integer> mapValueStream = map.values().stream();

        //通过泛型的

        //3: 数组 可以通过Stream接口的静态方法:
        //      of(T... values)生成流
        String[] array = new String[10];







        }



}
