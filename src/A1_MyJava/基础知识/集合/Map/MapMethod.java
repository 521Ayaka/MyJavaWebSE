package A1_MyJava.基础知识.集合.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map集合的基本功能

V put(K key, V value)                 添加键值对
V remove(Object key)                  根据键删除键值对元素
void clear()                          移除所有的键值对元素
boolean containsKey(Object key)       判断集合是否包含指定的键
boolean containsKey(Object value)     判断集合是否包含指定的值
int size()                            集合的长度，也就是集合中键值对的个数
boolean isEmpty()                     判断集合是否为空
*/
public class MapMethod {

    public static void main(String[] args) {

        //多态创建Map集合对象
        Map<String, String> map = new HashMap<String,String>();

        //V put(K key, V value)                 添加键值对
        map.put("吟留的诗人","温迪");
        map.put("天动万象","钟离");
        map.put("无想的一刀","巴尔");
        map.put("亡","草神");
        System.out.println(map);

        //V remove(Object key)                  根据键删除键值对元素
        map.remove("亡");
        System.out.println(map);

        //void clear()                          移除所有的键值对元素
        map.clear();
        System.out.println(map);

        //重新添加回来
        map.put("吟留的诗人","温迪");
        map.put("天动万象","钟离");
        map.put("无想的一刀","巴尔");
        System.out.println("重新添加回来：" + map);

        //boolean containsKey(Object key)       判断集合是否包含指定的键
        System.out.println(map.containsKey("无想的一刀"));
        System.out.println(map.containsKey("亡"));

        //boolean containsKey(Object value)     判断集合是否包含指定的值
        System.out.println(map.containsValue("巴尔"));
        System.out.println(map.containsValue("草神"));

        //int size()                            集合的长度，也就是集合中键值对的个数
        System.out.println("键值队个数：" + map.size());

        //boolean isEmpty()                     判断集合是否为空
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println("clear后：" + map.isEmpty());


    }

}
