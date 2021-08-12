package A1_MyJava.����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet;

/*
TreeSet���ϸ������ص�:

1. ��Ԫ��������ġ�,�����˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ���������򣬾�������ʽȡ���ڹ��췽����
     [�޲ι���]                         TreeSet(): ������Ԫ�ص���Ȼ�����������
     [Comparator] TreeSet(Comparator comparator): ����ָ���ıȽ�����������

2. û�д������ķ��������Բ���ʹ����ͨforѭ��������

3. ������Set���ϣ����Բ������ظ�Ԫ�صļ��ϡ�

*/

import java.util.TreeSet;

public class TreeSet_Lei {

    public static void main(String[] args) {

        //�������϶���
        TreeSet<Integer> treeSet = new TreeSet<Integer>();

        //���Ԫ��
        treeSet.add(30);
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        treeSet.add(30);//�ظ�Ԫ��
        treeSet.add(40);//�ظ�Ԫ��

        //��������
        for (int num :
                treeSet) {
            System.out.println(num);
        }/*
        10
        20
        30
        40
        50
        */

    }

}
