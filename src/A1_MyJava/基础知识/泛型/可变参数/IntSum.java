package A1_MyJava.����֪ʶ.����.�ɱ����;
/*
 �ɱ����
 public static int sum(int... a){}
 public static int sum(int b, int... a){}
 public static int sum(String str, int... a){}


 ������������������������������������������������������������!!
 �ɱ�������ǰ����ݷ�װ��һ�����顣�������� [] �β� = { ʵ�� };

*/
public class IntSum {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10, 20, 30, 40));
        System.out.println("======================");
        System.out.println(sum(10, 20, 30, 40, 50));
        System.out.println(sum(10, 20, 30, 40, 50, 60));
        System.out.println(sum(10, 20, 30, 40, 50, 60, 70));
        System.out.println("======================");
        System.out.println(sum("������Ϊ", 10, 20, 30, 40, 50, 60, 70, 80));

        int [] a ={};
    }

    //�ɱ��������
    public static int sum(int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        return i;
    }

    public static int sum(int a) {
        return a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }


    /*
    //����д����Vararg���������һ������
    public static int sum(int ...a, int b){
        return 0;
    }
    */

    //��ȷд��
    public static int sum(String str, int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        System.out.print(str + "��");
        return i;
    }

    /*����Ҳ�ǿ��Եģ�����������һ����sum(int...a){}�ķ����ˣ������ظ�������Ҳ���ظ�
    public static int sum(int b, int... a) {
        int i = 0;
        for (int num :
                a) {
            i += num;
        }
        i+=b;
        return i;
    }
    */


}
