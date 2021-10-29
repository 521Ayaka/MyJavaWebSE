package ����֪ʶ.IO��.File��.File�ݹ�;

/**
 * ����Review�е����⣬ʹ�õݹ�ķ������в���
 * �ݹ�������: ʹ�õݹ�ͱ����ȶ���һ������
 * ����һ������ f(n) ����ʾ��n���µ�������
 * ��ô, �� n-1 ���µ����������� f(n-1)
 * ͬ��, �� n-2 ���µ����������� f(n-2)
 */


public class DameNewMethod {

    public static void main(String[] args) {

        //����f(int n)
        try{
            System.out.println(f(20));//����������쳣�����һ���Error��ϵ�е��쳣���޷������
            System.out.println("f(int n) δ�����쳣������");
        }catch (StackOverflowError e) {
            System.out.println("f(int n) �����쳣������");
            System.out.println("�����쳣, �쳣��: Error��ϵ�ģ�StackOverflowError ��");
            System.out.println("API˵��: ��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô���");
        }

        System.out.println("=========================================================");

        //�޸ĺ��fx(int n)
        try{
            System.out.println(fx(20));//�����Ͳ������ջ����쳣�ˡ�
            System.out.println("fx(int n) δ�����쳣������");
        }catch (StackOverflowError e) {
            System.out.println("fx(int n) �����쳣������");
            System.out.println("�����쳣, �쳣��: Error��ϵ�ģ�StackOverflowError ��");
            System.out.println("API˵��: ��Ӧ�ó���ݹ�̫���������ջ���ʱ���׳��ô���");
        }

        //��չ��ʹ�õݹ���׳�
        System.out.println(y(10));
        System.out.println(10*9*8*7*6*5*4*3*2*1);

    }

    //����ֵ �� �������� ����int
    public static int f(int n) {
        n = f(n - 1) + f(n - 2);
        return n;//����ֵ�ǲ�������n
    }


    //�����޸ĺ��
    public static int fx(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fx(n - 1) + fx(n - 2);
        }
    }

    //��׳˵ķ���
    public static int y(int n){
        if (n == 1){
            return 1;
        }else {
            return n * y(n-1);
        }
    }

}
