package A1_MyJava.����֪ʶ.����.Collection.Collection�ӿ�;

import java.util.ArrayList;
import java.util.Collection;

/** API�н���:
* Collection ��νṹ �еĸ��ӿڡ�Collection ��ʾһ�������Щ����Ҳ��Ϊ collection ��Ԫ�ء�һЩ collection �������ظ���Ԫ�أ�����һЩ������
* һЩ collection ������ģ�����һЩ��������ġ�JDK ���ṩ�˽ӿڵ��κ�ֱ�� ʵ�֣����ṩ��������ӽӿڣ��� Set �� List��ʵ�֡�
* �˽ӿ�ͨ���������� collection��������Ҫ����ձ��Եĵط�������Щ collection��
**/
/*
Collection����ֱ��ʵ�֣�ֻ��ʵ���ӽӿ�[List]��[Set]�����ӽӿڡ�
java.util.Collection           Collection<����>

Collection�ǵ��м��ϵĶ���ӿڣ�����ʾһ�������Щ����Ҳ��ΪCollection��Ԫ�ء�
JDK���ṩ�˽ӿڵ��κ�ֱ��ʵ�֣����ṩ��������ӽӿ�(List��Set)ʵ�֡�

����Collection���ϵĶ���
-ʹ�ö�̬�ķ���
-����ʵ����List��ArrayList

========================================================================================================================
Collection���ϳ��÷���

   boolean add(E e)            ���Ԫ��
   boolean remove(Object o)    �Ӽ������Ƴ�ָ����Ԫ�� ��������������ֵ���Ƕ���Ԫ�����ݡ�
   void clear()                ��ռ����е�Ԫ��
   boolean contains(Object o)  �жϼ������Ƿ����ָ����Ԫ��
   boolean isEmpty()           �жϼ����Ƿ�Ϊ��
   int size()                  ���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ�����

========================================================================================================================
ʹ�ÿ�ݼ�ALT+7 �򿪽ṹ�����Կ������������Ϣ ����

*/
public class Collection_Lei {

    public static void main(String[] args) {
        //ʹ�ö�̬��д��
        Collection<String> arrayList = new ArrayList<String>();
        arrayList.add("�ʾ����м���");
        arrayList.add("ǡ��һ����ˮ������");
        System.out.println(arrayList);
        //������new�����ģ�ֱ�Ӵ�ӡ���ǵ�ֵַ��������ǣ���д��toString()����

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        //boolean add(E e) ���Ԫ��
        boolean boo = arrayList.add("��ѽ������������");
        System.out.println(boo+" "+arrayList);
        System.out.println("==============================================");

        //boolean remove(Object o) �Ӽ�����ɾ��ָ����Ԫ��
        boolean boo1 = arrayList.remove(1);//�Ƕ��󣬲�������ֵ
        boolean boo2 = arrayList.remove("��ѽ������������");
        System.out.println(boo1 + " " + boo2 + arrayList);
        System.out.println("==============================================");

        //void clear() ��ռ����е�Ԫ��
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("==============================================");

        //boolean contains(Object o) �жϼ������Ƿ����ָ����Ԫ��
        arrayList.add("�ʾ����м���");
        arrayList.add("ǡ��һ����ˮ������");
        boolean boole = arrayList.contains("ǡ��һ����ˮ������");
        System.out.println(boole+" "+arrayList);
        System.out.println("==============================================");

        //boolean isEmpty() �жϼ����Ƿ�Ϊ��
        boolean booE = arrayList.isEmpty();
        System.out.println(booE + " " + arrayList);
        System.out.println("==============================================");

        //int size() ���ϵĳ��ȣ�Ҳ���Ǽ�����Ԫ�صĸ�����
        int size = arrayList.size();
        System.out.println(size + " " + arrayList);
        System.out.println("==============================================");
    }

}
