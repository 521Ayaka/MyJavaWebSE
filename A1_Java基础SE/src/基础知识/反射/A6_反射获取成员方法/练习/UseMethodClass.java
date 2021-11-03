package ����֪ʶ.����.A6_�����ȡ��Ա����.��ϰ;
/*
ͨ������, ����������:

        //��������
        Student stu = new Student();
        stu.method1();
        stu.method2("���ν�");
        String ss = stu.method3("���ν�",30);
        System.out.println(ss);
        s.me();

*/

import ����֪ʶ.����.A3_��ȡclass��Ķ���.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UseMethodClass {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Student stu = new Student();
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");
        Constructor<?> con = c.getDeclaredConstructor();
        Object obj = con.newInstance();

        //stu.method1();
        Method me1 = c.getDeclaredMethod("method1");
        me1.invoke(obj);

        //stu.method2("���ν�");
        Method me2 = c.getDeclaredMethod("method2", String.class);
        me2.invoke(obj, "���ν�");

        //String ss = stu.method3("���ν�",30);
        //System.out.println(ss);
        Method me3 = c.getDeclaredMethod("method3", String.class, int.class);
        String str = (String) me3.invoke(obj, "���ν�", 17);
        System.out.println(str);

        //s.me();
        Method me = c.getDeclaredMethod("me");
        me.setAccessible(true);
        me.invoke(obj);//���û��me.setAccessible(true);��� �����쳣: IllegalAccessException
      /*
      me()������˽�з���, ���ַǷ������쳣:

      �������: ��������:
      public void setAccessible(boolean flag)
      Խ��Ȩ�޼�⡣                           */


        System.out.println("=========================================");
        System.out.println(obj);

        /*���н��:

        method1
        method2  ����:���ν�
        method3  ����:���ν�����:17
        ����:���ν�����:17
        me˽�з���
        =========================================
        Student{name='���ν�', age=17, id='null'}
*/
    }

}
