package ����֪ʶ.���.Math;
/*

java.lang.Math
Math��û�й��췽���ģ������ڲ��ĳ�Ա�������Ǿ�̬static������
���Ը��������Ƶ��÷���

*/
public class MathLei {

    public static void main(String[] args) {

        //public static int abs (int a){...}                   // ���ز����ľ���ֵ [����������]

        //public static double ceil (double a){...}            // ����ȡ��

        //public static double floor (double a){...}           // ����ȡ��

        //public static int round (double a){...}              // ��������

        //public static int max (int a, int b){...}            // �ȼ����������Ǹ��󣬲��������ֵ [����������]

        //public static int min (int a, int b){...}            // �Ƚ����������Ǹ�С����������Сֵ [����������]

        //public static double por (double a, double b){...}   // ���ص�һ�������ĵڶ����������ݵ�ֵ [�����ͷ���ֵ����double]

        //public static double random (){...}                  // ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��

        System.out.println("==========================================================================================");

        //public static int abs (int a){...}                  // ���ز����ľ���ֵ [����������]
        System.out.println(Math.abs(5));
        System.out.println(Math.abs(-5.21));
        System.out.println("==========");
        //public static double ceil (double a){...}           // ����ȡ��
        System.out.println(Math.ceil(5.21));
        System.out.println(Math.ceil(-5.21));
        System.out.println("==========");
        //public static double floor (double a){...}          // ����ȡ��
        System.out.println(Math.floor(5.21));
        System.out.println(Math.floor(-5.21));
        System.out.println("==========");
        //public static int round (double a){...}             // ��������
        System.out.println(Math.round(6.6));
        System.out.println("==========");
        //public static int max (int a, int b){...}           // �ȼ����������Ǹ��󣬲��������ֵ [����������]
        System.out.println(Math.max(5.21, 5.211314));
        System.out.println(Math.max(521, 5211314));
        System.out.println("==========");
        //public static int min (int a, int b){...}           // �Ƚ����������Ǹ�С����������Сֵ [����������]
        System.out.println(Math.max(5.21, 5.211314));
        System.out.println(Math.max(521, 5211314));
        System.out.println("==========");
        //public static double pow (double a, double b){...}  // ���ص�һ�������ĵڶ����������ݵ�ֵ [�����ͷ���ֵ����double]
        System.out.println(Math.pow(8, 2));                   //8 2 ǿ��ת����8.0 �� 2.0 �����ص�ֵҲ�� 64.0 �� double
        System.out.println("==========");
        //public static double random (){...}                 // ���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
        System.out.println(Math.random());
        System.out.println("1-10����20�������");
        for (int i = 0; i < 20; i++) {
            System.out.println( (int)(Math.random()*10+1) );
        }



    }

}
