package A1_MyJava.基础知识.集合.Map.Map练习.Map练习4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    //启动
    public static void main(String[] args) {
        new DameHashMap().init();
    }

    //初始化
    public void init(){
        //初始化
        System.out.println("==============================");

        //创建HashMap, 泛型为 < String, ArrayList<String> >
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //创建三个ArrayList并添加元素, 泛型为 < String >
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("郭靖");
        list1.add("黄蓉");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("亚索");
        list2.add("瑞文");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("岩神");
        list3.add("雷神");

        //向HashMap集合中添加键，值为ArrayList
        map.put("相爱",list1);
        map.put("想杀",list2);
        map.put("故人",list3);

        //遍历HashMap集合     方法一
        Set<String> keySet = map.keySet();
        for (String keyL :keySet) {
            //获得键值
            ArrayList<String> valueL = map.get(keyL);
            //遍历集合
            for (String str :valueL) {
                //打印结果
                System.out.println("==="+keyL+"===");
                System.out.println(str);
            }
            System.out.println("===============");
        }

        System.out.println("==============================");

        //遍历HashMap集合     方法二
        Set<Map.Entry<String, ArrayList<String>>> em = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> keyToValue :em) {
            //获得键
            String key = keyToValue.getKey();
            ArrayList<String> value = keyToValue.getValue();
            //遍历ArrayList
            for (String str :value) {
                //打印结果
                System.out.println("==="+key+"===");
                System.out.println(str);
            }
            System.out.println("===============");
        }

    }

}
