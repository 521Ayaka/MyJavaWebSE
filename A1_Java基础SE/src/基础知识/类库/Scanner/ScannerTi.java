package 基础知识.类库.Scanner;

import java.util.Scanner;
/*
题目要求：
1.使用Scanner类，计算两数和
2.尽量可能完善你的代码，使其更完整
*/
public class ScannerTi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        do {
            System.out.println("====欢迎使用尴尬的第一个java加法运算器====");
            System.out.println("请输入第一个加数：");
            int x = sc.nextInt();
            System.out.println("请输入第二个加数：");
            int y = sc.nextInt();
            int sum = x + y;
            System.out.println("计算结果为：" + sum);
            System.out.println("是否退出?（yes？no？）" );
            str = sc.next();
            while(!str.equals("yes")&& !str.equals("no")){
                System.out.println("尴尬听不懂欸 ≡(▔﹏▔)≡");
                System.out.println("请重新输入：yes？ no？");
                str = sc.next();
            }
        }while(str.equals("no"));
        System.out.println("=====感谢使用ヾ(≧▽≦*)o=====");
    }

}
