package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.A5_ѧ���ļ�������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentFileToList {

    public static void main(String[] args) {

        //����
        new StudentFileToList().setStudentList();

    }

    //��ʼ��
    public void setStudentList() {

        //�������϶���
        ArrayList<Student> list = new ArrayList<>();

        //�����ַ��������������� �� ��ȡ����
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A5_ѧ���ļ�������\\ѧ���ļ�.txt"));
            //��ȡ����
            String str;
            while ((str = br.readLine()) != null) {
                //�ָ��ַ���
                String[] strArray = str.split(",");
                //����ѧ������ , ������list���ϵ���
                list.add(new Student(strArray[0], Integer.parseInt(strArray[1]), Integer.parseInt(strArray[2])));
            }
            //��������, �鿴���
            for (Student stu : list) {
                System.out.println("����: " + stu.getName() + ", ѧ��: " + stu.getId() + ", ����: " + stu.getAge());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();//�ͷ���Դ
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
