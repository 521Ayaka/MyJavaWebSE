package 基础知识.集合.Map.Map练习.Map练习5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {
        new DameHashMap().init();
    }

    public void init(){

        //创建字符串
        System.out.println("请输入:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//扫描下一行，返回类型为String

        //创建一个HashMap集合
        HashMap<Character, Integer> map = new HashMap<>();

        //获得字符
        for (int i = 0; i<str.length(); i++){
            char key = str.charAt(i);

            Integer value = map.get(key);
            if (value == null){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
            }

        }

        //遍历HashMap   方法一
        Set<Character> keySet = map.keySet();
        for (Character keyL :keySet) {
            //获得值
            Integer value = map.get(keyL);
            //打印结果
            System.out.print(new StringBuilder().append(keyL).append("(").append(value).append(")"));
            //这里使用了StringBuilder()类，方法是append();
        }
        System.out.println();
        System.out.println("=====================================================");

        //遍历HashMap   方法二
        Set<Map.Entry<Character, Integer>> em = map.entrySet();
        for (Map.Entry<Character, Integer> keyToValue :em) {
            //获取键和值
            Character key = keyToValue.getKey();
            Integer value = keyToValue.getValue();
            //遍历字符串
            System.out.print(new StringBuilder().append(key).append("(").append(value).append(")"));

        }
    }

}
