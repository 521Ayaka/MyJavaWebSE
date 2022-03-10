package 基础知识.反射.A4_反射获取构造器方法.练习1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstance01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        //获取class对象
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");

        //获取这个构造器：public Student(String name, int age, String id)
        //静态的用getConstructor方法, 参数三个class对象。
        Constructor<?> con = c.getConstructor(String.class,int.class,String.class);

        //使用Constructor类中的 newInstance方法创建对象。
        Object obj = con.newInstance("尴尬酱", 9, "202002");

        //打印obj对象
        System.out.println(obj);// Student{name='尴尬酱', age=9, id='202002'}

    }


}
