package ����֪ʶ.����.Collection.List.List����.ListIterator������;
/*
java.util.ListIterator<E>
ListIteratorҲ��: �б������

[ListIterator����]:

--- ListIterator��List��listIterator()�����õ��ģ���List���еĵ�������
--- ListIterator�̳���Iterator�ӿڡ�
--- �����������Ա�����ⷽ������б���������ڵ����ڼ��޸��б�������б��е������ĵ�ǰλ�á�


[ListIterator���÷���]:

--- E next()                ���صĵ������е���һ��Ԫ�ء�
--- boolean hasNext()       ������������и���Ԫ�أ��򷵻�true
--- E previous()            �����б��е���һ��Ԫ�ء�
--- boolean hasPrevious()   ������б���������෴��������б���и���Ԫ�أ��򷵻�ture

--- void add(E e)           ��ָ����Ԫ�ز����б�                        ���ص㣡��
                            ��ע�⡿:�õ���ListIterator�Ķ������add���Ԫ�أ�������ԭ����list��ӡ�

*/
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Method {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("����");
        list.add("����");
        list.add("���");

        //��̬����ListIterator����
        ListIterator<String> listItr = list.listIterator();
        //�������
        while (listItr.hasNext()){
            String str = listItr.next();
            System.out.println(str);
        }
        System.out.println("========");
        //�������
        while (listItr.hasPrevious()){
            String str = listItr.previous();
            System.out.println(str);
        }
        System.out.println("========");

        System.out.println("===========================================================================================");

        //�մ����ĵ�ListIterator�����ʱ�򣬲���ֱ��ʹ��Previous������
        //������λ����0����λ�ã���һ��Ԫ����û�еġ�
        ListIterator<String> listIte = list.listIterator();
        while (listIte.hasPrevious()){
            String str = listIte.previous();
            System.out.println(str);
        }

        System.out.println("������: ");
//      System.out.println( listIte.previous() );//�쳣����: NoSuchElementException
        System.out.println( listIte.next() );//��ʼ����һ��Ԫ����[����]������Ԫ�غ󣬵������������1(����+1)
        System.out.println( listIte.previous() );//������λ�ڵڶ���Ԫ�أ�ִ�к���ǰ��1(����-1)������ǰ�����Ԫ��[����]
        //����
        //����
        //����

        /**
        ListIterator<String> ier = list.listIterator();
        while (true){
            while (listItr.hasNext()){
                String str = listItr.next();
                System.out.print(str);
            }
            System.out.print("==");
            while (listItr.hasPrevious()){
                String str = listItr.previous();
                System.out.print(str);
         }  }
        */
        System.out.print("�ص�: ");
        //�ص�add()����
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            String str = listIterator.next();
            if (str.equals("����")){
                listIterator.add("ţ��,¬��ΰû�п��ң�"); //�õ���ListIterator�Ķ������add���Ԫ�أ�������ԭ����list��ӡ�
            }
        }
        System.out.println(list);
    }

}
