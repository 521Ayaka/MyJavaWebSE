package ����֪ʶ.����.Collection.List.List����.List�����޸��쳣;
/*
������һ������
           ����һ������: List<String> list = new ArrayList<String>();
           ����������Ԫ��: list.add("����");list.add("����");list.add("���");
           ���������ϣ��õ�ÿһ��Ԫ�أ�����û��Ԫ��[����]������У��Ҿ����һ��Ԫ��[ţ��,¬��ΰû�п��ң�]����д����ʵ��
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_Yi {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("����");
        list.add("����");
        list.add("���");

        //����ǡ��ص�=�����������������޸��쳣��
        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            String str = itr.next();
//            if (str.equals("����")){
//                list.add("ţ��,¬��ΰû�п��ң�");
//            }
//        }
        /**�쳣����
        Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
        at MyJava.����֪ʶ.����.Collection.List.List����.List�����޸��쳣.List_Yi.main(List_Yi.java:24)

        �쳣�����ڣ�List�����޸��쳣��Դ��.md �ļ����С�
        */


        //��ȷʹ��:
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (str.equals("����")){
                list.add("ţ��,¬��ΰû�п��ң�");
            }
        }
        System.out.println(list);
        //forѭ����y y d s
    }

}
