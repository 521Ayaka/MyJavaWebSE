package ����֪ʶ.���.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListTi {
    public static void main(String[] args) {
        //��Ŀһ������6��1~33��������֣���ӵ����ϣ����������ϡ�
        ArrayList<Integer> array1 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33) + 1;
            array1.add(num);
        }

        for(int i = 0; i <array1.size(); i++ ){
            System.out.println(array1.get(i));
        }
        System.out.println("=============================");

        //��Ŀ�����Զ������ѧ��������ӵ����ϣ�����������
        ArrayList<Student> array2 = new ArrayList<>();
        Student a = new Student("������ʦ" , 21);
        Student b = new Student("������", 21);
        Student c = new Student("ħ��ʦ",17);
        Student d = new Student("�ɺ�֮��",24);
        Student e = new Student("����",9999);

        array2.add(a);
        array2.add(b);
        array2.add(c);
        array2.add(d);
        array2.add(e);

        for (int i = 0; i < array2.size(); i++) {
            Student stu = array2.get(i);
            System.out.println("���֣�"+stu.getName()+"�����䣺"+stu.getAge());
        }

        System.out.println("=============================");

        //��Ŀ��������һ��ָ����ʽ��ӡ���ϵķ�������ʽΪ��{Ԫ��@Ԫ��@Ԫ��@Ԫ��@Ԫ��}
        ArrayList<String> array03 = new ArrayList<>();
        array03.add("������ʦ");
        array03.add("�ɺ�֮��");
        array03.add("�����ͽ�");
        array03.add("��ѡ����");
        array03.add("��ѡ����");
        System.out.println(array03);

        System.out.println("ָ����ʽ��ӡ��");
        Print(array03);

    }

    public static void Print(ArrayList<String> array03){
        System.out.print("{");
        for (int i = 0; i < array03.size(); i++) {
            if(i == array03.size() - 1){
                System.out.print(array03.get(i));
            }else{
                System.out.print(array03.get(i) + "@");
            }
        }
        System.out.print("}");
    }

}
