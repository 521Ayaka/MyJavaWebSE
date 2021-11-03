package 基础知识.反射.A6_反射获取成员方法.练习;
/*
通过反射, 完成下面过程:

        //创建对象
        Student stu = new Student();
        stu.method1();
        stu.method2("尴尬酱");
        String ss = stu.method3("尴尬酱",30);
        System.out.println(ss);
        s.me();

*/

import 基础知识.反射.A3_获取class类的对象.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseMethodClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Student stu = new Student();
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");
        Constructor<?> con = c.getDeclaredConstructor();
        Object obj = con.newInstance();

        //stu.method1();
        Method me1 = c.getDeclaredMethod("method1");
        me1.invoke(obj);

        //stu.method2("尴尬酱");
        Method me2 = c.getDeclaredMethod("method2", String.class);
        me2.invoke(obj, "尴尬酱");

        //String ss = stu.method3("尴尬酱",30);
        //System.out.println(ss);
        Method me3 = c.getDeclaredMethod("method3", String.class, int.class);
        String str = (String) me3.invoke(obj, "尴尬酱", 17);
        System.out.println(str);

        //s.me();
        Method me = c.getDeclaredMethod("me");
        me.setAccessible(true);
        me.invoke(obj);//如果没有me.setAccessible(true);语句 出现异常: IllegalAccessException
      /*
      me()方法是私有方法, 出现非法访问异常:

      解决方案: 暴力访问:
      public void setAccessible(boolean flag)
      越过权限检测。                           */


        System.out.println("=========================================");
        System.out.println(obj);

        /*运行结果:

        method1
        method2  姓名:尴尬酱
        method3  姓名:尴尬酱年龄:17
        姓名:尴尬酱年龄:17
        me私有方法
        =========================================
        Student{name='尴尬酱', age=17, id='null'}
*/
    }

}
