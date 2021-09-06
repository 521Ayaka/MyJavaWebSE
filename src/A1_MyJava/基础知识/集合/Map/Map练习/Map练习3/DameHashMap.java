package A1_MyJava.基础知识.集合.Map.Map练习.Map练习3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {
        //启动
        new DameHashMap().init();
    }

    //初始化
    public void init() {

        //初始化
        System.out.println("=========================");

        //创建ArrayList集合, 泛型为:< HapMap<T,V> >值。
        ArrayList<HashMap<String, String>> arrayMap = new ArrayList<>();

        //创建HashMap集合,并添加相应的键值对
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("孙策", "大桥");
        map1.put("周瑜", "小桥");
        HashMap<String, String> map2 = new HashMap<>();
        map1.put("郭靖", "黄蓉");
        map1.put("杨过", "小龙女");
        HashMap<String, String> map3 = new HashMap<>();
        map1.put("亚索", "瑞文");
        map1.put("艾希", "蛮王");

        //向ArrayList中添加HashMap对象。
        arrayMap.add(map1);
        arrayMap.add(map2);
        arrayMap.add(map3);

        //遍历ArrayList    方法一
        for (HashMap<String, String> mapH1 : arrayMap) {
            //获取map中的键集合
            Set<String> keySet = mapH1.keySet();
            for (String keyL : keySet) {
                //获得键对应的值
                String valueL = mapH1.get(keyL);
                //打印结果
                System.out.println(keyL + " 喜欢 " + valueL);
                System.out.println("-------------");
            }
        }

        System.out.println("=========================");

        //遍历ArrayList    方法二
        for (HashMap<String,String> mapH2: arrayMap) {
            //获取当前的键值对集合
            Set<Map.Entry<String, String>> em = mapH2.entrySet();
            //遍历HashMap集合
            for (Map.Entry<String, String> keyToValue :em) {
                //获得键
                String key = keyToValue.getKey();
                String value = keyToValue.getValue();
                //打印结果
                System.out.println(key + " 喜欢 " + value);
                System.out.println("-------------");

            }
        }
    }


}
