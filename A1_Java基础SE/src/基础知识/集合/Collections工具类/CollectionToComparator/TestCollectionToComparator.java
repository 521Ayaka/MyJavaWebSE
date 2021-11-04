package ����֪ʶ.����.Collections������.CollectionToComparator;


import java.util.*;

public class TestCollectionToComparator {

    //������
    public static void main(String[] args) {
        new TestCollectionToComparator().init();
    }

    //��ʼ��
    public void init(){

        //����ѧ������
        Student stu1 = new Student("���ν�", 18);
        Student stu2 = new Student("���ε�", 20);
        Student stu3 = new Student("������", 11);
        Student stu4 = new Student("�����", 20);
        Student stu5 = new Student("��ĳĳ", 21);

        //����ArrayList����
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        //��������
        /*Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int i = o1.getAge() - o2.getAge();
                int num = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return num;
            }
        });*/ //Lambda���ʽ���иĽ�
        Collections.sort(list, (s1,s2)-> {
            int num = s1.getAge() - s2.getAge();
            return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
        });


        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()){
            Student stu = itr.next();
            System.out.println("����: "+stu.getName()+", ����: "+stu.getAge());
        }

    }
}
