package ����֪ʶ.���.�������;

import java.util.Arrays;

/*

������̣�����Ҫʵ��һ�����ܵ�ʱ��ÿһ������Ĳ��趼Ҫ������Ϊ����ϸ����ÿһ��ϸ�ڡ�
������󣺵���Ҫʵ��һ�����ܵ�ʱ�򣬲����ľ���Ĳ��裬������һ���Ѿ����иù��ܵ��ˣ����������¶���
 

*/
public class MianXiang {
    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40, 50, 60 };
        // Ҫ���ӡ��ʽΪ��[10, 20, 30, 40, 50]

        // ʹ��������̣�ÿһ������ϸ�ڶ�Ҫ������Ϊ��
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) { // ��������һ��Ԫ��
                System.out.println(array[i] + "]");
            } else { // ����������һ��Ԫ��
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("=======================================");

        // ʹ���������
        // ��һ��JDK�������ṩ�õ�Arrays�࣬
        // ������һ��toString������ֱ�Ӿ��ܰ���������Ҫ�ĸ�ʽ���ַ���
        System.out.println(Arrays.toString(array));
    }
}
