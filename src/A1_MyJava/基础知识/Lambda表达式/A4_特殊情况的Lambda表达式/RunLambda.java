package A1_MyJava.����֪ʶ.Lambda���ʽ.A4_���������Lambda���ʽ;

public class RunLambda {

    //Lambda���ʽ��������Ľӿڻ򷽷�
    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        me((String ssss) -> {
            System.out.println(ssss + 4);
        });

        //����ʡ�Բ�������
        me((sss) -> {
            System.out.println(sss + 3);
        });

        //��������б�ֻ��һ��, ������ֱ��ʡ�� "()" ֱ�� ����->{ }
        me(ss -> {
            System.out.println(ss + 2);
        });

        //���{�����} �� ֻ��һ�����,������ʡ�� ������";"  �� "{"   "}"
        me(s -> System.out.println(s + 1));


    }

    private static void me(MyInterface impl) {
        impl.method("���������");
    }

}
