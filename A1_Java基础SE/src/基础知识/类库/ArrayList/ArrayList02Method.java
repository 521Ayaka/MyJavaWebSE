package ����֪ʶ.���.ArrayList;

import java.util.ArrayList;

/*
ArrayList���õ�Method

1.public boolean add(E e){...} :�򼯺������Ԫ�أ���������ͺͷ�����ͬ������ֵ������ӳɹ���
  ע�⣺��ArrayList��˵��add��Ӷ���һ����ɹ��������鷵��ֵ���Բ��ã�
       ���Ƕ��������ļ��ϣ���󻹻�ѧ����˵��add��Ӳ�һ���ɹ���

2.public E get(int index){...} :�ؼ����л�ȡԪ�أ����Բ�������int��index������ֵ��

3.public E remove(int index){...} :�Ӽ��ϵ���ɾ��Ԫ�أ�������������ţ�����ֵ��Ԫ�����ݡ�

4.public int size(){...}  :��ȡԪ�صĳ��ȣ�����ֵ����Ԫ�س��ȡ�

����ı��� ʹ��forѭ��

*/
public class ArrayList02Method {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println("�Դ���arraylist����");

        System.out.println("��ʼ��ӵ�һ��Ԫ��...");
        boolean v = array.add("���ν�");  // 1
        //ע�⣺��ArrayList��˵��add��Ӷ���һ����ɹ��������鷵��ֵ���Բ��ã�
        //     ���Ƕ��������ļ��ϣ���󻹻�ѧ����˵��add��Ӳ�һ���ɹ���

        System.out.println("����Ƿ�ɹ���" + v );
        System.out.println("��ӵ�Ԫ��Ϊ��" + array.get(0));  // 2

        System.out.println("�������Ԫ��...");

        array.add("���ν�����");// 2
        array.add("(�� �㧥 ��;)��");// 2
        array.add("һ��LOL��");// 2
        array.add("( *^-^)��(*�s^�t)");// 2
        array.add("������ ��(���n��)��");
        System.out.println("������!");// 2

        System.out.println("���鳤��Ϊ��" + array.size());//
        System.out.println("��ʼ��ӡ����...");
        System.out.println("��ӡ���Ϊ��" + array);

        System.out.println("��ʼɾ�����һ��Ԫ��...");
        System.out.println("��ɾ��...");

        String str = array.remove( array.size() - 1 ); // 3 and 2
        //ע�⣺��Ҳ�и�����ֵ��Ҳ���Բ��� array.remove(5);

        System.out.println("ɾ����Ԫ���ǣ�" + str );

        System.out.println("��ʼ���´�ӡ����...");
        System.out.println("��ӡ������Ϊ��" + array);

        //������ӡ
        System.out.println("��ʼ�������������ӡ...");
        System.out.println("��ӡ�����");
        System.out.println();
        for (int i = 0; i < array.size(); i++ ){
            System.out.println(array.get(i));
        }
//        for (String s : array) {
//            System.out.println(s);
//        }
        System.out.println();
        System.out.println("��ӡ����...");
        System.out.println("�������... ...");


    }
}