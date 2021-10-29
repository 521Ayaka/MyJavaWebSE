package ����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet.������.Comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Lei {

    public static void main(String[] args) {
                                                //���췽����ʱ�򣬴���һ���Ƚ�����ӿڵ�ʵ�������࣬������TreeSet������ͬ
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //�����Ϊ����ǰ����������ĳ�Ա��������Ϊ��Ա����˽�л���
                int num = o1.getAge() - o1.getAge();
                int num1 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num1;
            }
        });
        Student stu1 = new Student("GanGa", 18);
        Student stu2 = new Student("GanGaJiang", 9);
        Student stu3 = new Student("GanGaDi", 20);
        Student stu4 = new Student("GanGaLe", 120);
        Student stu5 = new Student("GanGaBaoBao", 9);
        Student stu6 = new Student("GanGaBaoBao", 9);//�ظ�

        treeSet.add(stu1);
        treeSet.add(stu2);
        treeSet.add(stu3);
        treeSet.add(stu4);
        treeSet.add(stu5);
        treeSet.add(stu6);//�ظ�

        for (Student stu :
                treeSet) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }

    }

}
