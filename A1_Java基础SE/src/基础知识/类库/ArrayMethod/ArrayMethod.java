package 基础知识.类库.ArrayMethod;

import java.util.Arrays;

public class ArrayMethod {
    public static void main(String[] args) {
        Lei[] array = new Lei[4];

        Lei a = new Lei(6,"尴尬酱", true);
        Lei b = new Lei( 66, "gangajaing", false);
        Lei c = new Lei(666, "就是很六" , true);
        Lei d = new Lei(666666, "六个六",false);

        array[0] = a;
        array[1] = b;
        array[2] = c;
        array[3] = d;

        System.out.println("=============================================================================================================");
        System.out.println(Arrays.toString(array));//打印地址哈希值
        System.out.println("=============================================================================================================");

        System.out.println(array[2].getStr());
    }
}
