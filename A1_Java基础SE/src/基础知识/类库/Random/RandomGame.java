package ����֪ʶ.���.Random;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int num = r.nextInt(100) + 1;
        System.out.println("������100���ڵ�����");
        while( true ){
            System.out.println("��������Ĳ²⣺");

            int x = sc.nextInt();
            if( x > num){
                System.out.println("���������̫���ˣ����������룺");
            }else if( x < num ){
                System.out.println("���������̫С�ˣ����������룺");
            }else{
                System.out.println("��ϲ�㣬����ˣ�");
                break;
            }

        }
    }
}
