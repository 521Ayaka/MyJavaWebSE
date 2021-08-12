package A1_MyJava.����֪ʶ.������ҵ.��һ����ҵ.��Ŀ2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Array_Method {

    public static void main(String[] args) {

        String str = "ABCDEFG";
        //�Ƚ���ת��Ϊ����   img_toCharArray_method.png
        char[] chars = str.toCharArray();

        //���з�ת    img_Array_����_�ʼ�.png

        method1(chars);//����һ
        System.out.println("�ع�");
        method1(chars);

        System.out.println("==================");

        method2(chars);//������

        System.out.println("==================");

        //ת��Ϊ�ַ���    String�����ִ�����ʽ֮ char[]������
        String StringNewCharArray = new String(chars);

        System.out.println("���ַ���:"+StringNewCharArray);


    }

    //����һ
    public static void method1(char[] chars){
        for (int min = 0 , max = chars.length-1; min < max; min++,max--){
            char ling = chars[min];
            chars[min] = chars[max];
            chars[max] = ling;
        }
        //���б�����֤
        for (char ch:chars
        ) {
            System.out.println(ch);
        }
    }

    //������ ��ѧ�ļ��ϣ����ü��ϰɡ�
    public static void method2(char[] chars){
        List<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < chars.length; i++) {
            arrayList.add(chars[i]);
        }
        //��ת�ķ���
        Collections.reverse(arrayList);
        //��list�������¸�ֵ��chars����
        for (int i = 0; i < chars.length; i++) {
            chars[i] = arrayList.get(i);
        }

        //ʹ�õ��������б���
        Iterator<Character> itr = arrayList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
