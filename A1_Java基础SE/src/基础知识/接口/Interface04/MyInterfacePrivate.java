package ����֪ʶ.�ӿ�.Interface04;
/*
��������:
Ϊ�˼����ظ�����������������Ҫ����һ�����еķ�����������������⡣
���ǣ��ֲ���ͨ���ӿڵ� ��ʵ���ࡱ ������е��øù��еķ�����

���������
ʹ��Java9 ,JDK9��ʼ��java������˽�еķ�����

1.��ͨ˽�з�����������Ĭ�Ϸ���֮����ظ��������⡣
��ʽ��
private ����ֵ���� ��������(�����б�){
     //������
}


2.��̬���з�������������̬����֮����ظ��������⡣
��ʽ��
private static ����ֵ���� ��������(�����б�){
     //������
}

 */

public interface MyInterfacePrivate {

    public default void method1(){
        System.out.println("Ĭ�Ϸ���1ִ�У�");
        methodCommon();
    }

    public default void method2(){
        System.out.println("Ĭ�Ϸ���2ִ��");
        methodCommon();
    }

    /**

    //Ϊ�˲��ظ�method1��2�Ĵ��룬��ȡ��ͬ��
    //�������ַ����ǲ��Եģ��൱���ִ�����һ��Ĭ�Ϸ�������ʱ ��ʵ���ࡱ �Ϳ��Ե�����������ˣ����ǲ��뿴����
    public default void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

    */


    //��ʱ��������˽�л����ж��� Java9����ʵ��
    //ʹ����ͨ��˽�л�����
    private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
