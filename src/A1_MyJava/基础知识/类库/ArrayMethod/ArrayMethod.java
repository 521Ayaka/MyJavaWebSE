package A1_MyJava.����֪ʶ.���.ArrayMethod;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        Lei[] array = new Lei[4];

        Lei a = new Lei(6,"���ν�", true);
        Lei b = new Lei( 66, "gangajaing", false);
        Lei c = new Lei(666, "���Ǻ���" , true);
        Lei d = new Lei(666666, "������",false);

        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        System.out.println("=============================================================================================================");
        System.out.println(Arrays.toString(array));//��ӡ��ַ��ϣֵ
        System.out.println("=============================================================================================================");

        System.out.println(array[2].getStr());
    }
}
