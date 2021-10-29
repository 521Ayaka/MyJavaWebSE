package ����֪ʶ.����.Collections������;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
1:���췽��˽�л������ܴ�������
private Collections() {
}

2:��Ա������̬��; ��Ա������̬��;

���ԣ�Collections��һ�������ࡣ

API������
������ȫ���� collection �Ͻ��в����򷵻� collection �ľ�̬������ɡ�
�������� collection �ϲ����Ķ�̬�㷨��������װ������
��װ��������ָ�� collection ֧�ֵ��� collection���Լ������������ݡ�

˵��:��Collections������Լ��ϲ����Ĺ����ࡿ

���õķ���
--public static <T extends Comparable<? sup T> > void sort(List<T> list): ��ָ�����б���������

--public static void reverse(List<?> list):            ��תָ�����б��е�Ԫ�ص�˳��

--public static void shuffle(List<?> list):            ʹ��Ĭ�ϵ����Դ�������ָ�����б�
*/
public class TestCollection {
    //����
    public static void main(String[] args) {
        new TestCollection().init();
    }

    public void init(){
        //��ʼ��
        System.out.println("===============================================================");


        //�ȴ���һ��List����
        List<String> list = new ArrayList<>();
        list.add("3�ʾ����м����");
        list.add("4��ʥ���´ﲻ��");
        list.add("1����������ˮ��");
        list.add("2׳ʿһȥ�ⲻ����");

        //ͨ��Collections�������޸�����

        //public static <T extends Comparable<? sup T> > void sort(List<T> list): ��ָ�����б���������
        Collections.sort(list);
        System.out.println(list);
        //[1����������ˮ��, 2׳ʿһȥ�ⲻ����, 3�ʾ����м����, 4��ʥ���´ﲻ��]

        System.out.println("===============================================================");

        //public static void reverse(List<?> list):            ��תָ�����б��е�Ԫ�ص�˳��
        Collections.reverse(list);
        System.out.println(list);
        //[4��ʥ���´ﲻ��, 3�ʾ����м����, 2׳ʿһȥ�ⲻ����, 1����������ˮ��]

        System.out.println("===============================================================");

        //public static void shuffle(List<?> list):            ʹ��Ĭ�ϵ����Դ�������ָ�����б�
        Collections.shuffle(list);
        System.out.println(list);
        //[2׳ʿһȥ�ⲻ����, 1����������ˮ��, 3�ʾ����м����, 4��ʥ���´ﲻ��]

        System.out.println("===============================================================");

        List<String> listE;
        Collections.shuffle(list);
        System.out.println(list);
    }

}
