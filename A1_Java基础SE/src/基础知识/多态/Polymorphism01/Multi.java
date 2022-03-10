package 基础知识.多态.Polymorphism01;
/*
代码当中体现多态性，其实就一句话，【父类引用指向子类对象】。

格式：
父类名称 对象名称 = new 子类名称();
或者：
接口名称 对象名称 = new 实现类名称();

*/
public class Multi {

    public static void main(String[] args) {

        Fu obj = new Zi();

        obj.method();

        obj.methodFu();
      //obj.methodZi(); //编译错误?

    }

}
