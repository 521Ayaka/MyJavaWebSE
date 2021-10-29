package 基础知识.继承.Extends11案例;

//导包
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//群主的类   //子类
public class Manager extends User {

    //群主的参数信息
    public Manager(String name, double money) {
        super(name, money); //调用父类构造方法，打印对象信息。
    }

    //群主独有的发红包方法
    public ArrayList<Double> send(double totalMoney, int count) {

        ArrayList<Double> redList = new ArrayList<>();

        //群主的余额
        double leftMoney = this.getMoney();
        //判断红包金额是否大于当前余额
        if(totalMoney > leftMoney) {
            System.out.println("当前余额不足！");
            return redList;
        }

        //传入群主剩余的钱数，super进行调用，别忘了GetSet方法当中，setMoney(参数)是进行传入父类数据的！！！
        super.setMoney(super.getMoney() - totalMoney);

        //分红包 单个红包金额
        Random r = new Random();

        //定义两个double num是前n-1个和的钱，yv-num是为了计算剩余的零钱。
        double num = 0;
        double yv = totalMoney;
        //包装红包
        for (int i = 0; i < count; i++) {
            if(i == 0){
                num = r.nextInt((int)(totalMoney/2)); //第一个范围在totalMoney的半。减少方差
                totalMoney = totalMoney - num;
            }else if (i == count - 1){
                double x;
                double y = 0;
                for (int j = 0; j < redList.size(); j++) {
                    x = redList.get(j);
                    y = y + x;
                }
                num = yv - y;
            }else{
                num = r.nextInt((int) totalMoney);
                totalMoney = totalMoney - num;
            }
            redList.add(num); //向集合中添加元素金额。
        }
        //进行打乱数组，还没还没学到，网上找的。
        Collections.shuffle(redList);

        //最大的红包max。
        double max = redList.get(0);;
        for (int i = 0; i < redList.size(); i++) {
            if (redList.get(i) > max){
                max = redList.get(i);
            }
        }
        super.setMax(max); //使用setMax()向父类传入max

        return redList;  //返回红包
    }
}
