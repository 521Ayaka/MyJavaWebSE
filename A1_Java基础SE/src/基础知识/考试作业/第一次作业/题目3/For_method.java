package ����֪ʶ.������ҵ.��һ����ҵ.��Ŀ3;
/*
����д�˰���������׳�,,,,��û������,,,,
�Ƚϼ򵥣�д������˾�:
*/

import java.util.Scanner;

public class For_method {

    public static void main(String[] args) {

        System.out.println("������һ�����ڵ���0������:");
        int n = new Scanner(System.in).nextInt();
        //����һ�����
        int num = 0;
        //�ж��Ƿ��д�
        if ( n < 0 ){
            do {//�д�ͻ�����һֱ�������룡����
                System.out.println("�����������\n������һ�����ڵ���0������:");
                n = new Scanner(System.in).nextInt();
            }while (n < 0);
        }
        //�������
        if (n == 0){
            num = 1;
        }else{
            num = method(n); //���÷���
        }
        System.out.println(n+"!="+num);

    }

    //n>0��ʱ����׳˵ķ���
    public static int method(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * method(n - 1);
        }
    }

}
