package ����֪ʶ.����.Collection.Collection�ӿ�.Collection����;

/*
����Ҫ��:
����һ���洢ѧ������ļ��ϣ��洢����ѧ������ʹ�ó���ʵ���ڿ���̨�����ü��ϡ�
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Run_Collection {

    public static void main(String[] args) {
        //�����������󣬺�ĳĳ
        Student stu1 = new Student("��ѩ��",16);
        Student stu2 = new Student("��ѩ��",18);
        Student stu3 = new Student("��ѧ��",20);
        //����ѧ������
        Collection<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        //����������
        Iterator<Student> itr = list.iterator();
        //���б���
        while (itr.hasNext()){
            Student stu = itr.next();
            System.out.println("�ҽ�: " + stu.getName() + ", ����" + stu.getAge() + "���ˡ�");
        }


    }

}
