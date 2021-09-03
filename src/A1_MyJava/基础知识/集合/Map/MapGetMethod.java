package A1_MyJava.����֪ʶ.����.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map���ϻ�ȡ����:

V get(Object key)                  ���ݼ���ȡֵ

Set<K> keySet()                    ��ȡ���м��ļ���

Collection<V> values()             ��ȡ����ֵ�ļ���

Set<Map.Entry<K,V>> entrySet()     ��ȡ���м�ֵ�Զ���ļ���

*/
public class MapGetMethod {

    public static void main(String[] args) {

        //����Map����
        Map<String, String> map = new HashMap<>();

        //��Ӽ�ֵ��
        map.put("������ʫ��","�µ�");
        map.put("�춯����","����");
        map.put("�����һ��","�Ͷ�");
        map.put("��","����");
        System.out.println("==================================");

        // V get(Object key)                  ���ݼ���ȡֵ
        System.out.println(map.get("�����һ��")); //�Ͷ�
        System.out.println(map.get("�춯����"));  //����
        System.out.println(map.get("��������"));  //null
        System.out.println("==================================");

        //Set<K> keySet()                    ��ȡ���м��ļ���
        System.out.println(map.keySet());//��ֱ�Ӵ�ӡ
        Set<String> setMap = map.keySet();//�ɴ������ϻ�ȡ
        System.out.println("�����ϱ���:");
        for (String str :
                setMap) {
            System.out.println(str);
        }
        System.out.println("==================================");

        //Collection<V> values()             ��ȡ����ֵ�ļ���
        Collection<String> values = map.values();
        System.out.println("ֵ���ϱ���:");
        for (String str :
                values) {
            System.out.println(str);
        }
        System.out.println("==================================");

    }

}
