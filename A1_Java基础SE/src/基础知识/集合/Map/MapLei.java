package ����֪ʶ.����.Map;
/*
Map���ϸ���:

1. interface Map<K,V> K: ��������;  V: ֵ������
2. ����ӳ�䵽ֵ�Ķ���; ���ܰ����ظ��ļ�; ÿ��������ӳ�䵽���һ��ֵ;

*/
import java.util.HashMap;
import java.util.Map;

public class MapLei {

    public static void main(String[] args) {

        //�ö�̬�ķ�������Map���϶���
        Map<String, String> map = new HashMap<String, String>();

        //���ӳ�� ʹ��put������ V put(K key, V value);
        map.put("������ʫ��","�µ�");
        map.put("�춯����","����");
        map.put("�����һ��","�Ͷ�");
        map.put("�춯����","Ħ����˹");//��ֵ��Ψһ�ģ����������ʱ�������ֵ���滻��ǰ��ֵ

        //�����ӡ
        System.out.println(map);
        //��дtoString��������� ��{�����һ��=�Ͷ�, ������ʫ��=�µ�, �춯����=����}
        //���Ҳ������ġ�


    }

}
