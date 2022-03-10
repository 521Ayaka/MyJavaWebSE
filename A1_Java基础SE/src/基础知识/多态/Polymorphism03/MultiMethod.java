package 基础知识.多态.Polymorphism03;
/*

在多态的代码当中，成员方法的访问规则是：
     看new的谁，就有先用谁，没有则向上找

口诀: 编译看左边，运行看右边。 [成员变量除外]

*/
public class MultiMethod {

    public static void main(String[] args) {

        Fu obj = new Zi();

        obj.method();

        obj.methodFu();

        //编译看左边，左边是Fu，Fu当中没有methodZi()方法，所以编译报错。
//      obj.methodZi(); //错误写法 多态中不会向下找子类

    }

}
