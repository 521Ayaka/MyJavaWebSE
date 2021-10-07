package A1_MyJava.����֪ʶ.IO��.���������.�������з����л���.A2_�������л���;
/*
�������л���: ObjectInputStream
        -- ObjectInputStream�����л���ǰʹ��ObjectOutputSteam��д��ԭʼ���ݺͶ���

���췽��:
        -- ObjectInputSteam(InputSteam in): ������ָ����InputSteam��ȡ��ObjectStream

�����л�����ķ���:
        -- Object readObject(): ��ObjectInputStream��ȡһ������,����ֵ��һ������

*/

import A1_MyJava.����֪ʶ.IO��.���������.�������з����л���.A1_�������л���.Student2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //���������л������󡣹��췽��:ObjectInputSteam(InputSteam in): ������ָ����InputSteam��ȡ��ObjectStream
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\A1_MyJava\\����֪ʶ\\IO��\\���������\\�������з����л���\\A1_�������л���\\�������л�.txt"));

        //ʹ�÷����л����ķ����������л�����ķ���:Object readObject(): ��ObjectInputStream��ȡһ������,����ֵ��һ������
        Object oStu = ois.readObject();//�׳��쳣��ClassNotFoundException
        Student2 stu = (Student2) oStu;//����ת��ΪStudent2

        //�ͷ���Դ
        ois.close();

        //�����ö���
        System.out.println("����: "+stu.getName()+", ����: "+stu.getAge());

    }

}
