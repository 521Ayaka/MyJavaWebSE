package ����֪ʶ.�쳣.�쳣����;

/*
����ʱ�쳣������ʱ�쳣������
java �е��쳣����Ϊ������: [����ʱ�쳣][����ʱ�쳣]��Ҳ����Ϊ[�ܼ��쳣]��[���ܼ��쳣]
���е�RuntimeException�༰�����౻��Ϊ������ʱ�쳣�����������쳣���ǡ�����ʱ�쳣��

[����ʱ�쳣]: ������ʾ�����������ͻᷢ�������޷�ͨ�����롣

[����ʱ�쳣]: ������ʾ����Ҳ���Ժͱ���ʱ�쳣һ������

*/

public class YiChang {

    public static void main(String[] args) {
        System.out.println("��ʼ����");

        method1();
        method2();

        System.out.println("��������");


    }

    //����ʱ�쳣(�����쳣����)
    public static void method1(){
        int [] array = {0,1,2,3,4};
        try {
            System.out.println(array[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("�����쳣������Խ��");
        }
    }

    //����ʱ�쳣(�����д���)
    public static void method2(){
        int [] array = {0,1,2,3,4};
        System.out.println(array[5]);
    }

    //����ʱ�쳣
/*
    public static void method3(){
        int a = "gan";
        :\Դ����\src\MyJava\Lei\�쳣\�쳣����\YiChang.java:46:17
        java: �����ݵ�����: java.lang.String�޷�ת��Ϊint
    }

    //û�е��ã�����Ҳ����ͨ�������뷵�ش��뵱�н����޸�
*/
}
