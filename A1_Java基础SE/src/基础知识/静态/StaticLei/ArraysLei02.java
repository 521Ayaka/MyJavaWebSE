package ����֪ʶ.��̬.StaticLei;

import java.util.Arrays;

/*
��Ŀ��
��ʹ��Arrays��ص�API����һ������ַ����е������ַ��������У��������ӡ��
 */
public class ArraysLei02 {

    public static void main(String[] args) {
        String str = "asv76agfqwdfvasdfvjh";

        // ��ν����������У�sort
        // ������һ�����飬������Arrays.sort����
        // String --> ���飬��toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars); // ���ַ����������������

        // ��Ҫ�������
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
