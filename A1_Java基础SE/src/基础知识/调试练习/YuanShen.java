package 基础知识.调试练习;
//导包

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
点赞
关注
谢谢
可以的话，给个十连发也行/偷笑。ありがとうございます
uid:派蒙好吃嗯
uid:136761371

*/
//开始程序的原神一天......
public class YuanShen {

    //打开游戏
    public static void main(String[] args) {

        //创建对象
        Scanner sc = new Scanner(System.in);

        //miHoYo 原神
        System.out.println("抵制不良游戏，拒绝盗版游戏。");
        System.out.println("注意自我保护，谨防受骗上当。");
        System.out.println("适度游戏益脑，沉迷游戏伤身。");
        System.out.println("合理安排时间，享受健康生活。");
        System.out.println("......");

        System.out.println("\n正在载入加载游戏数据...");

        System.out.println("点击任意处进入");//是否想进入
        System.out.println("是否想进入?yes?no?"); //输入你的想法。。。

        String ask;
        do {
            ask = sc.next();
            if ("yes".equals(ask)) {
                System.out.println("欢迎进入米忽悠！");
                method();//调用method方法，正式开始游戏
            } else if ("no".equals(ask)) {
                System.out.println("再见mHoYo  再见原神。");
            } else {
                System.out.println("心情复杂，听不懂，无法选择。");
            }
        } while (!"yes".equals(ask) && !"no".equals(ask));

    }


    //method正式开始游戏的方法=================================================================
    public static void method() {
        //创建对象
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        MyYuanShen my = new MyYuanShen();
        int YuanShi = my.getYuanShi();

        System.out.println("正在进入...");

        //是否月卡
        if (my.isYueKa()) {
            System.out.println("获得90原石");
            my.setYuanShi(my.getYuanShi() + 90);
        }

        //每日任务，打开任务
        System.out.println("=====每日任务=====");
        int yes =MeiRiWeiTuo();//调用下面的委托，并返回原石
        my.setYuanShi(my.getYuanShi()+yes);//加我我的原库屯
        System.out.println("传送\n蒙德城");
        System.out.println("冒险家协会\n凯瑟琳\n想着星......");
        System.out.println("感谢你玩......");
        System.out.println("原石+20");
        my.setYuanShi(my.getYuanShi()+20);//加我我的原库屯

        //今日获得原石数
        System.out.println("今日获得原石数："+(my.getYuanShi()-YuanShi));

        //派遣
        System.out.println("============================");
        System.out.println("冒险家协会\n凯瑟琳\n想着星......");
        System.out.println("派遣任务");
        my.setKuang1(my.getKuang1()+9*4);
        my.setKuang2(my.getKuang2()+7*4);
        my.setMoLa(my.getMoLa()+50000*2);

        //炼金台
        System.out.println("============================");
        System.out.println("炼金台\n瓦格纳\n嗯？什么是？");
        my.setKuang2(my.getKuang2()-5*4*4);
        System.out.println("再见！");

        //合成台
        System.out.println("============================");
        do {
            //是否点到蒂玛乌斯
            int kao =1;
            int xxx= ran.nextInt(2);
            if(kao == xxx){
                System.out.println("合成台\n蒂玛乌斯\n你好，你也对炼......");
                System.out.println("再见");
            }else{
                System.out.println("合成4个浓缩树脂");
                break;
            }
        }while(true);

        //祈祷
        System.out.println("============================");
        int yuan = my.getYuanShi()/160;

        for (int i = 0; i < yuan; i++) {

        }

        for (int i = 1; i <= yuan; i++) {
            System.out.println("兑换\n祈祷\n祈祷一次\n确定");
            System.out.println("恭喜获得：");
            System.out.println("以理服人");
            my.setYuanShi(my.getYuanShi()-160);//减去我的原库屯
            System.out.println("剩余原石："+my.getYuanShi());
        }
        System.out.println("祈祷完毕！");

        System.out.println("============================");

        //是否推出游戏
        System.out.println("是否推出游戏？yes？no？");
        String str;
        do {
            str = sc.next();
            if ("yes".equals(str)){
                System.out.println("退出游戏");
            }else if("no".equals(str)){
                System.out.println("挖矿去......");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }else{
                System.out.println("上保底歪了，性情复杂。。。");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }
        }while(!"yes".equals(str) && !"no".equals(str));

        //
    }



    //每日委托的方法=========================================================
    public static int MeiRiWeiTuo(){
        //创建对象
        MyYuanShen my = new MyYuanShen();
        Random ran = new Random();
        ArrayList<String> list = new ArrayList<>();

        //所有任务内容
        list.add("邪恶的入侵");
        list.add("攀高危险");
        list.add("临危受命");
        list.add("丘丘人的一小步");
        list.add("长驱植入");
        list.add("安全运输");
        list.add("危机运输");
        list.add("旅行者，我饿了");
        list.add("旅行者，打扫卫生");
        list.add("旅行者，去......");
        //太多了，什么事都让旅行者做

        //随机调用4个委托
        int yes = 0;
        ran.nextInt(list.size());
        for (int i = 0; i < 4; i++) {
            System.out.println("追踪");
            //提取委托索引值
            int index = ran.nextInt(list.size());
            String renwu = list.get(index);
            System.out.println(renwu);
            list.remove(index);//删除这个委托

            System.out.println("任务完成");
            System.out.println("原石+10");
            System.out.println("========");
            yes+=10;

        }

        return yes;
    }

}




