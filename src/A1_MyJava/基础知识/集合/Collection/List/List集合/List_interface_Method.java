package A1_MyJava.����֪ʶ.����.Collection.List.List����;

import java.util.ArrayList;
import java.util.List;

/*

List�������з���:

void add(int index, E element)   �ٴ˼����е�ָ��λ�ò���ָ����Ԫ�ء�
E remove(int index)              ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ�ء�
E set(int index, E element)      �޸�ָ��λ�ô���Ԫ�أ����ر��޸ĵ�Ԫ�ء�
E get(int index)                 ����ָ����������Ԫ�ء�

[ע��]:
remove set get �����Ĳ��� index ���ܻ���������Խ���쳣��ʹ��ʱ����Խ�硣
*/
public class List_interface_Method {

    public static void main(String[] args) {

        //void add(int index, E element)   �ٴ˼����е�ָ��λ�ò���ָ����Ԫ�ء�
        System.out.print("1: ");
        List<Double> list1 = new ArrayList<>();
        list1.add(0.0);
        list1.add(1.0);
        list1.add(2.0);
        list1.add(3.0);
        list1.add(2,1.5);
        System.out.println(list1);//[0.0, 1.0, 1.5, 2.0, 3.0]
        System.out.println("list1[2] = "+list1.get(2));//����ǣ�1.5
        //Ҳ����˵����index��������λ�����Ԫ��,�������Ԫ�ؽ��ڴ�index����λ�ã���ԭ�����indexλ�ü������Ԫ�ؽ�������ƶ�һ��˵����ֵ��
        //list1.add(7,6.66);  //.IndexOutOfBoundsException ����Խ���쳣������

        System.out.println("=========================================================================================");

        //E remove(int index)              ɾ��ָ����������Ԫ�أ����ر�ɾ����Ԫ�ء�
        System.out.print("2: ");
        List<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        int LIST_2 = list2.remove(0);
        System.out.println(list2);//�����: [1, 2, 3]
        System.out.println("��ɾ����Ԫ����: "+ LIST_2);//��ɾ����Ԫ����: 0

        System.out.println("=========================================================================================");

        //E set(int index, E element)      �޸�ָ��λ�ô���Ԫ�أ����ر��޸ĵ�Ԫ�ء�
        System.out.print("3: ");
        List<Integer> list3 = new ArrayList<>();
        list3.add(0);
        list3.add(1);
        list3.add(2);
        list3.add(3);
        int LIST_3 = list3.set(0, 666);
        System.out.println(list3);//[666, 1, 2, 3]
        System.out.println("���޸ĵ�ԭԪ����: "+LIST_3);//���޸ĵ�ԭԪ����: 0

        System.out.println("=========================================================================================");

        //E get(int index)                 ����ָ����������Ԫ�ء�
        System.out.print("4: ");
        List<Integer> list4 = new ArrayList<>();
        list4.add(0);
        list4.add(1);
        list4.add(2);
        list4.add(3);
        System.out.print("[");
        for (int i = 0; i < list4.size(); i++) {
            if (i != (list4.size()-1)){
                System.out.print(list4.get(i)+",");
            } else {
                System.out.print(list4.get(i));
            }
        }
        System.out.println("]");

        System.out.println("=========================================================================================");

    }

}
