package A1_MyJava.����֪ʶ.����.Collection.List.List����.List����;

/*
����Ҫ��:
����һ���洢ѧ������ļ��ϣ��洢����ѧ������ʹ�ó���ʵ���ڿ���̨�����ü��ϡ�
(���ַ�ʽ������forѭ������������������)
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Run_List {

    public static void main(String[] args) {

        Student stu1 = new Student("��ѩ��", 16);
        Student stu2 = new Student("��ѩ��", 18);
        Student stu3 = new Student("��ѧ��", 20);

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        //forѭ������
        for (int i = 0; i < list.size(); i++) {
            System.out.println("�ҽ�" + list.get(i).getName() + ",����" + list.get(i).getAge() + "���ˡ�");
        }

        System.out.println("==================");

        //ʹ�õ��������б���
        Iterator<Student> itr = list.iterator();
        while (itr.hasNext()) {
            //����д��
            //System.out.println("�ҽ�" + itr.next().getName() + ",����" + itr.next().getAge() + "���ˡ�");
            Student stu = itr.next();
            System.out.println("�ҽ�" + stu.getName() + ",����" + stu.getAge() + "���ˡ�");
        }

    }

}
