package 基础知识.反射.A5_反射获取成员变量.练习加使用;
/*
通过反射实现下面过程

    Student stu = new Student();
    stu.name = "尴尬酱"; //不可取的
    stu.age = 17;       //不可取的
    stu.id = "202002";

    System.out.println(stu);


解除访问排查:
        暴力访问:
        nameField.setAccessible(true);
        ageField.setAccessible(true);

        idField.setAccessible(true);
        //即使id是公共的 也推选调用以下排除访问权限

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DameGetField {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        //Student stu = new Student();
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //设置成员变量
        //stu.name = "尴尬酱"; //不可取的
        //stu.age = 17;       //不可取的
        //stu.id = "202002";

        Field nameField = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");
        Field idField = c.getField("id");

        //暴力访问
        nameField.setAccessible(true);
        ageField.setAccessible(true);
        idField.setAccessible(true);//即使id是公共的 也推选调用以下排除访问权限

        nameField.set(obj,"尴尬酱");
        //如果没有 [nameField.setAccessible(true);] 会出现异常: IllegalAccessException
        ageField.set(obj,9);
        //如果没有 [ageField.setAccessible(true);]  会出现异常: IllegalAccessException
        idField.set(obj,"202002");


        //System.out.println(stu);
        System.out.println(obj);
        /*
        Student{name='尴尬酱', age=9, id='202002'}
        */

    }

}
