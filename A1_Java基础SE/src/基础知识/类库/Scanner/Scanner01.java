package ����֪ʶ.���.Scanner;

import java.util.Scanner; //����

public class Scanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //����

        int i = sc.nextInt();
        System.out.println("==================");
        System.out.println("���������Ϊ��" + i);

        System.out.println("==================");
        String str = sc.next();
        System.out.println("==================");
        System.out.println("������ַ���Ϊ��" + str );
    }
}
