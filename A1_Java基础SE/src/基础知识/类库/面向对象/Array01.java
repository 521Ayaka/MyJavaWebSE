package ����֪ʶ.���.�������;

public class Array01 {

/*

1����������Ԫ�ص�maxֵ����minֵ
2�����鷴ת

*/

    public static void main(String[] args) {

        int [] array = new int[]{15,21,53,35,35,46,};

        int max =array[0];

        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }

        System.out.println("array����Ԫ��Ϊ��"+max);

        System.out.println("=====================================================");

        System.out.println("ԭ����Ϊ��");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================================================");

        System.out.println(method(array));

        int[] array2 = method(array);

        System.out.println("====================================================");

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

    }

    public static int[] method(int[] array){

        for(int min=0, max=array.length-1; min <= max; max--, min++){
            int x = array[min];
            array[min] = array[max];
            array[max] = x;
        }

        return array;
    }



}