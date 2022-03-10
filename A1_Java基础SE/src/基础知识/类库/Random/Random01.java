package 基础知识.类库.Random;

/*
1.导包
  import.java.util.Random;

2.创建
  Random r = new Random();

3.使用
这次来写个不带参数的

int x = r.nextInt();  //不带参数
Boolean y = r.nextBoolean();
.......

 */

import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean a ;
        for (int i = 0; i < 10; i++) {
            a = r.nextBoolean();
            System.out.println("随机真假值为：" + a);
        }
        System.out.println("=====================");

        int b ;
        for (int i = 0; i < 10; i++) {
            b = r.nextInt();
            System.out.println("随机数字为：" + b);
        }
    }
}
