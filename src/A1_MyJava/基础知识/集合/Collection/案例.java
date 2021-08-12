package A1_MyJava.����֪ʶ.����.Collection;

import java.util.*;

/*
[Ҫ��]:
��дһ������,��ȡ10��1~20֮������������Ҫ������������ظ������ڿ���̨�����

[����]:
�������У���������
*/
public class ���� {

    public static void main(String[] args) {

        Random ran = new Random();

        //[Ҫ��]:��дһ������,��ȡ10��1~20֮������������Ҫ������������ظ������ڿ���̨�����
        //�������϶���
        Collection<Integer> set1 = new HashSet<>();

        //���Ԫ��
        while (set1.size()<10){
            set1.add(ran.nextInt(20)+1);
        }

        //��������
        for (int num :
                set1) {
            System.out.println(num);
        }

        System.out.println("=================");


        //[����]:�������У���������

        //����ʹ��TreeSet����,��Ȼ����
        TreeSet<Integer> set2 = new TreeSet<>();
        //���Ԫ��
        while (set2.size()<10){
            set2.add(ran.nextInt(20)+1);
        }
        //��������
        for (int num :
                set2) {
            System.out.println(num);
        }

        System.out.println("=================");

        //�������� TreeSet����,�Ƚ�����
        TreeSet<Integer> set3 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        //���Ԫ��
        while (set3.size()<10){
            set3.add(ran.nextInt(20)+1);
        }
        //��������
        Iterator<Integer> itr = set3.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
