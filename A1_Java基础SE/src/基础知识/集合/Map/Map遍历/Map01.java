package 基础知识.集合.Map.Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

    public static void main(String[] args) {

        //多态创建集合
        Map<String, Integer> map = new HashMap<>();

        //添加键值对
        map.put("尴尬酱", 1);
        map.put("尴尬了", 2);
        map.put("尴尬帝", 3);
        map.put("真尴尬", 4);
        map.put("贼尴尬", 5);

        //创建键的集合
        Set<String> key = map.keySet();

        //遍历
        for (String strKey: key){
            //通过获取的键，获得相应的值
            Integer value = map.get(strKey);
            //输出/遍历
            System.out.println(strKey+"="+value);
        }


    }

}
