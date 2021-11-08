package C3_ע��.D4_����ע��;
/*      �����


                            */

import java.lang.reflect.Method;

//���ע��, ����ֵ����
@MyAnnotation(className = "C3_ע��.D4_����ע��.TestLei01",methodName = "me")
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException {


        //����ע��
        //1��ȡ������ֽ����ļ�����
        Class<ReflectTest> c = ReflectTest.class;

        //2��ȡ�ϱߵ�ע�����
        MyAnnotation ann = c.getAnnotation(MyAnnotation.class);
/*      ��ʵ�������ڴ���������һ����ע��ӿڵ������ʵ�ֶ���
        ����ʵ���˷���, ���ظ�ֵ�õ�����ֵ
        public class MyAnnotationImpl implements MyAnnotation{
            public String className(){
                return "C3_ע��.D4_����ע��.TestLei01";
            }
            public String methodName(){
                return "me";
            }
        }                                                   */

        //3����ע������ж���ĳ��󷽷�(����), ��ȡ����ֵ��
        String className = ann.className();
        String methodName = ann.methodName();

        System.out.println("����: "+className+"\n������: "+methodName);
        System.out.println("=======================================");

        //ע���ڳ�Ա�����ϵĲ���
        method();

    }


    //ͬ�� �����ڷ�����:
    @MyAnnotation(className = "C3_ע��.D4_����ע��.TestLei02",methodName = "me")
    public static void method() throws NoSuchMethodException {

        //1.��ȡ�������
        Class<ReflectTest> c = ReflectTest.class;

        //2.��ȡ�÷�������
        Method me = c.getDeclaredMethod("method");

        //3.��ȡ���������ע�����
        MyAnnotation ann = me.getAnnotation(MyAnnotation.class);

        //4.����ע������ж���ĳ��󷽷�(����), ��ȡ����ֵ
        String className = ann.className();
        String methodName = ann.methodName();

        System.out.println("����: "+className+"\n������: "+methodName);


    }


}
