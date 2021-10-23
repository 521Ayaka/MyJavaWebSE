package A1_MyJava.����֪ʶ.Lambda���ʽ.A6_���鷽������;


public class RunMethod {

    public String string = "�����ɰ���������";

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        method1(e -> System.out.println(e));
        System.out.println("=================");

        //����ʹ�÷�������
        method1(System.out::println);//ʹ�÷������á�
        System.out.println("=================");

        //ͨ����ľ�̬�����ĵ��� ʵ�ַ�������
        method1(MethodInterface01::me);//�Զ�ʶ��������� String
        System.out.println("=================");
        method1(RunMethod::me);//�Զ�ʶ��������� String
        System.out.println("=================");

        //ͨ��������øö��󷽷� ʵ�ַ�������
        Me meObj = new Me();
        method1(meObj::method);
        System.out.println("=================");

        //String����һ����̬����substring �����б���(String,int,int)
        subString((s,i,eI)->s.substring(i,eI));
        System.out.println("=================");
        subString(String::substring);
        //ע��/����:
        //Lambda���ʽ�����ʵ�����������ʱ��
        //��һ��������Ϊ������
        //����Ĳ���ȫ����˳�򴫵ݸ��÷�����Ϊ������
        System.out.println("=================");



    }

    private static void subString(MySubString e){
        String str = e.meSubString("��һ�����������߰�", 3, 7);
        System.out.println(str);
    }

    private static void method1(MethodInterface01 e) {
        e.method("���������");
    }


    private static int method2(MethodInterface02 e) {
        int i = e.method(6666);
        return i;
    }


    //�����е��������ط���
    public static void me(String str) {
        System.out.println("me���� ��������: String :" + str);
        System.out.println("RunMethod �ڲ�Ĭ�Ϸ�����");
    }

    public static void me(int a) {
        System.out.println("me���� ��������: int :" + a);
        System.out.println("RunMethod �ڲ�Ĭ�Ϸ�����");
    }

}
