package ����֪ʶ.����.A4_�����ȡ����������.��ϰ1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstance01 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {


        //��ȡclass����
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");

        //��ȡ�����������public Student(String name, int age, String id)
        //��̬����getConstructor����, ��������class����
        Constructor<?> con = c.getConstructor(String.class,int.class,String.class);

        //ʹ��Constructor���е� newInstance������������
        Object obj = con.newInstance("���ν�", 9, "202002");

        //��ӡobj����
        System.out.println(obj);// Student{name='���ν�', age=9, id='202002'}

    }


}
