package A1_MyJava.����֪ʶ.IO��.���������.�������з����л���.A1_�������л���;
/*
�������л�����ObjectOutputStream
        -- ��Java�����ԭʼ�������ͺ�ͼ��д��OutputStream������ʹ��ObjectInputStream��ȡ(�ع�)����
           ����ͨ��ʹ�������ļ���ʵ�ֶ���ĳ־ô洢��
           ������������׽����������������һ�������ϻ���һ���������ع�����

���췽����
        -- ObjectOutputStream(OutputStream): ����һ��д��ָ����OutputStream��ObjectOutputStream

���л�����ķ�����
        -- void writeObject(Object obj): ��ָ���Ķ���д��ObjectOutputStream

*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {

        //method1();//���ֱ�����
        /*
        �쳣��: NotSerializableException
               -- ��ʵ����Ҫ�������л��ӿ�ʱ���׳����쳣��
                  ���л�����ʱ��ʵ��������׳����쳣������Ӧ��Ϊ������ơ�
                  ������ʵ�ֵĽӿڣ� Serializable

        ʵ�ֽӿ�: Serializable
                 -- ��ͨ��ʵ�� java.io.Serializable �ӿ������������л����ܡ�
                    δʵ�ִ˽ӿڵ��ཫ�޷�ʹ���κ�״̬���л������л���
                    �����л�������������ͱ����ǿ����л��ġ�
                    ���л��ӿ�û�з������ֶΣ������ڱ�ʶ�����л������塣
                    ......

        ���ԣ�  Ҫ�����л��������,����������ͱ���ʵ��Serializable�ӿ�,������޷����л�����Ķ���
        ����Ϊ�� Serializable�ӿ�û����Ҫʵ�ֵķ���,����ʵ�֡�ֻ��˵������Ķ����ܱ�ʵ�������ѡ�

        */

        method2();
        /*������:
             �� sr gA1_MyJava.基础知识.IO�?.特殊操作�?.对象序列反序列化�?.A1_对象序列化流.Student2u
             �bXe�� I ageL namet Ljava/lang/String;xp   t 	尴尬�?

         ����������ȫ���Ķ���,���Ƿ����л����ܡ�
        */

    }

    public static void method1() throws IOException {
        //�����������л���
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));
        //�������л���Ҫ�ж����,��������
        Student1 stu = new Student1("���ν�", 20);

        //�������л��ķ���
        oos.writeObject(stu);

        //������Ҫ�ͷ���Դ
        oos.close();
    }

    public static void method2()throws IOException{
        //�����������л���
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));
        //�������л���Ҫ�ж����,��������
        Student2 stu = new Student2("���ν�", 20);

        //�������л��ķ���
        oos.writeObject(stu);

        //������Ҫ�ͷ���Դ
        oos.close();



    }


}
