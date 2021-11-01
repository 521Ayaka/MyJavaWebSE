package ����֪ʶ.����.A5_�����ȡ��Ա����;
/*
ͨ�������ȡ ��Ա����:

��ȡ������Ա���� ����:
        Field[]	getFields()
        ���ذ���һ������ Field�������ɴ˱�ʾ�����ӿڵ����пɷ��ʵĹ����ֶ� �����

��ȡ���г�Ա���� ����:
        Field[]	getDeclaredFields()
        ���ص����� Field����ӳ�˱�ʾ�����ӿ������������ֶ� �����

=======================================================================================

��ȡ������Ա������һ��:
        Field[]	getFields(String name)

��ȡ���г�Ա�����е�һ��:
        Field[]	getDeclaredFields(String name)

������: ��Ա��������

=======================================================================================

Field�൱����һ������:
        void set(Object obj, Object value)
        ��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��

*/


import ����֪ʶ.����.A3_��ȡclass��Ķ���.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetField {

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException {

        //���ȴ���class����
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");

        method1(c);//test: getFields
        method2(c);//test: getDeclaredFields

        method3(c);//test: getField
        method4(c);//test: getDeclaredField

        method5(c);//ʹ��
        //TODO: ���忴��ϰ �������

    }


    public static void method1(Class<?> c) {
        System.out.println("======================================================================\n");
        //��ȡ������Ա������
        Field[] fs = c.getFields();
        //����
        for (Field f : fs) {
            System.out.println(f);
        }
        /*���н��:

        //ֻ�й�����Ա����
        public java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.id

        */
        System.out.println("\n======================================================================\n");
    }


    public static void method2(Class<?> c) {
        //��ȡc�����г�Ա����
        Field[] fs = c.getDeclaredFields();
        //����
        for (Field f : fs) {
            System.out.println(f);
        }/*���н��:

        private java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.name
        int ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.age
        public java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.id

        */
        System.out.println("\n======================================================================\n");
    }

    public static void method3(Class<?> c) throws NoSuchFieldException {
        //��ȡ����������Ա����
        Field f = c.getField("id");//������ [��Ա������]
        System.out.println(f);
        /*���н��:

        public java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.id

        */
        System.out.println("\n======================================================================\n");
    }


    public static void method4(Class<?> c) throws NoSuchFieldException {
        //��ȡȫ�����еĵ�����Ա����


        //��ȡ: Ĭ�ϳ�Ա���� int age;
        Field age = c.getDeclaredField("age");
        System.out.println(age);
        //���н��: int ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.age


        //��ȡ: ˽�г�Ա���� private String name;
        Field name = c.getDeclaredField("name");
        System.out.println(name);
        //���н��: private java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.name

        System.out.println("\n======================================================================\n");
    }


    public static void method5(Class<?> c) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        //��ȡ: ˽�г�Ա���� private String name;
        Field name = c.getDeclaredField("name");
        //��ȡ: Ĭ�ϳ�Ա���� int age;
        Field age = c.getDeclaredField("age");
        //��ȡ: ������Ա���� public int id;
        Field id = c.getDeclaredField("id");

        //�����ȡc�Ĺ���������
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        // stu.id = id; ���ַ���ʹ���Ǵ����
        /*
        Field�൱����һ������:
                void set(Object obj, Object value)
                ��ָ����������ϴ� Field �����ʾ���ֶ�����Ϊָ������ֵ��
        */
        //name.set(obj,"���ν�"); //name��˽�г�Ա����
        //age.set(obj,9);        //age��Ĭ�ϳ�Ա����
        //�������:  ����ϰ
        //TODO: ���忴��ϰ �������
        id.set(obj, "202002");

        /*
        ��obj�� [��Ա���� id] ��ֵΪ 202002
        */

        System.out.println(obj);
        /*

        Student{name='null', age=0, id='202002'}

        */

    }


}
