package A1_MyJava.基础知识.转型.向下转型;
/*
向上转型一定是安全的，没有问题的，正确的，但也有一个弊端：
对象一但向上转型为父类，那么就无法调用子类原本特有的内容。

解决方案：用对象的向下转型【还原】。

*/
public class Down {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

//      animal.catchMouse(); //错误写法。
        //使用向下转型
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //错误向下转型
        Dog dog = (Dog) animal;
        //错误写法，编译不会报错，但是运行会出现问题: java.lang.ClassCastException 【类型转换异常】

    }

}
