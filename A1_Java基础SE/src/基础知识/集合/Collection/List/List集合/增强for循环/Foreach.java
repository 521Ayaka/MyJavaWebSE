package ����֪ʶ.����.Collection.List.List����.��ǿforѭ��;

/*
��ǿforѭ��
��ǿfor: �������Collection���ϵı�����

Collection�̳���Iterable�ӿ�
�ڡ�Iterable �ӿ�����һ�� iterator()���󷽷�����������
ʵ������ӿ���������Ϊ "foreach" ����Ŀ�ꡣ

[����]:
1. ʵ����Iterable�ӿڵ�������������Ϊ��ǿ��for����Ŀ��
2. ����JDK5֮����ֵģ����ڲ�ԭ����һ��Iterator��������

[��ʽ]:
for(Ԫ���������� ������: ����/Collection����){
   //ʹ�ñ������ɣ��ñ�������Ԫ��
}

[]
*/
public class Foreach {

    public static void main(String[] args) {

        int [] array = {0,1,3,4,5,6};
        for (int num : array) {
            System.out.println(num);
        }
        System.out.println("====");
        //��IDEA��������foreach���Կ���ʹ��
        for (int num :
                array) {
            System.out.println(num);
        }

    }

}
