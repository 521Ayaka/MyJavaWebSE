package A1_MyJava.����֪ʶ.����.Map.Map��ϰ.Map��ϰ3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DameHashMap {

    public static void main(String[] args) {
        //����
        new DameHashMap().init();
    }

    //��ʼ��
    public void init() {

        //��ʼ��
        System.out.println("=========================");

        //����ArrayList����, ����Ϊ:< HapMap<T,V> >ֵ��
        ArrayList<HashMap<String, String>> arrayMap = new ArrayList<>();

        //����HashMap����,�������Ӧ�ļ�ֵ��
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("���", "����");
        map1.put("���", "С��");
        HashMap<String, String> map2 = new HashMap<>();
        map1.put("����", "����");
        map1.put("���", "С��Ů");
        HashMap<String, String> map3 = new HashMap<>();
        map1.put("����", "����");
        map1.put("��ϣ", "����");

        //��ArrayList�����HashMap����
        arrayMap.add(map1);
        arrayMap.add(map2);
        arrayMap.add(map3);

        //����ArrayList    ����һ
        for (HashMap<String, String> mapH1 : arrayMap) {
            //��ȡmap�еļ�����
            Set<String> keySet = mapH1.keySet();
            for (String keyL : keySet) {
                //��ü���Ӧ��ֵ
                String valueL = mapH1.get(keyL);
                //��ӡ���
                System.out.println(keyL + " ϲ�� " + valueL);
                System.out.println("-------------");
            }
        }

        System.out.println("=========================");

        //����ArrayList    ������
        for (HashMap<String,String> mapH2: arrayMap) {
            //��ȡ��ǰ�ļ�ֵ�Լ���
            Set<Map.Entry<String, String>> em = mapH2.entrySet();
            //����HashMap����
            for (Map.Entry<String, String> keyToValue :em) {
                //��ü�
                String key = keyToValue.getKey();
                String value = keyToValue.getValue();
                //��ӡ���
                System.out.println(key + " ϲ�� " + value);
                System.out.println("-------------");

            }
        }
    }


}
