package ����֪ʶ.Lambda���ʽ.A8_����ʽ�ӿ�;

public class RunFunctional {

    public static void main(String[] args) {
        String str = "��������������һ��--���ܡ�";

        //ͨ��Lambda���ʽ���� ����ʽ�ӿڶ���
        MyInterface mi1 = () -> System.out.println(str);

        //���÷���
        mi1.method();

    }
}
