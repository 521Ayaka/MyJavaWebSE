package A1_MyJava.基础知识.考试作业.第一次作业.题目4;
/*
这个就定义称为一个工具类吧!

定义一个工具类要：

构造方法私有化，就不能创建对象了

成员方法静态化，这样就可以通过一个类直接调用方法了！

*/
public class SquareGongJv extends Rect{

    //这里我定义了两个常量，a=8时的面积和周长。
    //工具类可以弄点常量，比如说想Math的PI量。
    public static double A8_T0_MJ = 64;
    public static double A8_T0_ZC = 32;

    //构造方法私有化，无法创建对象
    private SquareGongJv() {
    }

    //原有方法为非静态，静态有不能调用非静态，所以舍弃了原有方法
    public static double MJ(double a){
        return Math.pow(a,2);
    }

    public static double ZC(double a){
        return 4*a;
    }


}
