package ����֪ʶ.IO��.�ֽ��ַ��������ع�.A4_ѧ�����ϵ��ļ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class StudentArrayToFile {

    public static void main(String[] args) {

        //����
        new StudentArrayToFile().setStudentToFile();

    }

    //��ʼ��
    public void setStudentToFile() {

        //����ѧ������
        Student stu1 = new Student("���ν�", 2020521, 18);
        Student stu2 = new Student("���ε�", 2020999, 20);
        Student stu3 = new Student("������", 2020555, 19);
        Student stu4 = new Student("������", 2020001, 9);
        Student stu5 = new Student("������", 2020020, 99);

        //��������,������ѧ������
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        //�����ַ���������� �� д����
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A4_ѧ�����ϵ��ļ�\\ѧ���ļ�.txt"));
            //��ȡ��������
            for (Student stu : list) {
                String str = "����: " + stu.getName() + ", ѧ��: " + stu.getId() + ", ����: " + stu.getAge();
                //д��[ѧ���ļ�]����
                bw.write(str);//д��
                bw.newLine();//����
                bw.flush();//ˢ��
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
