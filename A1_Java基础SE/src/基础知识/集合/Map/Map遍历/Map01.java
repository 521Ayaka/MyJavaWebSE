package ����֪ʶ.����.Map.Map����;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

    public static void main(String[] args) {

        //��̬��������
        Map<String, Integer> map = new HashMap<>();

        //��Ӽ�ֵ��
        map.put("���ν�", 1);
        map.put("������", 2);
        map.put("���ε�", 3);
        map.put("������", 4);
        map.put("������", 5);

        //�������ļ���
        Set<String> key = map.keySet();

        //����
        for (String strKey: key){
            //ͨ����ȡ�ļ��������Ӧ��ֵ
            Integer value = map.get(strKey);
            //���/����
            System.out.println(strKey+"="+value);
        }


    }

}
