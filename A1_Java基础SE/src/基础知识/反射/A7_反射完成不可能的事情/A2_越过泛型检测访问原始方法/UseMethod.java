package ����֪ʶ.����.A7_������ɲ����ܵ�����.A2_Խ�����ͼ�����ԭʼ����;
/*
    Ҫ��
    ��ArrayList<Integer> ���ϵ������ [�ַ���] ,������Integer

*/

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class UseMethod {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        //����ArrayList����
        ArrayList<Integer> array = new ArrayList<>();

        //��ȡclass����
        Class<? extends ArrayList> c = array.getClass();

        //�����ȡadd����
        Method addMe = c.getDeclaredMethod("add", Object.class);
        //�򼯺ϵ������ �ַ���
        boolean isAdd = (boolean) addMe.invoke(array, "���������");
        System.out.println("�Ƿ���ӳɹ�" + isAdd +"\n");
        addMe.invoke(array, "������������");
        addMe.invoke(array, "��ȡԭʼ����");

        //�������:
        for (Object o: array) {
            System.out.println(o);
        }
        System.out.println(array);
        /*���н��:

        �Ƿ���ӳɹ�true

        ���������
        ������������
        ��ȡԭʼ����
        [���������, ������������, ��ȡԭʼ����]
        */

    }

}
