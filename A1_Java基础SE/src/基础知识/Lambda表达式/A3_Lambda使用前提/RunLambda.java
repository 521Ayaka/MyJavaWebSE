package ����֪ʶ.Lambda���ʽ.A3_Lambdaʹ��ǰ��;

public class RunLambda {

    public static void main(String[] args) {

        String str1 = "ʹ�������ڲ������";
        String str2 = "ʹ��Lambda���ʽ���";
        int len1 = 666;

        //ʹ�������ڲ���
        me(new MyInterface() {
            @Override
            public int method(String str, int lendX, int lendY) {
                System.out.print(str + "\t");
                System.out.println(lendX + lendY);//���
                return lendX + lendY;
            }
        }, str1, len1);

        System.out.println("=========================");

        //ʹ��Lambda���ʽ
        me((/*String*/ str,/*int*/ meLen,/*int*/ lenY) -> {
            //���������ǿ���ʡ�Ե�,��������������,����ֻʡ��һ��,Ҫʡ�Ծ�Ҫʡ���꣡
            System.out.print(str + "\t");
            System.out.println(meLen + lenY);//���
            System.out.println("Lambda���ʽ��Ϊ��࣡");
            return meLen + lenY;
        }, str2, len1);


    }

    //�÷�����һ�������ǽӿڣ��ýӿ���ֻ��һ�����󷽷���
    public static void me(MyInterface e, String str, int len2) {
        //�÷������õĳ��󷽷���
        int num = e.method(str, len2, 6000);

        //���Է���ֵ��
        System.out.println("����ֵ:" + num);
    }

}
