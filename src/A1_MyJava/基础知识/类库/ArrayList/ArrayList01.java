package A1_MyJava.����֪ʶ.���.ArrayList;
/*
ʹ��ArrayMethod������ĳ��Ȳ����Է����ı䡣
��ArrayList���ϵĳ��ȿ������ⷢ���ı䡣

1.����
import java.util.ArrayList;

2.����
ArrayList<����> list = new ArrayList<>();

ע�⣺
����ArrayList��˵������һ��<>���� �� ���� ��
���� ֻ���������ͣ������ǻ������͡�

3.ʹ��


 */
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        //����ʱ �ұ�Ҫ��<>���ݿ��Բ�д����<>����Ҫ����

        System.out.println(list);
        //��ArrayListL������˵��ֱ�Ӵ�ӡ�õ��Ĳ��ǵ�ֵַ���������ݡ�
        System.out.println("==========================");

        list.add("gangajiang");
        System.out.println(list);

        list.add("����");
        list.add("���ν�");
        list.add("����Ԫ");
        list.add("���");
        System.out.println(list);

        ArrayList<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(2);
        array.add(1);
        System.out.println(array);

    }
}
