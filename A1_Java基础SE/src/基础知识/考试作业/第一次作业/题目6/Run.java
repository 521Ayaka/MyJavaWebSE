package ����֪ʶ.������ҵ.��һ����ҵ.��Ŀ6;

//���� Number�������ͬһ���£����õ���
import java.util.Scanner;

public class Run {
                                          //˭����˭Ҫ�����׳��쳣
    public static void main(String[] args) throws XXXException {

        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Number number = new Number(a,b);

        System.out.println("������ĵ�һ����Ϊ:"+a+", ������ĵڶ�����Ϊ:"+b);
        System.out.println("=========================================");
        //��
        System.out.println("������ӵĽ��Ϊ: "+number.addition());
        //��
        System.out.println("��һ������ȥ�ڶ��������Ϊ:"+number.subtrationAB());
        System.out.println("�ڶ�������ȥ��һ�������Ϊ:"+number.subtrationBA());
        //��
        System.out.println("������˵Ľ��Ϊ:"+number.multiplication());
        //��
        System.out.println("��һ��������ȥ�ڶ��������Ϊ:"+number.divisionAB());
        System.out.println("�ڶ���������ȥ��һ�������Ϊ:"+number.divisionBA());

        System.out.println("��л���Ĺ���ʹ�ã�лл��������");

        /**�������һ����Ϊ�㣬�׳��쳣��
         * Exception in thread "main" ��Ŀ6.XXXException: ��������Ϊ0
         * 	at ��Ŀ6.Number.divisionBA(Number.java:42)
         * 	at ��Ŀ6.Run.main(Run.java:27)*/
    }

}
