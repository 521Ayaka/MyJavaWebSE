package A1_MyJava.����֪ʶ.����.Collection.Set.Set�Ӽ���.LinkedHashSet;

/*
LinkedHashSet���ϸ������ص�:
1. [��ϣ��]��[����]ʵ�ֵ�Set�ӿڣ����п�Ԥ��ĵ�������
2. ��[����]��֤Ԫ������Ҳ����˵Ԫ�صĴ洢��ȡ��˳����һ�µ�
3. ��[��ϣ��]��֤Ԫ��Ψһ��Ҳ����˵û���ظ���Ԫ�ء�


*/

import java.util.LinkedHashSet;

public class LinkedHashSet_Lei {

    public static void main(String[] args) {

        //����LinkedHashList���϶���
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        //���Ԫ��
        linkedHashSet.add("����");
        linkedHashSet.add("�ʾ����м����");
        linkedHashSet.add("ǡ��һ����ˮ����");
        linkedHashSet.add("����");//�ظ�Ԫ��

        //��������
        for (String str :
                linkedHashSet) {
            System.out.println(str);
        }/*
        ����
        �ʾ����м����
        ǡ��һ����ˮ����
        */


    }

}
