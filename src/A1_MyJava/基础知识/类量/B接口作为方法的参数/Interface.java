package A1_MyJava.����֪ʶ.����.B�ӿ���Ϊ�����Ĳ���;
/*

java.util.List����ArrayList��ʵ�ֵĽӿ�
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable
{......}


*/

import java.util.ArrayList;
import java.util.List;

public class Interface {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //ʹ�ö�̬д��
        List<String> list = new ArrayList<>();
        //����addNames() ���������list �� ����add���list
        List<String> ¬��ΰ = addNames( list);
        //��������
        for (int i = 0; i < ¬��ΰ.size(); i++) {
            System.out.println(¬��ΰ.get(i));
        }
    }


    //������ȡlist���ϣ����Ԫ�ر�������list����
    public static List<String> addNames(List<String> list){
        list.add("�����Ȱ�");
        list.add("��������");
        list.add("�������");
        list.add("ɳ������");
        return list;
    }



}
