package 基础知识.λ和Stream流.A2_Stream流的生成方式;
/*
    Stream流的常见生成方式:
        1: Collection集合体系 可以使用默认方法stream()生成流
                default Stream<E> stream(){//...}

        2: Map集合体系 不能直接生成 只能间接的生成流

        3: 数组 可以通过Stream接口的静态方法:
                of(T... values)生成流

*/


import java.util.*;
import java.util.stream.*;

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

        //通过泛型类型为Map集合
        //Stream<Map<String,Integer>> sm =map.entrySet().stream();

        //3: 数组 可以通过Stream接口的静态方法:
        //      of(T... values)生成流
        String[] strArray1 = {"永远","爱你"};
        Stream<String> strStream1 = Stream.of(strArray1);
        Stream<String> strStream2 = Stream.of("永远","爱你");
        Stream<Integer> intStream = Stream.of(1,2,3);//可变参数，可以直接写个数组，也可以单独写数值



    }



}
