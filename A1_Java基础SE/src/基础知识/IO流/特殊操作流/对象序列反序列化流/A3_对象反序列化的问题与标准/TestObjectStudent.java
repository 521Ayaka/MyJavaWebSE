package ����֪ʶ.IO��.���������.�������з����л���.A3_�������л����������׼;

import java.io.*;

public class TestObjectStudent {

    public static void main(String[] args) {
        //write();
        read();
    }

    //�������л�
    public static void write() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�������з����л���\\A3_�������л����������׼\\���л��ļ�.txt"));) {
            //�ȴ�������
            Student stu = new Student("���ν�", 20, 202020);
            //�������л�
            oos.writeObject(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //�������л�
    public static void read() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("A1_Java����SE\\src\\����֪ʶ\\IO��\\���������\\�������з����л���\\A3_�������л����������׼\\���л��ļ�.txt"))) {
            //�����л�����
            Object oStu = ois.readObject();//���ﱨ�Ĳ���IOException����
            //�����ö���
            Student stu = (Student) oStu;//����ת��
            //��ӡ��������
            if (stu.getID() == 0 ){
                System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge() + ", ѧ��: �޷��鿴");
            }else {
                System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge() + ", ѧ��: " + stu.getID());
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
