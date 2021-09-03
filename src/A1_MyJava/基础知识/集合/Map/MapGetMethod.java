package A1_MyJava.基础知识.集合.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合获取功能:

V get(Object key)                  根据键获取值

Set<K> keySet()                    获取所有键的集合

Collection<V> values()             获取所有值的集合

Set<Map.Entry<K,V>> entrySet()     获取所有键值对对象的集合

*/
public class MapGetMethod {

    public static void main(String[] args) {

        //创建Map集合
        Map<String, String> map = new HashMap<>();

        //添加键值对
        map.put("吟留的诗人","温迪");
        map.put("天动万象","钟离");
        map.put("无想的一刀","巴尔");
        map.put("亡","草神");
        System.out.println("==================================");

        // V get(Object key)                  根据键获取值
        System.out.println(map.get("无想的一刀")); //巴尔
        System.out.println(map.get("天动万象"));  //钟离
        System.out.println(map.get("神罗天征"));  //null
        System.out.println("==================================");

        //Set<K> keySet()                    获取所有键的集合
        System.out.println(map.keySet());//可直接打印
        Set<String> setMap = map.keySet();//可创建集合获取
        System.out.println("键集合遍历:");
        for (String str :
                setMap) {
            System.out.println(str);
        }
        System.out.println("==================================");

        //Collection<V> values()             获取所有值的集合
        Collection<String> values = map.values();
        System.out.println("值集合便利:");
        for (String str :
                values) {
            System.out.println(str);
        }
        System.out.println("==================================");

    }

}
