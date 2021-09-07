package A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    //����
    public static void main(String[] args) {
        new DameHashMap().init();
    }

    //��ʼ��
    public void init(){
        //��ʼ��
        System.out.println("==============================");

        //����HashMap, ����Ϊ < String, ArrayList<String> >
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        //��������ArrayList�����Ԫ��, ����Ϊ < String >
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("����");
        list1.add("����");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("����");
        list2.add("����");
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("����");
        list3.add("����");

        //��HashMap��������Ӽ���ֵΪArrayList
        map.put("�మ",list1);
        map.put("��ɱ",list2);
        map.put("����",list3);

        //����HashMap����     ����һ
        Set<String> keySet = map.keySet();
        for (String keyL :keySet) {
            //��ü�ֵ
            ArrayList<String> valueL = map.get(keyL);
            //��������
            for (String str :valueL) {
                //��ӡ���
                System.out.println("==="+keyL+"===");
                System.out.println(str);
            }
            System.out.println("===============");
        }

        System.out.println("==============================");

        //����HashMap����     ������
        Set<Map.Entry<String, ArrayList<String>>> em = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> keyToValue :em) {
            //��ü�
            String key = keyToValue.getKey();
            ArrayList<String> value = keyToValue.getValue();
            //����ArrayList
            for (String str :value) {
                //��ӡ���
                System.out.println("==="+key+"===");
                System.out.println(str);
            }
            System.out.println("===============");
        }

    }

}
