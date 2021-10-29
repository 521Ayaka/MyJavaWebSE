package ����֪ʶ.����.���ϰ���;
/*
 * �洢ʹ�� HashMap
 * ϴ��ʹ�� ArrayList
 * �û����� TreeSet
 *
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class DouDiZuNew {

    //�����û���Ϣ
    private String userName1 = "������";
    private String userName2 = "���ε�";
    private String userName3 = "���ν�";
    //������ɫ������
    private String[] colorOf = {"����", "����", "����", "����"};
    private String[] numOf = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    //�û�����,   �����û�������, ʹ��TreeSet���ϣ���������ʹ����Ȼ����(����)
    private TreeSet<Integer> user1 = new TreeSet<>();
    private TreeSet<Integer> user2 = new TreeSet<>();
    private TreeSet<Integer> user3 = new TreeSet<>();
    private TreeSet<Integer> hands = new TreeSet<>();


    /**
     * ����
     */
    public static void main(String[] args) {
        //����
        new DouDiZuNew().init();
    }

    /**
     * ��ʼ��
     */
    public void init() {

        //����HashMap����
        HashMap<Integer, String> map = new HashMap<>();

        //����������,����洢����HashMap�����еļ�ֵ index
        ArrayList<Integer> list = new ArrayList<>();

        /**�������飺*/
        //���ô洢�ƣ��洢���
        this.hashMapAdd(map, list);

        //����ϴ��
        this.shuffle(list);

        //���÷���
        this.distribute(list, map);
        System.out.println(list);

        //���ò鿴�û���
        look(userName1, user1, map);
        look(userName2, user2, map);
        look(userName3, user3, map);

    }

    /**
     * ================================================================================
     */

    //��HashMap�д洢���� , ������ArrayList���ϵ�����Ӽ�ֵ���
    public void hashMapAdd(HashMap<Integer, String> map, ArrayList<Integer> list) {
        //��ʼ������
        int index = 0;
        //����numOf����ѭ��, ��֤TreeSet������������
        for (String num : numOf) {
            for (String color : colorOf) {
                //��map����Ӽ�ֵ��
                map.put(index, color + num);
                //��ArrayList��Ӽ�ֵ���
                list.add(index);
                //index++
                index++;
            }
        }
        //��Ӵ�С��
        map.put(index, "С��");
        list.add(index);
        index++;
        map.put(index, "����");
        list.add(index);
    }

    //����ϴ��
    public void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
    }

    //���Ƶķ���
    public void distribute(ArrayList<Integer> list, HashMap<Integer, String> map) {
        for (int i = 0; i < list.size(); i++) {
            if (i >= 54) {
                hands.add(list.get(i));
            } else if (i % 3 == 0) {
                user1.add(list.get(i));
            } else if (i % 3 == 1) {
                user2.add(list.get(i));
            } else if (i % 3 == 2) {
                user3.add(list.get(i));
            }
        }
    }

    //�鿴�� , �û���������
    public void look(String name, TreeSet<Integer> set, HashMap<Integer, String> map) {
        System.out.println("����:" + name);
        System.out.print("����Ϊ:");
        int in = 1;
        for (Integer index : set) {
            if (in < set.size()) {
                System.out.print(map.get(index) + " , ");
            } else {
                System.out.print(map.get(index + "��"));
            }
            in++;
        }
        System.out.println();
        System.out.println("=============================================================================================================================================");
    }
}
