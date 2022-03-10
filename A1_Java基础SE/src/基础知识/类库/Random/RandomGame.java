package 基础知识.类库.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        System.out.println("已生成100以内的整数");
        while( true ){
            System.out.println("请输入你的猜测：");

            int x = sc.nextInt();
            if( x > num){
                System.out.println("输入的数字太大了，请重新输入：");
            }else if( x < num ){
                System.out.println("输入的数字太小了，请重新输入：");
            }else{
                System.out.println("恭喜你，答对了！");
                break;
            }

        }
    }
}
