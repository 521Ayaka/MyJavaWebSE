package ����֪ʶ.����.A4_�����ȡ����������.��ϰ2;
/*

ʹ��������캯��:
private Student(String name){
        this.name = name;
    }

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class NewInstance02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //����class����
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");

        //��ȡȫ������������ ���������
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor<?> obj : cons) {
            System.out.println(obj);
        }
        /*
        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int,java.lang.String)
        ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int)
        private ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String)
        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student()
        */
        System.out.println("\n======================================================\n");

        //ʹ�� private ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String) ���췽��
        Constructor<?> con = c.getDeclaredConstructor(String.class);

        //ʹ�� ��������
        //public void setAccessible(boolean flag) ȡ�����ʼ��
        con.setAccessible(true);


        //��������
        Object obj = con.newInstance("���ν�");
        System.out.println(obj);
        //���ֱ�����, ���ַ��ʴ��� private������


    }


}
