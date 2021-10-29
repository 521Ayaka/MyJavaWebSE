package 基础知识.基础.Array;

public class ArrayCopy {

    public static void main(String[] args) {
        int [] array1 = new int[] {0, 1, 2, 3, 4, 5, 6, 7};

        int [] array2 = new int[] {10,11,12,13,14,15,16,17};
                      //来源数组   //源数组起始位置     //目的数组     //目的数组起始位置       //复制长度
        System.arraycopy(array1,    3,        array2,      4,            2);

        for (int i = 0; i < array1.length; i++) {

            System.out.println(array2[i]);

        }

    }




}
