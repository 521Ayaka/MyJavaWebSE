package A1_MyJava.����֪ʶ.����.���ϰ���;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZu {

    private String userName1 = "������";
    private String userName2 = "���ε�";
    private String userName3 = "���ν�";

    //����
    public static void main(String[] args) {
        new DouDiZu().init();
    }

    //��ʼ��
    public void init() {

        //�����ƺУ�ʹ��ArrayList����
        ArrayList<String> list = new ArrayList<>();

        //������ɫ��
        String[] colors = {"����", "����", "����", "����"};
        //�����Ƶ���
        String[] nums = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        //��num��ӵ�colors��
        for (String color : colors) {
            for (String num : nums) {
                list.add(color + num);
            }
        }
        //��Ӵ�С��
        list.add("С��");
        list.add("����");

        //����ϴ��ʹ��Collections��shuffle()��̬����
        Collections.shuffle(list);

        //����3���飬�ֱ�洢3���˵�����
        ArrayList<String> user1 = new ArrayList<>();
        ArrayList<String> user2 = new ArrayList<>();
        ArrayList<String> user3 = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        //���ƣ�ʹ����ͨforѭ��
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (i >= list.size() - 3) {
                dp.add(str);
            } else if (i % 3 == 0) {
                user1.add(str);
            } else if (i % 3 == 1) {
                user2.add(str);
            } else if (i % 3 == 2) {
                user3.add(str);
            }
        }
        //���ж��Ƶ�����
        HashMap<String, Integer> map = new HashMap<>();



        //���ò鿴�Ƶķ���
        Value(userName1, user1);
        Value(userName2, user2);
        Value(userName3, user3);
        Value("������", dp);


    }

    //���û���������
    public static void sort(String userName,ArrayList<String> list){
        HashMap<String, String> map = new HashMap<>();
        //����Map���ϴ洢�ƺ��Ƶĸ���

    }

    //�鿴�����ķ�����
    public static void Value(String name, ArrayList<String> array) {
        System.out.println("������" + name);
        System.out.print("��Ϊ��");
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println("\n===============================================================================================");
    }

}
