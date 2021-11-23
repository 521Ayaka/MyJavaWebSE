
import java.util.Arrays;
import java.util.Scanner;

public class StuTest {

    public static void main(String[] args) {
        //启动
        new StuTest().init();
    }

    //初始化
    public void init(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程的三门学习成绩:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        System.out.println("====计算结果为:====");
        System.out.println("====总分为:"+sum(num1, num2, num3) + "=====");
        System.out.println("====平均分为:"+ avg(num1, num2, num3) + "===");

    }

    //总成绩
    public double sum(double ... array){
        //计算并返回
        return Arrays.stream(array).sum();
    }

    //平均分
    public double avg(double ... array){
        double num = Arrays.stream(array).sum();
        if(num <= 0){
            return 0;
        }else {
            return num/array.length;
        }
    }

}
