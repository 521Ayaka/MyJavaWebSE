package A1_MyJava.����֪ʶ.IO��.�ֽ��ַ��������ع�.A6_ѧ���ɼ�¼��;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentGradeToFile {

    public static void main(String[] args) {

        //����
        new StudentGradeToFile().init();

    }

    //��ʼ��
    public void init() {

        //����TreeSet����, ʹ�ñȽ�����
        TreeSet<StudentGrade> treeSet = new TreeSet<>(new Comparator<StudentGrade>() {
            @Override
            public int compare(StudentGrade s1, StudentGrade s2) {
                //��Ҫ����: �����ִܷӸߵ�������
                int num1 = s2.getSum() - s1.getSum();
                //��Ҫ����1: �������ĳɼ��Ӹߵ���
                int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
                //��Ҫ����2: ������ѧ�ɼ��Ӹߵ���
                int num3 = num2 == 0 ? s2.getMeth() - s1.getMeth() : num2;
                //��Ҫ����3: ���Ʒ�����ͬ,�Ƚ�����
                int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num3;
                return num4;
            }
        });

        //����¼��ѧ����Ϣ
        Scanner sc = new Scanner(System.in);
        System.out.println("===��¼��5��ѧ����Ϣ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("�����" + (i + 1) + "λѧ����Ϣ");
            System.out.print("����: ");//������
            String name = sc.next();
            System.out.print("���ĳɼ�: ");
            int chinese = sc.nextInt();
            System.out.print("��ѧ�ɼ�: ");
            int math = sc.nextInt();
            System.out.print("Ӣ��ɼ�: ");
            int english = sc.nextInt();
            System.out.println("====================");

            //����ѧ������, ���ѧ����Ϣ
            StudentGrade stu = new StudentGrade(name, chinese, math, english);
            //��ӵ�TreeSet���ϵ���
            treeSet.add(stu);
        }

        //�����ַ�������������� �� д������
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ��ַ��������ع�\\A6_ѧ���ɼ�¼��\\ѧ���ɼ�.txt"));
            //д������
            for (StudentGrade stu : treeSet) {
                bw.write("����: " + stu.getName() + ", ���ĳɼ�: " + stu.getChinese() + ", ��ѧ�ɼ�: " + stu.getMeth() + ", Ӣ��ɼ�: " + stu.getEnglish());
                bw.newLine();//����
                bw.flush();//ˢ����
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

    /*�ҵ�����:
    ===��¼��5��ѧ����Ϣ===
    �����1λѧ����Ϣ
    ����: ���ν�
    ���ĳɼ�: 100
    ��ѧ�ɼ�: 100
    Ӣ��ɼ�: 0
    ====================
    �����2λѧ����Ϣ
    ����: ���ε�
    ���ĳɼ�: 100
    ��ѧ�ɼ�: 100
    Ӣ��ɼ�: 99
    ====================
    �����3λѧ����Ϣ
    ����: ������
    ���ĳɼ�: 60
    ��ѧ�ɼ�: 0
    Ӣ��ɼ�: 0
    ====================
    �����4λѧ����Ϣ
    ����: ������
    ���ĳɼ�: 0
    ��ѧ�ɼ�: 0
    Ӣ��ɼ�: 0
    ====================
    �����5λѧ����Ϣ
    ����: ������
    ���ĳɼ�: 99
    ��ѧ�ɼ�: 99
    Ӣ��ɼ�: 99
    ====================
    */

}
