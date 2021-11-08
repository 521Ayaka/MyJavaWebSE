package ����֪ʶ.����.A6_�����ȡ��Ա����;
/*
ͨ�������ȡ��Ա����:

��ȡ���й�����Ա���� ����:
        Method[] getMethods()���ذ���һ�����鷽���������ɴ˱�ʾ����
        ��ӿڵ����й������� ����󣬰�����Щ�����ӿں���Щ�ӳ���ͳ��ӿڼ̳е�������


��ȡ���г�Ա���� ����:
        Method[] getDeclaredMethods() ���ذ���һ�����鷽������������ӿڵ����������ķ�����
        ͨ���˱�ʾ ����󣬰���������������Ĭ�ϣ��������ʺ�˽�з��������������̳еķ�����

=====================================================================================

��ȡ����������Ա���� ����:
        Method getMethod(String name, class<?>... parameterTypes)
        ����һ�� ������������ӳ�˱�ʾ�����ӿڵ�ָ��������Ա���� �����

��ȡ������Ա���� ����:
        Method getDeclaredMethod(String name, class<?>... parameterTypes)
        ����һ�� ������������ӳ�˱�ʾ�����ӿڵ�ָ�������ķ��� �����

����:
        name: name�ǵ��õķ�������
        para: ��name�����Ĳ��� [����] �� [���͵�class����]

=====================================================================================

ʹ��Method��:

        Object invoke(Object obj, Object... args)
        �ھ���ָ�������� ���������ϵ��ô� ���������ʾ�ĵײ㷽����

        ����:
        Object: ����ֵ���Ͷ���
        obj:    ���÷����Ķ���
        args:   ���÷�������Ĳ�����

        TODO: ˼��ʹ�÷ǹ�����Ա����, �� [��ϰ]

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewMethod {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //����class����
        Class<?> c = Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");

        //���ʳ�Ա����:

        method1(c); //test: ��ȡ����[������Ա����] ����
        method2(c); //test: ��ȡ����[��Ա������]   ����

        method3(c); //test: ��ȡ����[������Ա����]
        method4(c); //test: ��ȡ����[��Ա����]

        useMethod(c); //ͨ��Method��, ʹ�ó�Ա����

    }

//=======================================================================================================

    public static void method1(Class<?> c) {
        System.out.println("\n==================================================================\n");

        //��ȡ���й�����Ա���� ����:
        Method[] mes = c.getMethods();
        //�������:
        for (Method me : mes) {
            System.out.println(me);
        }
        /*���н��:
        public java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.toString()
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method1()
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method2(java.lang.String)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method3(java.lang.String,int)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method4()
        public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        public final void java.lang.Object.wait() throws java.lang.InterruptedException
        public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        public boolean java.lang.Object.equals(java.lang.Object)
        public native int java.lang.Object.hashCode()
        public final native java.lang.Class java.lang.Object.getClass()
        public final native void java.lang.Object.notify()
        public final native void java.lang.Object.notifyAll()
        */ //�������й�����Ա����, �����̳еĸ��෽����

        System.out.println("\n==================================================================\n");

    }


//=======================================================================================================

    public static void method2(Class<?> c) {
        //��ȡ���г�Ա���� ����:
        Method[] mes = c.getDeclaredMethods();
        //�������:
        for (Method me : mes) {
            System.out.println(me);
        }
        /*���н��:

        public java.lang.String ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.toString()
        private void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.me()
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method4()
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method3(java.lang.String,int)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method2(java.lang.String)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method1()
        */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void method3(Class<?> c) throws NoSuchMethodException {

        //��ȡ����������Ա����
        Method me1 = c.getMethod("method1");
        Method me2 = c.getMethod("method2", String.class);
        Method me3 = c.getMethod("method3", String.class, int.class);
        Method me4 = c.getMethod("method4");
        Method getC = c.getMethod("getClass");
        Method code = c.getMethod("hashCode");
        /*����:
        name: name�ǵ��õķ�������
        para: ��name�����Ĳ��� [����] �� [���͵�class����]
        */

        //������
        System.out.println(me1);
        System.out.println(me2);
        System.out.println(me3);
        System.out.println(me4);
        System.out.println(getC);
        System.out.println(code);
        /*���н��:

        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method1()
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method2(java.lang.String)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method3(java.lang.String,int)
        public void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.method4()
        public final native java.lang.Class java.lang.Object.getClass()
        public native int java.lang.Object.hashCode()
        */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void method4(Class<?> c) throws NoSuchMethodException {

        //��ȡ������Ա����:
        Method me = c.getDeclaredMethod("me");

        //������:
        System.out.println(me);

        /*���н��:

        private void ����֪ʶ.����.A3_��ȡclass��Ķ���.Student.me()
                                                                    */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void useMethod(Class<?> c) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //Ҫ��ʹ��Method, ��ͨ�������ȡ��������������
        Constructor<?> con = c.getDeclaredConstructor();

        //ͨ����ȡ���Ĺ�������������
        con.setAccessible(true);
        Object obj = con.newInstance();

        //ͨ�������ȡ��Ա����
        Method method = c.getMethod("method1");

        //ͨ��Method�� obj����method1������
        /*
        Object invoke(Object obj, Object... args)
        �ھ���ָ�������� ���������ϵ��ô� ���������ʾ�ĵײ㷽����

        ����:
        Object: ����ֵ���Ͷ���
        obj:    ���÷����Ķ���
        args:   ���÷�������Ĳ�����

        */

        Object o = method.invoke(obj);
        System.out.println(o);//method1�޷���ֵ
        /*
        ����:
        obj����,obj�е�method����[method1]
        obj����Ϊ��,��Ϊmethod1�в����б�Ϊ��
        oΪnull,��Ϊmethod1��û�з���ֵ

        ���н��:
        method1
        null

        */

        //TODO: ˼��ʹ�÷ǹ�����Ա����, �� [��ϰ]

    }


}
