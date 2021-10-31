package ����֪ʶ.����.A3_��ȡclass��Ķ���;
/*
��ͨ������ȥʹ��һ����,
��������Ҫ [��ȡ��������ֽ����ļ�����] ,
Ҳ��������ΪClass���͵Ķ���

��ȡClass���͵Ķ���� ���ַ�ʽ:

1. ʹ�����class��������ȡ������Class����
        ����: Student.class ������Student������Class����

2. ���ö����getClass()����, ���ظö����������Ӧ��Class����
        �÷�����Object���еķ���, ���е�Java���󶼿��Ե��ø÷�����

3. ʹ��Class���еľ�̬����forName(String className),
        �÷�����Ҫ�����ַ�������,���ַ���������ֵ��ĳ�����ȫ��·��
        Ҳ������������·����


[�ܽ�]:
    ��һ�ַ�ʽ���, ֻ��Ҫ����ȥ����class���ԾͿ�����
    �ڶ��ַ�ʽ��Ҫ��������, ͨ�������ȡ
    �����ַ�ʽ������, ��Ҫ��ַ, ��������Ժܸߡ�

*/

public class GetClassObj {

    public static void main(String[] args) throws ClassNotFoundException {

        //��ʽһ: ʹ�����class��������ȡ������Class����
        Class<Student> class1 = Student.class;
        //��������� [Class], �����ǻ�ȡ [�������]��
        System.out.println(class1);
        //���:  class ����֪ʶ.����.A3_��ȡclass��Ķ���.Student

        Class<Student> class2 = Student.class;
        System.out.println(class1 == class2); //����Ϊtrue

        //===================================================

        //��ʽ��: ���ö����getClass()����, ���ظö����������Ӧ��Class����
        //���ö����Ҫ���ж���
        Student stu = new Student();
        Class<? extends Student> class3 = stu.getClass();
        System.out.println(class1 == class3);//����Ϊtrue

        //===================================================

        //��ʽ��: ʹ��Class���еľ�̬����forName(String className)
        //�÷�ʽ��Ҫ����һ��Class�����, ���Ͳ�֪��Ϊ<?>
        Class<?> class4 = //Class������һ��forName("·��") �ķ���
                Class.forName("����֪ʶ.����.A3_��ȡclass��Ķ���.Student");
                //forName���� ��Ҫ�׳��쳣��
        System.out.println(class1 == class4);

    }

}
