package A1_MyJava.����֪ʶ.Lambda���ʽ.A10_����ʽ�ӿ���Ϊ�����ķ���ֵ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RunList {

    public static void main(String[] args) {
        //��������
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbbb");
        list.add("d");
        list.add("cc");

        //����ǰ�ļ���
        System.out.println("����ǰ�ļ���:" + list);

        //��Ȼ�����ļ���
        Collections.sort(list);
        System.out.println("��Ȼ�����ļ���:" + list);

        //ʹ�ñȽ��������ļ���
        Collections.sort(list, getComparator02());
        System.out.println("�Ƚ��������ļ���:" + list);


    }


    //Comparator�ӿ��Ǻ���ʽ�ӿ�:  @FunctionalInterface

    //ʹ�������ڲ���
    private static Comparator<String> getComparator01() {
        //�����ڲ�����Ϊ����ֵ
        return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
    }

    //ʹ��Lambda���ʽ��Ϊ��������ֵ
    private static Comparator<String> getComparator02() {
        //compare(String o1,String o2)
        return (o1, o2) -> o1.length() - o2.length();
    }

}
