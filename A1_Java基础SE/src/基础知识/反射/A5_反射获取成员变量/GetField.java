package 基础知识.反射.A5_反射获取成员变量;
/*
通过反射获取 成员变量:

获取公共成员变量 数组:
        Field[]	getFields()
        返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。

获取所有成员变量 数组:
        Field[]	getDeclaredFields()
        返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。

=======================================================================================

获取公共成员变量的一个:
        Field[]	getFields(String name)

获取所有成员变量中的一个:
        Field[]	getDeclaredFields(String name)

参数是: 成员变量名称

=======================================================================================

Field类当中有一个方法:
        void set(Object obj, Object value)
        将指定对象变量上此 Field 对象表示的字段设置为指定的新值。

*/


import 基础知识.反射.A3_获取class类的对象.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetField {

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {

        //首先创建class对象
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");

        method1(c);//test: getFields
        method2(c);//test: getDeclaredFields

        method3(c);//test: getField
        method4(c);//test: getDeclaredField

        method5(c);//使用
        //TODO: 具体看练习 解决方案

    }


    public static void method1(Class<?> c) {
        System.out.println("======================================================================\n");
        //获取公共成员变量。
        Field[] fs = c.getFields();
        //遍历
        for (Field f : fs) {
            System.out.println(f);
        }
        /*运行结果:

        //只有公共成员变量
        public java.lang.String 基础知识.反射.A3_获取class类的对象.Student.id

        */
        System.out.println("\n======================================================================\n");
    }


    public static void method2(Class<?> c) {
        //获取c的所有成员变量
        Field[] fs = c.getDeclaredFields();
        //遍历
        for (Field f : fs) {
            System.out.println(f);
        }/*运行结果:

        private java.lang.String 基础知识.反射.A3_获取class类的对象.Student.name
        int 基础知识.反射.A3_获取class类的对象.Student.age
        public java.lang.String 基础知识.反射.A3_获取class类的对象.Student.id

        */
        System.out.println("\n======================================================================\n");
    }

    public static void method3(Class<?> c) throws NoSuchFieldException {
        //获取单个公共成员变量
        Field f = c.getField("id");//参数是 [成员变量名]
        System.out.println(f);
        /*运行结果:

        public java.lang.String 基础知识.反射.A3_获取class类的对象.Student.id

        */
        System.out.println("\n======================================================================\n");
    }


    public static void method4(Class<?> c) throws NoSuchFieldException {
        //获取全部当中的单个成员变量


        //获取: 默认成员变量 int age;
        Field age = c.getDeclaredField("age");
        System.out.println(age);
        //运行结果: int 基础知识.反射.A3_获取class类的对象.Student.age


        //获取: 私有成员变量 private String name;
        Field name = c.getDeclaredField("name");
        System.out.println(name);
        //运行结果: private java.lang.String 基础知识.反射.A3_获取class类的对象.Student.name

        System.out.println("\n======================================================================\n");
    }


    public static void method5(Class<?> c) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //获取: 私有成员变量 private String name;
        Field name = c.getDeclaredField("name");
        //获取: 默认成员变量 int age;
        Field age = c.getDeclaredField("age");
        //获取: 公共成员变量 public int id;
        Field id = c.getDeclaredField("id");

        //反射获取c的构造器对象。
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // stu.id = id; 这种方法使用是错误的
        /*
        Field类当中有一个方法:
                void set(Object obj, Object value)
                将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
        */
        //name.set(obj,"尴尬酱"); //name是私有成员变量
        //age.set(obj,9);        //age是默认成员变量
        //解决方法:  看练习
        //TODO: 具体看练习 解决方案
        id.set(obj, "202002");

        /*
        给obj的 [成员变量 id] 赋值为 202002
        */

        System.out.println(obj);
        /*

        Student{name='null', age=0, id='202002'}

        */

    }


}
