package A1_MyJava.����֪ʶ.��̬.StaticLei;

/**
java.util.Arrays��һ����������صĹ����࣬�����ṩ�˴�����̬����������ʵ�����鳣���Ĳ�����

public static String toString(����)���������������ַ���������Ĭ�ϸ�ʽ��[Ԫ��1, Ԫ��2, Ԫ��3...]��
public static void sort(����)������Ĭ�����򣨴�С���󣩶������Ԫ�ؽ�������

��ע��
1. �������ֵ��sortĬ�ϰ��������С����
2. ������ַ�����sortĬ�ϰ�����ĸ����
3. ������Զ�������ͣ���ô����Զ��������Ҫ��Comparable����Comparator�ӿڵ�֧�֡������ѧϰ��
 */
public class ArraysLei01 {

    public static void main(String[] args) {
        int[] intArray = {10, 20, 30};
        // ��int[]���鰴��Ĭ�ϸ�ʽ����ַ���
        String intStr = java.util.Arrays.toString(intArray);
        System.out.println(intStr); // [10, 20, 30]

        int[] array1 = {2, 1, 3, 10, 6};
        java.util.Arrays.sort(array1);
        System.out.println(java.util.Arrays.toString(array1)); // [1, 2, 3, 6, 10]

        String[] array2 = {"bbb", "aaa", "ccc"};
        java.util.Arrays.sort(array2);
        System.out.println(java.util.Arrays.toString(array2)); // [aaa, bbb, ccc]
    }

}
