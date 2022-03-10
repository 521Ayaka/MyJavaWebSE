package 基础知识.集合.集合案例;
/*
 * 存储使用 HashMap
 * 洗牌使用 ArrayList
 * 用户呈现 TreeSet
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class DouDiZuNew {

    //创建用户信息
    private String userName1 = "尴尬了";
    private String userName2 = "尴尬帝";
    private String userName3 = "尴尬酱";
    //创建牌色和牌数
    private String[] colorOf = {"方块", "红桃", "黑桃", "红桃"};
    private String[] numOf = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    //用户的牌,   创建用户牌容器, 使用TreeSet集合，进行排序，使用自然排序(升序)
    private TreeSet<Integer> user1 = new TreeSet<>();
    private TreeSet<Integer> user2 = new TreeSet<>();
    private TreeSet<Integer> user3 = new TreeSet<>();
    private TreeSet<Integer> hands = new TreeSet<>();


    /**
     * 启动
     */
    public static void main(String[] args) {
        //启动
        new DouDiZuNew().init();
    }

    /**
     * 初始化
     */
    public void init() {

        //创建HashMap集合
        HashMap<Integer, String> map = new HashMap<>();

        //创建牌容器,这里存储的是HashMap集合中的键值 index
        ArrayList<Integer> list = new ArrayList<>();

        /**操作数组：*/
        //调用存储牌，存储编号
        this.hashMapAdd(map, list);

        //调用洗牌
        this.shuffle(list);

        //调用发牌
        this.distribute(list, map);
        System.out.println(list);

        //调用查看用户牌
        look(userName1, user1, map);
        look(userName2, user2, map);
        look(userName3, user3, map);

    }

    /**
     * ================================================================================
     */

    //向HashMap中存储牌数 , 并且向ArrayList集合当中添加键值编号
    public void hashMapAdd(HashMap<Integer, String> map, ArrayList<Integer> list) {
        //初始化点数
        int index = 0;
        //先是numOf进行循环, 保证TreeSet可以正常排序。
        for (String num : numOf) {
            for (String color : colorOf) {
                //向map中添加键值对
                map.put(index, color + num);
                //向ArrayList添加键值编号
                list.add(index);
                //index++
                index++;
            }
        }
        //添加大小王
        map.put(index, "小王");
        list.add(index);
        index++;
        map.put(index, "大王");
        list.add(index);
    }

    //重新洗牌
    public void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    //发牌的方法
    public void distribute(ArrayList<Integer> list, HashMap<Integer, String> map) {
        for (int i = 0; i < list.size(); i++) {
            if (i >= 54) {
                hands.add(list.get(i));
            } else if (i % 3 == 0) {
                user1.add(list.get(i));
            } else if (i % 3 == 1) {
                user2.add(list.get(i));
            } else if (i % 3 == 2) {
                user3.add(list.get(i));
            }
        }
    }

    //查看牌 , 用户呈现排序
    public void look(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
        System.out.println("姓名:" + name);
        System.out.print("牌数为:");
        int in = 1;
        for (Integer index : set) {
            if (in < set.size()) {
                System.out.print(map.get(index) + " , ");
            } else {
                System.out.print(map.get(index + "。"));
            }
            in++;
        }
        System.out.println();
        System.out.println("=============================================================================================================================================");
    }
}
