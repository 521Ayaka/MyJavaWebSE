package ����֪ʶ.Lambda���ʽ.A6_���鷽������;

public interface MethodInterface01 {

    void method(String s);

    static void me(String str){
        System.out.println("me���� ��������: String :" + str);
        System.out.println("MethodInterface01 �ڲ�Ĭ�Ϸ�����");
    }

    static void me(int a){
        System.out.println("me���� ��������: int :" + a);
        System.out.println("MethodInterface01 �ڲ�Ĭ�Ϸ�����");
    }

}
