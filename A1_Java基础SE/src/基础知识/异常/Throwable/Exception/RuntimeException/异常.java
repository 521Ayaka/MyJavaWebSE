package ����֪ʶ.�쳣.Throwable.Exception.RuntimeException;
/*
ArrayIndexOutOfBoundsException --> IndexOutOfBoundsException --> RuntimeException --> Exception --> Throwable

ArrayIndexOutOfBoundsException���쳣
����Exception�� RuntimeException�쳣
����:
Exception��Ϊ�쳣�࣬����ָ��������Դ��������
RuntimeException: �ڱ����ڼ��ǲ�����ģ������������ʱ����Ҫ���Ƿ��س����޸Ĵ���

======================================================================

�����쳣��class�ļ����޸�
ָ������� ԭ�� �� λ�� �ȡ�
�����ߵĳ��򽫲�������

*/
public class �쳣 {

    public static void main(String[] args) {
        System.out.println("==========");
        System.out.println("����ʼ");
        method();
        System.out.println("==========");
        System.out.println("�������");
    }

    public static void method(){
        int [] array = {0,1,2,3,4,5};

        System.out.println(array[3]);
        System.out.println(array[6]); //ArrayIndexOutOfBoundsException

    }

    /*
    ���н��:

    ==========
    ����ʼ
    3
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at MyJava.����֪ʶ.�쳣.Throwable.Exception.RuntimeException.�쳣.method(�쳣.java:17)
    	at MyJava.����֪ʶ.�쳣.Throwable.Exception.RuntimeException.�쳣.main(�쳣.java:8)

    �����ѽ������˳�����Ϊ 1

    */

}
