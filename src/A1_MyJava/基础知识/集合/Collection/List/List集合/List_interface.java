package A1_MyJava.����֪ʶ.����.Collection.List.List����;
/*
java.util.List���� �̳��� Collection�ӿ�

List���ϸ���:
-- ���򼯺�(Ҳ��Ϊ����)���û����Ծ�ȷ�����б���ÿ��Ԫ�صĲ���λ�á��û�Ҳ����ͨ��������������Ԫ�أ��������б��е�Ԫ�ء�
-- ��Set���ϲ�ͬ���б�ͨ�������ظ���Ԫ�ء�

List�����ص�:
[������]: �洢��ȡ����Ԫ��˳��һ�¡�   ������ֵ��
[���ظ�]: �洢��Ԫ�ؿ����ظ���

========================================================================================================================
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_interface {

    public static void main(String[] args) {

        //ʹ�ö�̬�ķ�������List����
        List<String> list = new ArrayList<>();
        //�򼯺������Ԫ��
        list.add("������������Ϫ");
        list.add("��ͯ���Ϫˮ��");
        list.add("������ͨ��ˮȥ");
        list.add("��ˮ����տ����");
        list.add("ǡ������΢����");
        list.add("===========");
        //����ظ�Ԫ��
        list.add("������������Ϫ");
        list.add("��ͯ���Ϫˮ��");
        list.add("������ͨ��ˮȥ");
        list.add("��ˮ����տ����");
        list.add("ǡ������΢����");
        list.add("===========");
        //Ҳ��д��toString()����
        System.out.println(list);

        System.out.println("==========================================================================================");
        System.out.println("���򼯺ϣ�����ͨ������ֵ������Ӧλ��Ԫ��");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("==========================================================================================");

        //��������
        //ʹ������ѭ������
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //ʹ�õ���������
        System.out.println("ͨ��iterator����������");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }

}
