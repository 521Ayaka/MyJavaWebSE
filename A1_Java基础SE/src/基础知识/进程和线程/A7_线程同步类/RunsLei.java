package 基础知识.进程和线程.A7_线程同步类;
/*
    线程安全的类:
        StringBuffer
        Vector
        Hashtable

*/

import java.util.*;

public class RunsLei {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();    //synchronized方法，线程安全的
        StringBuilder sb2 = new StringBuilder();  //没有使用synchronized修饰

        Vector<String> ve = new Vector<>();          //synchronized方法，线程安全的
        ArrayList<String> list = new ArrayList<>();  //没有使用synchronized修饰

        Hashtable<String, String> ht = new Hashtable<>(); //synchronized方法，线程安全的
        HashMap<String, String> hm = new HashMap<>();     //没有使用synchronized修饰

        //==========================================================================
        /*
        一般来说,线程同步时，使用StringBuffer、Vector、Hashtable三个类来操作
        但是,Vector和Hashtable也不经常使用。
        使用,Collections 中的方法 来操作
                public static <T> List<T> synchronizedList(List<T> list)
                public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
                ......
        */

        List<String> array = Collections.synchronizedList(new ArrayList<String>());
        //array就是同步安全的了
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
        //map就是同步安全的了


    }

}
