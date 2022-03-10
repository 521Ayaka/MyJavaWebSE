package 基础知识.Lambda表达式.A3_Lambda使用前提;

public class RunLambda {

    public static void main(String[] args) {

        String str1 = "使用匿名内部类输出";
        String str2 = "使用Lambda表达式输出";
        int len1 = 666;

        //使用匿名内部类
        me(new MyInterface() {
            @Override
            public int method(String str, int lendX, int lendY) {
                System.out.print(str + "\t");
                System.out.println(lendX + lendY);//求和
                return lendX + lendY;
            }
        }, str1, len1);

        System.out.println("=========================");

        //使用Lambda表达式
        me((/*String*/ str,/*int*/ meLen,/*int*/ lenY) -> {
            //参数类型是可以省略的,但是如果多个参数,不能只省略一个,要省略就要省略完！
            System.out.print(str + "\t");
            System.out.println(meLen + lenY);//求和
            System.out.println("Lambda表达式更为简洁！");
            return meLen + lenY;
        }, str2, len1);


    }

    //该方法有一个参数是接口，该接口又只有一个抽象方法！
    public static void me(MyInterface e, String str, int len2) {
        //该方法调用的抽象方法。
        int num = e.method(str, len2, 6000);

        //测试返回值。
        System.out.println("返回值:" + num);
    }

}
