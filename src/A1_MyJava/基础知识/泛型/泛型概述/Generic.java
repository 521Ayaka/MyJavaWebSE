package A1_MyJava.����֪ʶ.����.���͸���;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
����: ��JDK5������ĵ����ԣ����ṩ�˱���ʱ���Ͱ�ȫ�����ƣ��û��������ڱ����Ǽ�⵽�Ƿ�������
     ���ı����ǡ����������͡���Ҳ����˵���в������������ͱ�ָ��Ϊһ��������

����: һ�ᵽ����������Ϥ�ľ��Ƕ��巽�������βΣ�Ȼ����ô˷���ʱ����ʵ�Ρ�

����������: ����˼�壬���ǡ���������ԭ���ľ�������Ͳ�������Ȼ����[ʹ��/����]ʱ�����������͡�

ʹ��: ���ֲ������Ϳ����ڡ��ࡿ�����������͡��ӿڡ��У��ֱ𱻳�Ϊ�������ࡿ�������ͷ������������ͽӿڡ�

�ô�: 1. ������ǰ��������ʱ�쳣,��������������ʱ���֣��ڱ���ʱ�Ϳ��Է��ִ��󣬼�ʱ�޸ģ������޷�ͨ������
     2. ������ǿ��ת������
==================================================================================

���Ͷ����ʽ:
-- <����>:             ָ��һ�����͸�ʽ�����Կ����βΡ�
-- <����1,����2,...>:   ָ���������͸�ʽ���ö��Ÿ�����
-- ����������õ�ʱ��ָ��������--->ʵ��  ʵ�ε�����ֻ��ʱ�����������͡�

*/
public class Generic {

    public static void main(String[] args) {

        try {
            Collection array = new ArrayList(); //Ĭ��Object����
            array.add("���");
            array.add("Java");
            array.add("JavaEE");
            array.add(100);

            Iterator itr = array.iterator();
            while (itr.hasNext()){
                String str = (String) itr.next();
                System.out.println(str);
            }
        }catch(ClassCastException e){
            System.out.println("int 100����>String ��ת���쳣");
        }

        Collection<String> arrayList = new ArrayList<>();
        arrayList.add("���");
        arrayList.add("Java");
        arrayList.add("JavaEE");
        //arrayList.add(100);//����ʱ�쳣
        //������ǰ��������ʱ�쳣
        Iterator itr = arrayList.iterator();
        while (itr.hasNext()){
            String str = (String) itr.next();
            System.out.println(str);
        }

    }



}
