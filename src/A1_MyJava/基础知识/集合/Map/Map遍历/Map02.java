package A1_MyJava.基础知识.集合.Map.Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map02 {

    public static void main(String[] args) {

        //多态创建集合
        Map<String, Integer> map = new HashMap<>();

        //添加键值对
        map.put("尴尬酱", 1);
        map.put("尴尬了", 2);
        map.put("尴尬帝", 3);
        map.put("真尴尬", 4);
        map.put("贼尴尬", 5);

        //创建键值对对象集合
        Set<Map.Entry<String, Integer>> entry = map.entrySet();

        //遍历
        for (/*Map.Entry<键,值>*/
            Map.Entry<String, Integer> me : entry) {
            //获得键和值
            String key = me.getKey();
            Integer value = me.getValue();
            System.out.println(key + "=" + value);
        }

    }

}
