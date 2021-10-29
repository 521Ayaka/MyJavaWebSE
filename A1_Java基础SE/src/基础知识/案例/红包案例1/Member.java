package 基础知识.案例.红包案例1;
//导包
import 基础知识.继承.Extends11案例.User;

import java.util.ArrayList;
import java.util.Random;

//普通成员的类   //子民的类  子类
public class Member extends User {

    //传入子民的参数信息
    public Member(String name, double money) {
        super(name, money); //调用父类构造方法，打印对象信息。
    }

    //普通成员收红包的方法
    public void receive(ArrayList<Double> list, double max) {

        //创建随机int数字
        int index = new Random().nextInt(list.size());
        //向list集合当中提取单个红包
        Double delta = list.remove(index);

        //打印抢到的红包金额，并判断谁的金额最大。
        if (max == delta){
            System.out.println("===(≧v≦)?幸运王o((>ω< ))o===");
            System.out.println(super.getName()+",抢到"+delta+"元。");
            System.out.println();
        }else{
            System.out.println(super.getName()+",抢到"+delta+"元。");
            System.out.println();
        }
        //得到红包并返回到总余额当中
        double money = super.getMoney();
        super.setMoney(money + delta);
    }

}