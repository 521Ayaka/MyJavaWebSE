package 基础知识.考试作业.第一次作业.题目4;
/*
就当复习了
这个类就定义为【标准类】

一个标准的类有:

成员方法私有化
GetSet方法调用更安全。

有参构造 和 无参构造

必要的时候重写toString()方法 ，equals()方法就没那么必要了

*/
public class Circle implements Shape{

    //成员方法私有化 使用GetSet方法调用
    private double S;
    private double Z;

    //无参构造
    public Circle() {
    }

    //有参构造
    public Circle(double s, double z) {
        S = s;
        Z = z;
    }

    //实现接口
    @Override
    public double MJ(double a, double b) {
        S = Math.pow(a,2) * Math.PI;
        return 0;
    }

    //实现接口
    @Override
    public double ZC(double a, double b) {
        Z = 2 * a * Math.PI;
        return 0;
    }

    //GetSet方法
    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }
}
