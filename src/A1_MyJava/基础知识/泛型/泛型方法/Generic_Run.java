package A1_MyJava.����֪ʶ.����.���ͷ���;

//������
public class Generic_Run {

    public static void main(String[] args) {

        //ʹ����ͨ��
        Ordinary_Lei ordinaryLei = new Ordinary_Lei();
        ordinaryLei.method1("�������");
        ordinaryLei.method2(18);
        ordinaryLei.method3(true);
        //ordinaryLei.method2("ʮ����");
        // ��int�޷����

        System.out.println("========================");

        //ʹ�÷�����
        Generic_Lei<String> gen1 = new Generic_Lei<>();
        gen1.method("�����ܵ�");

        Generic_Lei<Integer> gen2 = new Generic_Lei<>();
        gen2.method(17);

        Generic_Lei<Boolean> gen3 = new Generic_Lei<>();
        gen3.method(true);

        System.out.println("========================");

        //ʹ�÷��ͷ���
        Generic_Method generic = new Generic_Method();
        generic.method("��������");
        generic.method(9);
        generic.method(true);
        generic.method(66.66);

    }

}
