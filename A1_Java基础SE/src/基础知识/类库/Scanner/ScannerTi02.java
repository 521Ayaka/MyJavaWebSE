package ����֪ʶ.���.Scanner;

import java.util.Scanner;

public class ScannerTi02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("========��ӭʹ�����ε�java�ӷ�������========");
            System.out.println("�������һ��������");
            double a = sc.nextDouble();
            System.out.println("������ڶ���������");
            double b = sc.nextDouble();
            double sum = a + b;
            System.out.println("������Ϊ��" + sum);
            System.out.println("�Ƿ��˳��ϣ�yes��no��");
            String str = sc.next();
            if(!str.equals("yes")&& !str.equals("no")){
                System.out.println("�����������G ��(���n��)��");
                System.out.println("�Ƿ��˳��ϣ�yes��no��");
                str = sc.next();
            }
            if(str.equals("yes")){
                System.out.println("=====��лʹ�éd(�R���Q*)o=====");
                break;
            }else{
                System.out.println("��ӭ����ʹ�éd(?��?`)o");
                System.out.println("=======================================");
            }


        }

    }

}
