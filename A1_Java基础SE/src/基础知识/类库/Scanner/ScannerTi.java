package ����֪ʶ.���.Scanner;

import java.util.Scanner;
/*
��ĿҪ��
1.ʹ��Scanner�࣬����������
2.��������������Ĵ��룬ʹ�������
*/
public class ScannerTi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str;
        do {
            System.out.println("====��ӭʹ�����εĵ�һ��java�ӷ�������====");
            System.out.println("�������һ��������");
            int x = sc.nextInt();
            System.out.println("������ڶ���������");
            int y = sc.nextInt();
            int sum = x + y;
            System.out.println("������Ϊ��" + sum);
            System.out.println("�Ƿ��˳�?��yes��no����" );
            str = sc.next();
            while(!str.equals("yes")&& !str.equals("no")){
                System.out.println("�����������G ��(���n��)��");
                System.out.println("���������룺yes�� no��");
                str = sc.next();
            }
        }while(str.equals("no"));
        System.out.println("=====��лʹ�éd(�R���Q*)o=====");
    }

}
