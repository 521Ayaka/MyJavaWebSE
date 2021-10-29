package 基础知识.类库.ArrayList;
/*
如果希望想ArrayList当中 储存基本类型的话，必须使用基本类型对应的“包装类”。

基本类型        包装类（引用类型，包装类都位于java.lang包下）
byte          Byte
short         Short
int           Integer     【特殊】
long          Long
float         Float
double        Double
char          Character   【特殊】
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
        System.out.println("数组的长度为：" + array1.size());

    }
}
