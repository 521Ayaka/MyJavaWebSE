package ����֪ʶ.����.Collection.Set.Set�Ӽ���.HashSet;
/*
[HashSet�����ص�]:

1. �ײ����ݽṹ�ǹ�ϣ��
2. �Լ��ϵĵ���˳�����κα�֤, Ҳ����˵����֤�洢��ȡ����Ԫ��˳��һ��
3. û�д������ķ���, ���Բ���ʹ����ͨforѭ������
4. ������Set����, �����ǲ������ظ�Ԫ�صļ���

*/

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Impl {

    public static void main(String[] args) {

        //��������
        HashSet<String> hashSet = new HashSet<>();
        //���Ԫ��
        hashSet.add("����");
        hashSet.add("���");
        hashSet.add("�����");
        hashSet.add("����");//�ظ�Ԫ��
        hashSet.add("���");//�ظ�Ԫ��
        System.out.println("================");
        System.out.println(hashSet.add("����"));//�ظ�Ԫ��

        //����
        Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=======");
        for (String name :
                hashSet) {
            System.out.println(name);
        }


    }

}
