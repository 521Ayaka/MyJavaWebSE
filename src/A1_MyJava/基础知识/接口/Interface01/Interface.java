package A1_MyJava.基础知识.接口.Interface01;
/*
接口就是多个类的公共类规范。
接口是一种引用数据类型，最重要的内容就是其中的：抽象类型。

如何定义一个接口：
public interface 接口名称{
     //接口内容。
}
把class关键字换为interface关键字，接口名定义规则和之前一样。

===================================================================

备注：换成interface关键字之后，编译生成的字节码文件仍然是： .java ——> .class

===================================================================

如果是Java 7,那么接口的内容可以包含有：
1.常量
2.抽象方法

如果是Java 8,还可以额外包含有：
3.默认方法
4.静态方法

如果是Java 9,还可以额外包含有：
5.私有方法

===================================================================

接口的使用步骤：
1. 接口不能直接使用，必须有一个 “实现类” 来 “实现” 该接口。
   格式：
   public class 实现类名称 implements 接口名称{
        //......
   }

2. 接口的实现类必须覆盖重写 “实现” 所有的抽象方法。
   @Override 格式：
   去掉abstract 加上方法体{} 方法体内写入相应的数据。

3. 创建实现类的对象，进行使用。

注意事项：
“实现类” 如果没有全部覆盖重写接口当中的所有抽象方法，
那么这个 “实现类” 就必须是个抽象类，abstract。

*/
public class Interface  {

    public static void main(String[] args) {

        //错误写法，不能直接创建接口对象。！！！！
        /*
        MyInterfaceAbstract jie = new MyInterfaceAbstract();
        */

        //创建 “实现类” 对象。
        MyInterfaceAbstractImpl Impl = new MyInterfaceAbstractImpl();
        Impl.methodAbs1();
        Impl.methodAbs2(666);
        Impl.methodAbs3();
        Impl.methodAbs4(666);
    }

}
