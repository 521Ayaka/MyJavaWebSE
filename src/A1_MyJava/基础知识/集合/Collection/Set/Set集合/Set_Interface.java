package A1_MyJava.����֪ʶ.����.Collection.Set.Set����;

/*
Set����ûʲô̫����ص�
��ѧ��Collection�ӿ�ʱ�����൱��ѧ��Set����
��Ҫע��:
Set�����ص�:
1. �������ظ�Ԫ�صļ���
2. û�д������ķ���, ���Բ���ʹ����ͨforѭ��������

HashSet: ������֤ set �ĵ���˳��

Set���ϻ�ȡ�ʹ��붼�������������Ǻ�Collectionһ��(Object 0bj)Ϊ������

*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Interface {

    public static void main(String[] args) {

        //ʹ�ö�̬�ķ�ʽ�������϶���
        Set<String> setSet = new HashSet<>();
        setSet.add("���������");
        setSet.add("�ʾ����м����");
        setSet.add("ǡ��һ����ˮ����");
        setSet.add("�ʾ����м����");//�ظ�Ԫ��
        System.out.println(setSet);//[ǡ��һ����ˮ����, ���������, �ʾ����м����]
                                   // û���ظ�Ԫ�أ�Ҳû��˳��
        System.out.println("================================================");
        System.out.println("================================================");

        //��������
        //ʹ�õ��������б���
        Iterator<String> itr = setSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("================================================");

        //ʹ����ǿforѭ��
        for (String name :
                setSet) {
            System.out.println(name);
        }
        System.out.println("================================================");

        System.out.println(setSet.hashCode());
    }

}
