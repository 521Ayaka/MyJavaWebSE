package ����֪ʶ.���.ArrayList;

import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList <Integer> arraylist = new ArrayList<>();

        //Method 1
        arraylist.add(5);
        arraylist.add(2);
        arraylist.add(2);
        boolean v = arraylist.add(1);
        System.out.println("������һ��Ԫ���Ƿ�ɹ���" + v);
        System.out.println(arraylist);

        //Method 2
        System.out.println("��0��Ԫ��Ϊ��" + arraylist.get(0));
        System.out.println("��3��Ԫ��Ϊ��" + arraylist.get(3));

        //Method 3
        int i = arraylist.size();
        System.out.println("����ĳ���ΪA" + i);

        //Method 4
        int n = arraylist.remove(2);
        System.out.println("ɾ����Ԫ����" + n);
        System.out.println(arraylist);



    }
}
