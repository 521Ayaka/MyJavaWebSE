package 基础知识.反射.A4_反射获取构造器方法;
/*
通过反射获取 基础知识.反射.A3_获取class类的对象.Student类的构造器。

第一步: 使用Class类中的forName方法获取class对象


【获取公共的构造器 数组】:
        Constructor<?>[]	getConstructors()
        返回包含一个数组 Constructor对象反射由此表示的类的 [所有公共构造] 类对象。

【获取所有的构造器 数组】:
        Constructor<?>[]	getDeclaredConstructors()
        返回一个反映 Constructor对象表示的类声明的 [所有 Constructor对象的数组] 类 。

===================================================================================

【获取公共的构造器】
        Constructor<T>	getConstructor(class<?>... parameterTypes)
        返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。


【获取所有的构造器】:
        Constructor<T>	getDeclaredConstructor(class<?>... parameterTypes)
        返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。

----------------------------------------------------------------------------------

参数: 你要获取的构造器方法的参数个数和参数类型对应的字节码文件对象。

类
    Constructor提供了一个类的单个构造函数的信息和访问。

Constructor中 有一个方法:
    T newInstance(Object... initargs)
    使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructor {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //先创建class类对象
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");

        System.out.println("\n=================================================\n");

        //Constructor<?>[]	getConstructors()
        //返回包含一个数组 Constructor对象反射由此表示的类的 [所有公共构造] 类对象。
        Constructor<?>[] cons1 = c.getConstructors();//返回可用Object数组 接收。
        //便利一下
        for (Constructor<?> con : cons1) {
            System.out.println(con);
        }
        /*运行结果:

        public 基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int,java.lang.String)
        public 基础知识.反射.A3_获取class类的对象.Student()

        */

        System.out.println("\n=================================================\n");


        //Constructor<?>[]	getDeclaredConstructors()
        //返回一个反映 Constructor对象表示的类声明的 [所有 Constructor对象的数组] 类 。
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        //遍历一下
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }
        /*运行结果:

        public 基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int,java.lang.String)
        基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int)
        private 基础知识.反射.A3_获取class类的对象.Student(java.lang.String)
        public 基础知识.反射.A3_获取class类的对象.Student()

        */

        System.out.println("\n=================================================\n");

        //Constructor<T>	getConstructor(class<?>... parameterTypes)
        //返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。

        //Constructor<T>	getDeclaredConstructor(class<?>... parameterTypes)
        //返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。

        /**
         参数: 你要获取的构造器方法的参数个数和参数类型对应的字节码文件对象。

         类
         Constructor提供了一个类的单个构造函数的信息和访问。

         Constructor中 有一个方法:
         T newInstance(Object... initargs)
         使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。

         */

        Constructor<?> con1 = c.getConstructor();
        Object obj1 = con1.newInstance();
        System.out.println(obj1 + "\n");//运行结果: Student{name='null', age=0, id='null'}

        //public 基础知识.反射.A3_获取class类的对象.Student(java.lang.String,int,java.lang.String)
        Constructor<?> con2 = c.getConstructor(String.class, int.class, String.class);
        Object obj2 = con2.newInstance("尴尬酱", 9, "20200200");//这里放入参数
        System.out.println(obj2);//Student{name='尴尬酱', age=9, id='20200200'}


    }

}
