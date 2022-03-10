package 基础知识.反射.A3_获取class类的对象;
/*
想通过反射去使用一个类,
首先我们要 [获取到该类的字节码文件对象] ,
也就是类型为Class类型的对象。

获取Class类型的对象的 三种方式:

1. 使用类的class属性来获取类对象的Class对象。
        举例: Student.class 将返回Student类对象的Class对象。

2. 调用对象的getClass()方法, 返回该对象所属类对应的Class对象
        该方法是Object类中的方法, 所有的Java对象都可以调用该方法。

3. 使用Class类中的静态方法forName(String className),
        该方法需要传入字符串参数,该字符串参数的值是某个类的全部路径
        也就是完整包的路径。


[总结]:
    第一种方式最简单, 只需要用类去调用class属性就可以了
    第二种方式需要创建对象, 通过对象获取
    第三种方式交复杂, 需要地址, 但是灵活性很高。

*/

public class GetClassObj {

    public static void main(String[] args) throws ClassNotFoundException {

        //方式一: 使用类的class属性来获取类对象的Class对象。
        Class<Student> class1 = Student.class;
        //对象的类是 [Class], 泛型是获取 [对象的类]。
        System.out.println(class1);
        //结果:  class 基础知识.反射.A3_获取class类的对象.Student

        Class<Student> class2 = Student.class;
        System.out.println(class1 == class2); //返回为true

        //===================================================

        //方式二: 调用对象的getClass()方法, 返回该对象所属类对应的Class对象
        //调用对象就要先有对象
        Student stu = new Student();
        Class<? extends Student> class3 = stu.getClass();
        System.out.println(class1 == class3);//返回为true

        //===================================================

        //方式三: 使用Class类中的静态方法forName(String className)
        //该方式需要创建一个Class类对象, 泛型不知道为<?>
        Class<?> class4 = //Class类中有一个forName("路径") 的方法
                Class.forName("基础知识.反射.A3_获取class类的对象.Student");
                //forName方法 需要抛出异常。
        System.out.println(class1 == class4);

    }

}
