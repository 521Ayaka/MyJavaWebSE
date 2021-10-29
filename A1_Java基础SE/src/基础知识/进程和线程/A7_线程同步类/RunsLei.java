package ����֪ʶ.���̺��߳�.A7_�߳�ͬ����;
/*
    �̰߳�ȫ����:
        StringBuffer
        Vector
        Hashtable

*/

import java.util.*;

public class RunsLei {

    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer();    //synchronized�������̰߳�ȫ��
        StringBuilder sb2 = new StringBuilder();  //û��ʹ��synchronized����

        Vector<String> ve = new Vector<>();          //synchronized�������̰߳�ȫ��
        ArrayList<String> list = new ArrayList<>();  //û��ʹ��synchronized����

        Hashtable<String, String> ht = new Hashtable<>(); //synchronized�������̰߳�ȫ��
        HashMap<String, String> hm = new HashMap<>();     //û��ʹ��synchronized����

        //==========================================================================
        /*
        һ����˵,�߳�ͬ��ʱ��ʹ��StringBuffer��Vector��Hashtable������������
        ����,Vector��HashtableҲ������ʹ�á�
        ʹ��,Collections �еķ��� ������
                public static <T> List<T> synchronizedList(List<T> list)
                public static <K,V> Map<K,V> synchronizedMap(Map<K,V> m)
                ......
        */

        List<String> array = Collections.synchronizedList(new ArrayList<String>());
        //array����ͬ����ȫ����
        Map<String, String> map = Collections.synchronizedMap(new HashMap<String, String>());
        //map����ͬ����ȫ����


    }

}
