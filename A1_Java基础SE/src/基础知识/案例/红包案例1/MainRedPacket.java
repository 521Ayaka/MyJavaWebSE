package 基础知识.案例.红包案例1;

//导包


import java.util.ArrayList;
import java.util.Scanner;

//运行类
public class MainRedPacket {

    //main方法
    public static void main(String[] args) {

        //创建群主
        Manager gan = new Manager("尴尬酱", 521666.66);

        //创建尴尬的子民
        Member one = new Member("钟硕弟弟", 3.12);
        Member two = new Member("亚索哥哥", 666.66);
        Member three = new Member("永恩弟弟", 5.32);
        Member four = new Member("决斗大师", 888.5);
        Member five = new Member("最个性的网名", 165.88);

        //===========================================================

        //My余额
        gan.show();

        //子民的财产余额
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();

        System.out.println("=========================================");

        //创建Scanner类的对象，扫描键盘输入内容
        Scanner sc = new Scanner(System.in);

        //开始发钱

        //设置总金额
        System.out.println("红包总金额为：");
        double totalMoney = sc.nextDouble();

        //设置红包个数
        System.out.println("红包个数：");
        int count = sc.nextInt();

        //设置红包封面
        System.out.println("红包封面：");
        String str = sc.next();

        //向Manager类传入红包参数，返回包装好的红包
        ArrayList<Double> redList = gan.send(totalMoney, count);

        //红包已发出
        System.out.println("=========================================");
        System.out.println("=======" + str + "======\n");

        //子民们正在开始疯狂收红包
        one.receive(redList, gan.getMax());
        two.receive(redList, gan.getMax());
        three.receive(redList, gan.getMax());
        four.receive(redList, gan.getMax());
        five.receive(redList,gan.getMax());

        System.out.println("=========================================");

        //My的余额
        gan.show();

        //子民的余额
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();

        System.out.println("=========================================");

        //子民们在感谢我呢！
        System.out.println(one.getName()+":");    WanSui();//调用感谢我的方法。

        System.out.println(two.getName()+":");    WanSui();

        System.out.println(three.getName()+":");  WanSui();

        System.out.println(four.getName()+":");   WanSui();

        System.out.println(five.getName()+":");   WanSui();
    }

    //感谢我的方法  //切记要用static关键字进行修饰。。。
    public static void WanSui(){
        System.out.println("尴尬酱万岁ヾ(^▽^*)))\n");
    }

}