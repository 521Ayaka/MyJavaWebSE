package 基础知识.类库.Random;

import java.util.Random;

/*

获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2

计算：随机范围为 [10，80] 之间的int数字
 */
public class Random02 {
    public static void main(String[] args) {
        Random r = new Random();
        int x;
        for (int i = 0; i < 100; i++) {
            x = r.nextInt(71) + 10;
            System.out.println("[10,80]之间的随机数为：" + x);
        }

    }
}
