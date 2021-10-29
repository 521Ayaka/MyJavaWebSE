package ����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet.������.����;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Lei {

    public static void main(String[] args) {

        //�������϶���
        TreeSet<Student> treeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override //���������ڲ��࣬����дcompare()�������涨�ȽϹ���
            public int compare(Student s1, Student s2) {
                int num1 = (s2.getChinese() + s2.getMath()) - (s1.getChinese() + s1.getChinese()); //�ֽܷ���
                int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;                   //���Ľ���
                int num = num2 == 0 ? s1.getName().compareTo(s2.getName()) : num2;                 //��������
                return num;
            }
        });

        //����ѧ������
        Student stu1 = new Student("GanGa", 100, 120);
        Student stu2 = new Student("GanGaJiang", 150, 150);
        Student stu3 = new Student("GanGaDi", 120, 120);
        Student stu4 = new Student("GanGaBaoBao", 1, 0);
        Student stu5 = new Student("GaGaLe", 150, 150);
        Student stu6 = new Student("GanGaWWW", 120, 100);
        Student stu7 = new Student("GanGaBaoB", 0, 1);
        Student stu8 = new Student("GanGaLou",100,120);


        //���Ԫ��stu1
        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);
        treeSet.add(stu6);
        treeSet.add(stu7);
        treeSet.add(stu8);

        //��������
        for (Student stu : treeSet) {
            System.out.println(stu.getName());
            System.out.println("����:" + stu.getChinese() + ",��ѧ:" + stu.getMath() + "�ܷ�Ϊ��" + (stu.getChinese() + stu.getMath()));
            System.out.println();
        }

        //���н����
        //GaGaLe�ܷ�Ϊ��300
        //GanGaJiang�ܷ�Ϊ��300
        //GanGaDi�ܷ�Ϊ��240
        //GanGa�ܷ�Ϊ��220
        //GanGaBaoBao�ܷ�Ϊ��1

    }

}
