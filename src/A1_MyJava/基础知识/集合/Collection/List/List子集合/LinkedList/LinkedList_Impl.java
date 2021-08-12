package A1_MyJava.����֪ʶ.����.Collection.List.List�Ӽ���.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
List�еķ���LinkedListҲ�оͲ�д��

[LinkedList���еķ���]:

public void addFirst(E e)  �ڸ��б�ͷ����ָ����Ԫ��
public void addLast(E e)   ��ָ����Ԫ��׷�ӵ����б��ĩβ

public E getFirst()        ���ش��б��еĵ�һ��Ԫ��
public E getLast()         ���ش��б��е����һ��Ԫ��

public E removeFirst()     �Ӵ��б���ɾ�������ص�һ��Ԫ��
public E removeLast()      �Ӵ��б���ɾ�����������һ��Ԫ��

[First]��һ           [List] ���
========================================================================================================================
List�����ַ�����������,
����LinkedListҲ�����ַ�����������

*/
public class LinkedList_Impl {

    public static void main(String[] args) {

        //�����б�
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("����");
        linkedList.add("���");
        linkedList.add("�����ѽ");
        linkedList.add(1,"��Ӵ��");
        System.out.println(linkedList);
        System.out.println("========================");

        //public void addFirst(E e)  �ڸ��б�ͷ����ָ����Ԫ��
        //public void addLast(E e)   ��ָ����Ԫ��׷�ӵ����б��ĩβ
        linkedList.addFirst("�ۣ�");
        linkedList.addLast("������ϡ��");
        System.out.println(linkedList);
        System.out.println("========================");

        //public E removeFirst()     �Ӵ��б���ɾ�������ص�һ��Ԫ��
        //public E removeLast()      �Ӵ��б���ɾ�����������һ��Ԫ��
        String strFirst = linkedList.removeFirst(); //�Ƴ���һ��Ԫ��
        String strLast = linkedList.removeLast();   //�Ƴ����һ��Ԫ��
        System.out.println("�Ƴ���һ��Ԫ��:" + strFirst);
        System.out.println("�Ƴ����һ��Ԫ��" + strLast);
        System.out.println(linkedList);
        System.out.println("========================");

        //public E getFirst()        ���ش��б��еĵ�һ��Ԫ��
        //public E getLast()         ���ش��б��е����һ��Ԫ��
        String strGetFirst = linkedList.getFirst();
        String strGetLast = linkedList.getLast();
        System.out.println("��ȡ��һ��Ԫ��:" + strGetFirst);
        System.out.println("��ȡ���һ��Ԫ��:" + strGetLast);
        System.out.println(linkedList);
        System.out.println("========================");

        //==============================================================================================================
        //���ַ�ʽ����LinkedList����
        System.out.println("���ַ�ʽ����LinkedList����");

        //1. ʹ�õ�����
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
        System.out.println("========================");


        //2. ʹ��forѭ������
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("========================");

        //3. ʹ����ǿforѭ��
        for (String name:
             linkedList) {
            System.out.println(name);
        }
        System.out.println("========================");

    }

}
