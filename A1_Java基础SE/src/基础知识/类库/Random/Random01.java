package ����֪ʶ.���.Random;

/*
1.����
  import.java.util.Random;

2.����
  Random r = new Random();

3.ʹ��
�����д������������

int x = r.nextInt();  //��������
Boolean y = r.nextBoolean();
.......

 */

import java.util.Random;

public class Random01 {
    public static void main(String[] args) {
        Random r = new Random();
        boolean a ;
        for (int i = 0; i < 10; i++) {
            a = r.nextBoolean();
            System.out.println("������ֵΪ��" + a);
        }
        System.out.println("=====================");

        int b ;
        for (int i = 0; i < 10; i++) {
            b = r.nextInt();
            System.out.println("�������Ϊ��" + b);
        }
    }
}
