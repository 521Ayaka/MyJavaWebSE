package ����֪ʶ.����.Collection.Collection�ӿ�;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator_Method {

    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();
        list.add("��������Ϊ���");
        list.add("ֱ������������");

        Iterator<String> it = list.iterator();
        /**
        list.iterator;���ص���Ite����Itr��Iterator<E>��ʵ���ࡣ
        ����˵���������˶�̬�ķ���������
        */

        /*
        public Iterator<E> iterator() {
            return new Itr();  //���ص���Itr����
        }
                      ?
        //Itr��ArrayList���ڲ���
        private class Itr implements Iterator<E>{
                //...
        }

        */

        System.out.println(it.next());
        System.out.println(it.next());
        //System.out.println(it.next());
        // NoSuchElementException: ����ö����û�и����Ԫ�ء�

        System.out.println("===================================");

        list.add("����������Ը");
        list.add("�����ڳ���ĺĺ");
        Iterator<String> ite = list.iterator();
        //1
        if (ite.hasNext()){
            System.out.println(1+": "+ite.next());
        }
        //2
        if (ite.hasNext()){
            System.out.println(2+": "+ite.next());
        }
        //3
        if (ite.hasNext()){
            System.out.println(3+": "+ite.next());
        }
        //4
        if (ite.hasNext()){
            System.out.println(4+": "+ite.next());
        }
        //5
        if (ite.hasNext()){
            System.out.println(5+": "+ite.next());
        }
        //6
        if (ite.hasNext()){
            System.out.println(6+ite.next());
        }

        //����ѭ������
        System.out.println("=====ʹ��whileѭ��=====");
        //����������
        Iterator<String> itr = list.iterator();
        int i = 1;
        while (itr.hasNext()){
            String str = itr.next();//һ�����ȡֵ����ʹ�á�
            System.out.println((i++)+": "+str);
        }



    }

}
