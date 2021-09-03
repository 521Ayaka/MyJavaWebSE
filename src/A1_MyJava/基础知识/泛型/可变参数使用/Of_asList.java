package A1_MyJava.基础知识.泛型.可变参数使用;

/*
Arrays: 返回的集合不能增删操作，可以进行修改操作

List  : 返回的集合不能做增删改操作

Set   : 不能给重复的元素，返回的集合不能做增删操作，没有修改的方法

*/

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Of_asList {

    public static void main(String[] args) {

        //Arrays工具类中的有一个静态方法: public static <T> List <T> asList(T... a){...};
        //==========================================================================
        List<String> asList = Arrays.asList("河靴匆", "毒害真菌", "无想的一刀");
        System.out.println(asList);
        try{//添加
            asList.add("这个添加不了");
            System.out.println("asList.add(\"这个添加不了\") 未出现异常 ");
        }catch (UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        try{//删除
            asList.remove("无想的一刀");
            System.out.println(" asList.remove(\"无想的一刀\") 未出现异常 ");
        }catch (UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        try{//修改
            asList.set(1,"和薛聪");
            System.out.println("asList.set(1,\"和薛聪\"); 未出现异常 ");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }

        System.out.println("===================================================================");
        System.out.println("===================================================================");

        //List接口中有一个静态方法：public static <E> List <E> of(E... elements): 返回包含任意数量元素的不可变列表
        List<String> listOf = List.of("河靴匆", "毒害真菌", "无想的一刀");

        try{//添加
            listOf.add("文君能有几多愁");
            System.out.println(" listOf.add(\"文君能有几多愁\"); 未出现异常 ");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        try{//删除
            listOf.remove("文君能有几多愁");
            System.out.println(" listOf.remove(\"文君能有几多愁\"); 未出现异常 ");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        try{//修改
            listOf.set(1,"问君能有几多愁");
            System.out.println(" listOf.set(\"文君能有几多愁\"); 未出现异常 ");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }

        System.out.println("===================================================================");
        System.out.println("===================================================================");

        //Set接口中有一个静态方法: public static <> Set <> of(E... elements): 返回一个包含任意数量元素的不可变集合
        Set<String> setOf = Set.of("河靴匆", "毒害真菌", "无想的一刀");
        try{//添加
            setOf.add("尴尬");
            System.out.println("setOf.add(\"尴尬\") 未出现异常");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        try{//删除
            setOf.remove("无想的一刀");
            System.out.println("setOf.add(\"尴尬\") 未出现异常");
        }catch(UnsupportedOperationException e){
            System.out.println("出现异常：UnsupportedOperationException");
        }
        System.out.println("没有修改的方法");


    }

}
