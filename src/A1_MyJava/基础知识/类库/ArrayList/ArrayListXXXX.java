package A1_MyJava.����֪ʶ.���.ArrayList;

import java.util.ArrayList;

public class ArrayListXXXX {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        //ʹ��add()�������Ԫ�أ�����ֵ��һ��booleanֵ��
        list.add("������");
        list.add("�ƺ�֮ˮ������");
        list.add("��������������");
        list.add("������");
        list.add("�����������׷�");
        boolean b = list.add("������˿ĺ��ѩ");

        list.add("���");

        System.out.println("�Ƿ�ɹ���ӵ�5��Ԫ��");
        System.out.println(b);

        System.out.println("=====================================================");

        //ʹ��get(int index)������ȡ�����е�Ԫ�أ�
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("list["+i+"]"+"="+list.get(i));
        }

        System.out.println("=====================================================");

        //ʹ��remove(int index)��������ɾ�������е�Ԫ�أ�
        String libai = list.remove(6);
        System.out.println("ɾ����Ԫ������Ϊ��"+libai);

        System.out.println("=====================================================");

        //ʹ��size(�޲�)��������ȡԪ�س���
        int leng = list.size();
        System.out.println("������Ԫ�ظ���Ϊ��" + leng);

        System.out.println("=====================================================");

        //��������
        System.out.println("���б�������");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list["+i+"]"+"="+list.get(i));
        }
    }

}
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
