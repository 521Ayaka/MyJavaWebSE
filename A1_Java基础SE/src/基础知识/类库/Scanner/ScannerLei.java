package ����֪ʶ.���.Scanner;
import java.util.Scanner;

public class ScannerLei {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("��Ҫ�ǳ���Ҫ�Σ����Σ�");
        String wen = sc.next();

        while(!wen.equals("Ҫ��") && !wen.equals("����")){
            System.out.println("����������");
            System.out.println("================");
            wen = sc.next();
        }
        method(wen);


        sc.close();
    }

    public static void method(String wen){
        if(wen .equals("Ҫ��")){
            for(int i = 1; i<=100; i++){
                System.out.println("��������>.< ");
            }
        }else{
            System.out.println("��������");
        }
    }
}
