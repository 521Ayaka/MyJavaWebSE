package A1_MyJava.基础知识.调试练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Chou {

    public static RewardBean rb = new RewardBean();
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    //用一个map来统计记录
    private static Map<String,Integer> map = new HashMap<String,Integer>();

    public static void main(String[] args) {

        System.out.println("请输入1：单抽或者10：十连抽,输入0退出");
        //获得用户输入的1或者10

        //初始化map
        map.put("总数",0);
        map.put("四星",0);
        map.put("五星",0);
        //保底计数器
        map.put("count4",0);
        map.put("count5",0);

//        System.out.println(map.toString());

        boolean flag = true;
        while (flag) {
            int coin = sc.nextInt();

            switch (coin) {
                case 1: {
                    run();
                    break;
                }
                case 10: {
                    for (int i=0 ; i<10 ; i++){
                        run();
                    }
                    break;
                }
                default:
                    System.out.println("退出。。。");
                    flag=false;
                    break;
            }
            System.out.println(map.toString());
        }

    }

    //模拟抽卡方法
    private static void run(){
        /*随机一个数字，根据数字的值的范围来决定抽出什么卡，伪随机：
        0到5：5星（0.6%）
        10到60：4星（5.1%）
        其他：3星*/
        int ran1 = random.nextInt(1000);

        /*System.out.println("run方法");
        System.out.println(map.toString());*/
        int count4 = map.get("count4");
        int count5 = map.get("count5");

        //先看是否有4星保底，并且同时没有5星保底（因为两者同时保底会选择触发5星的保底，所以不会出现4星）
        //当4星计数器达到9以上时，并且不触发5保底时，触发保底机制:0.06%为5,99.4%为4
        if(count4 >= 9 && count5 < 89){
            System.out.println("触发4星保底，计数器为："+count4);
            Random random4 = new Random();
            int ran4 = random4.nextInt(1000);
            if(ran4 < 6){
                rb.get(5);
                int num = map.get("五星");
                //出5星后，5星保底计数器count5归零
                map.put("五星",num+1);
                map.put("count5",0);
            }else{
                rb.get(4);
                int num = map.get("四星");
                //出4星，5星保底计数器count5+1
                map.put("四星",num+1);
                map.put("count5",count5+1);
            }
            //4星保底清零
            map.put("count4",0);
        }
        //当随机数为0到5（0.6%概率）或者5星保底数达到89（第90必5）的时候，出现5星
        else if (ran1 < 6 || count5 == 89) {
            System.out.println("出5星了！计数器为："+count5);
            rb.get(5);
            int num = map.get("五星");
            //出5星后，计数器count5归零
            map.put("五星",num+1);
            map.put("count5",0);
            //4星保底计数+1
            map.put("count4",count4+1);
        }

        //当随机数为10到60时（5.1%概率）时，出现4星
        else if ((10 <= ran1 && ran1 < 61) ) {
            System.out.println("出4星了,非保底，计数器为："+count4);
            rb.get(4);
            int num = map.get("四星");
            map.put("四星",num+1);
            //计数器清零
            map.put("count4",0);
            //5星保底计数+1
            map.put("count5",count5+1);
        }
        //3星情况，保底计数各+1
        else {
            rb.get(3);
            //出3星的时候，45星保底计数各+1
            map.put("count4",count4+1);
            map.put("count5",count5+1);
        }
        map.put("总数",map.get("总数")+1);
        System.out.println("============================");
    }

    //内部类
    public static class RewardBean {

        public void get(int level){
            //根据星级打印几星物品
            for(int i = 0 ; i < level ; i++){
                System.out.print("★");
                if(i == level-1){
                    System.out.println("物品");
                }
            }

        }
    }
}
