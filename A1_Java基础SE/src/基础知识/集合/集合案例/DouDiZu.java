package 基础知识.集合.集合案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZu {

    private String userName1 = "尴尬了";
    private String userName2 = "尴尬帝";
    private String userName3 = "尴尬酱";

    //启动
    public static void main(String[] args) {
        new DouDiZu().init();
    }

    //初始化
    public void init() {

        //创建牌盒，使用ArrayList数组
        ArrayList<String> list = new ArrayList<>();

        //创建花色组
        String[] colors = {"方块", "红桃", "黑桃", "红桃"};
        //创建牌点数
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //将num添加到colors中
        for (String color : colors) {
            for (String num : nums) {
                list.add(color + num);
            }
        }
        //添加大小王
        list.add("小王");
        list.add("大王");

        //进行洗牌使用Collections的shuffle()静态方法
        Collections.shuffle(list);

        //创建3数组，分别存储3个人的牌数
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        //分牌，使用普通for循环
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i >= list.size() - 3) {
                dp.add(str);
            } else if (i % 3 == 0) {
                user1.add(str);
            } else if (i % 3 == 1) {
                user2.add(str);
            } else if (i % 3 == 2) {
                user3.add(str);
            }
        }
        //进行对牌的排序
        HashMap<String, Integer> map = new HashMap<>();



        //调用查看牌的方法
        Value(userName1, user1);
        Value(userName2, user2);
        Value(userName3, user3);
        Value("底牌数", dp);


    }

    //对用户的牌排序
    public static void sort(String userName,ArrayList<String> list){
        HashMap<String, String> map = new HashMap<>();
        //利用Map集合存储牌和牌的个数

    }

    //查看牌数的方法。
    public static void Value(String name, ArrayList<String> array) {
        System.out.println("姓名：" + name);
        System.out.print("牌为：");
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println("\n===============================================================================================");
    }

}
