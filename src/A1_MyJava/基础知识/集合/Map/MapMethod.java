package A1_MyJava.����֪ʶ.����.Map;

import java.util.HashMap;
import java.util.Map;

/*
Map���ϵĻ�������

V put(K key, V value)                 ��Ӽ�ֵ��
V remove(Object key)                  ���ݼ�ɾ����ֵ��Ԫ��
void clear()                          �Ƴ����еļ�ֵ��Ԫ��
boolean containsKey(Object key)       �жϼ����Ƿ����ָ���ļ�
boolean containsKey(Object value)     �жϼ����Ƿ����ָ����ֵ
int size()                            ���ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
boolean isEmpty()                     �жϼ����Ƿ�Ϊ��
*/
public class MapMethod {

    public static void main(String[] args) {

        //��̬����Map���϶���
        Map<String, String> map = new HashMap<String,String>();

        //V put(K key, V value)                 ��Ӽ�ֵ��
        map.put("������ʫ��","�µ�");
        map.put("�춯����","����");
        map.put("�����һ��","�Ͷ�");
        map.put("��","����");
        System.out.println(map);

        //V remove(Object key)                  ���ݼ�ɾ����ֵ��Ԫ��
        map.remove("��");
        System.out.println(map);

        //void clear()                          �Ƴ����еļ�ֵ��Ԫ��
        map.clear();
        System.out.println(map);

        //������ӻ���
        map.put("������ʫ��","�µ�");
        map.put("�춯����","����");
        map.put("�����һ��","�Ͷ�");
        System.out.println("������ӻ�����" + map);

        //boolean containsKey(Object key)       �жϼ����Ƿ����ָ���ļ�
        System.out.println(map.containsKey("�����һ��"));
        System.out.println(map.containsKey("��"));

        //boolean containsKey(Object value)     �жϼ����Ƿ����ָ����ֵ
        System.out.println(map.containsValue("�Ͷ�"));
        System.out.println(map.containsValue("����"));

        //int size()                            ���ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
        System.out.println("��ֵ�Ӹ�����" + map.size());

        //boolean isEmpty()                     �жϼ����Ƿ�Ϊ��
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println("clear��" + map.isEmpty());


    }

}
