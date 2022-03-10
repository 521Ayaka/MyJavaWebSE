package 基础知识.类库.Scanner;

import java.util.Scanner;

public class ScannerTi02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("========欢迎使用尴尬的java加法计算器========");
            System.out.println("请输入第一个加数：");
            double a = sc.nextDouble();
            System.out.println("请输入第二个加数：");
            double b = sc.nextDouble();
            double sum = a + b;
            System.out.println("计算结果为：" + sum);
            System.out.println("是否退出嘞？yes？no？");
            String str = sc.next();
            if(!str.equals("yes")&& !str.equals("no")){
                System.out.println("尴尬听不懂欸 ≡(▔﹏▔)≡");
                System.out.println("是否退出嘞？yes？no？");
                str = sc.next();
            }
            if(str.equals("yes")){
                System.out.println("=====感谢使用ヾ(≧▽≦*)o=====");
                break;
            }else{
                System.out.println("欢迎继续使用ヾ(?ω?`)o");
                System.out.println("=======================================");
            }


        }

    }

}
