package ����֪ʶ.����.A5_�����ȡ��Ա����.��ϰ��ʹ��;
/*
ͨ������ʵ���������

    Student stu = new Student();
    stu.name = "���ν�"; //����ȡ��
    stu.age = 17;       //����ȡ��
    stu.id = "202002";

    System.out.println(stu);


��������Ų�:
        ��������:
        nameField.setAccessible(true);
        ageField.setAccessible(true);

        idField.setAccessible(true);
        //��ʹid�ǹ����� Ҳ��ѡ���������ų�����Ȩ��

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DameGetField {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        //Student stu = new Student();
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        //���ó�Ա����
        //stu.name = "���ν�"; //����ȡ��
        //stu.age = 17;       //����ȡ��
        //stu.id = "202002";

        Field nameField = c.getDeclaredField("name");
        Field ageField = c.getDeclaredField("age");
        Field idField = c.getField("id");

        //��������
        nameField.setAccessible(true);
        ageField.setAccessible(true);
        idField.setAccessible(true);//��ʹid�ǹ����� Ҳ��ѡ���������ų�����Ȩ��

        nameField.set(obj,"���ν�");
        //���û�� [nameField.setAccessible(true);] ������쳣: IllegalAccessException
        ageField.set(obj,9);
        //���û�� [ageField.setAccessible(true);]  ������쳣: IllegalAccessException
        idField.set(obj,"202002");


        //System.out.println(stu);
        System.out.println(obj);
        /*
        Student{name='���ν�', age=9, id='202002'}
        */

    }

}
