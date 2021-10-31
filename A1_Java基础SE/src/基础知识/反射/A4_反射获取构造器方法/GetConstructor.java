package ����֪ʶ.����.A4_�����ȡ����������;
/*
ͨ�������ȡ ����֪ʶ.����.A3_��ȡclass��Ķ���.Student��Ĺ�������

��һ��: ʹ��Class���е�forName������ȡclass����


����ȡ�����Ĺ����� ���顿:
        Constructor<?>[]	getConstructors()
        ���ذ���һ������ Constructor�������ɴ˱�ʾ����� [���й�������] �����

����ȡ���еĹ����� ���顿:
        Constructor<?>[]	getDeclaredConstructors()
        ����һ����ӳ Constructor�����ʾ���������� [���� Constructor���������] �� ��

===================================================================================

����ȡ�����Ĺ�������



����ȡ���еĹ�������:


*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class GetConstructor {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //�ȴ���class�����
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");

        System.out.println("\n=================================================\n");

        //Constructor<?>[]	getConstructors()
        //���ذ���һ������ Constructor�������ɴ˱�ʾ����� [���й�������] �����
        Constructor<?>[] cons1 = c.getConstructors();//���ؿ���Object���� ���ա�
        //����һ��
        for (Constructor<?> con : cons1) {
            System.out.println(con);
        }
        /*���н��:

        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int,java.lang.String)
        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student()

        */

        System.out.println("\n=================================================\n");


        //Constructor<?>[]	getDeclaredConstructors()
        //����һ����ӳ Constructor�����ʾ���������� [���� Constructor���������] �� ��
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        //����һ��
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }
        /*���н��:

        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int,java.lang.String)
        ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int)
        private ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String)
        public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student()

        */

        System.out.println("\n=================================================\n");

        //Constructor<T>	getConstructor(class<?>... parameterTypes)
        //����һ�� Constructor���󣬸ö���ӳ Constructor�����ʾ�����ָ���Ĺ��� �ຯ����

        //Constructor<T>	getDeclaredConstructor(class<?>... parameterTypes)
        //����һ�� Constructor���󣬸ö���ӳ Constructor�����ʾ�����ӿڵ�ָ�� �ຯ����

        /**
         ����: ��Ҫ��ȡ�Ĺ����������Ĳ��������Ͳ������Ͷ�Ӧ���ֽ����ļ�����

         ��
         Constructor�ṩ��һ����ĵ������캯������Ϣ�ͷ��ʡ�

         Constructor�� ��һ������:
         T newInstance(Object... initargs)
         ʹ�ô� Constructor�����ʾ�Ĺ��캯����ʹ��ָ���ĳ�ʼ�������������ͳ�ʼ�����캯�������������ʵ����

         */

        Constructor<?> con1 = c.getConstructor();
        Object obj1 = con1.newInstance();
        System.out.println(obj1 + "\n");//���н��: Student{name='null', age=0, id='null'}

        //public ����֪ʶ.����.A3_��ȡclass��Ķ���.Student(java.lang.String,int,java.lang.String)
        Constructor<?> con2 = c.getConstructor(String.class, int.class, String.class);
        Object obj2 = con2.newInstance("���ν�", 9, "20200200");//����������
        System.out.println(obj2);//Student{name='���ν�', age=9, id='20200200'}


    }

}
