package ����֪ʶ.���.ArrayList;
/*
���ϣ����ArrayList���� ����������͵Ļ�������ʹ�û������Ͷ�Ӧ�ġ���װ�ࡱ��

��������        ��װ�ࣨ�������ͣ���װ�඼λ��java.lang���£�
byte          Byte
short         Short
int           Integer     �����⡿
long          Long
float         Float
double        Double
char          Character   �����⡿
boolean       Boolean

*/

import java.util.ArrayList;

public class ArrayList03Basic {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);

        System.out.println(array1);
        System.out.println(array1.get(3));
        System.out.println("����ĳ���Ϊ��" + array1.size());

    }
}
