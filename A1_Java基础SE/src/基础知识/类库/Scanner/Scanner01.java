package 基础知识.类库.Scanner;

import java.util.Scanner; //导包

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //创建

        int i = sc.nextInt();
        System.out.println("==================");
        System.out.println("输入的数字为：" + i);

        System.out.println("==================");
        String str = sc.next();
        System.out.println("==================");
        System.out.println("输入的字符串为：" + str );
    }
}
