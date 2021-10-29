package ����֪ʶ.����.Map.Map��ϰ.Map��ϰ5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {
        new DameHashMap().init();
    }

    public void init(){

        //�����ַ���
        System.out.println("������:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//ɨ����һ�У���������ΪString

        //����һ��HashMap����
        HashMap<Character, Integer> map = new HashMap<>();

        //����ַ�
        for (int i = 0; i<str.length(); i++){
            char key = str.charAt(i);

            Integer value = map.get(key);
            if (value == null){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
            }

        }

        //����HashMap   ����һ
        Set<Character> keySet = map.keySet();
        for (Character keyL :keySet) {
            //���ֵ
            Integer value = map.get(keyL);
            //��ӡ���
            System.out.print(new StringBuilder().append(keyL).append("(").append(value).append(")"));
            //����ʹ����StringBuilder()�࣬������append();
        }
        System.out.println();
        System.out.println("=====================================================");

        //����HashMap   ������
        Set<Map.Entry<Character, Integer>> em = map.entrySet();
        for (Map.Entry<Character, Integer> keyToValue :em) {
            //��ȡ����ֵ
            Character key = keyToValue.getKey();
            Integer value = keyToValue.getValue();
            //�����ַ���
            System.out.print(new StringBuilder().append(key).append("(").append(value).append(")"));

        }
    }

}
