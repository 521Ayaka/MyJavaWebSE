package 基础知识.类库.LeiShuoming;

/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。

1. 导包：也就是指出需要使用的类，在什么位置。
import 包名称.类名称;
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2. 创建，格式：
类名称 对象名 = new 类名称();
Student stu = new Student();

3. 使用，分为两种情况：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
（也就是，想用谁，就用对象名点儿谁。）

注意事项：
如果成员变量没有进行赋值，那么将会有一个默认值，规则和数组一样。
 */
public class LeiDiaoYong01 {
    public static void main(String[] args) {
        //1.导包
        //在同一文件夹下的类调用是不需要导包

        //2.创建
        Lei01 onelei = new Lei01();//重点
        System.out.println(onelei.x);
        System.out.println(onelei.y);

        //3.使用
        //使用成员变量
        onelei.ganga01(/*参数*/);//这里不用参数
        //使用成员方法
        onelei.ganga02(/*参数*/);
        System.out.println("================================================");
//=============================================================

        onelei.x = "尴尬酱可爱！";
        onelei.y = 2333333;
        System.out.println(onelei.x + onelei.y);

        onelei.nani();
    }
}
