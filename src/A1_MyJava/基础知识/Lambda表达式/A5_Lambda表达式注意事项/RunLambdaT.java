package A1_MyJava.����֪ʶ.Lambda���ʽ.A5_Lambda���ʽע������;

public class RunLambdaT {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ����me1
        me1(() -> {
            System.out.println("Lambda���ʽ���");
        });

        //Lambda���ʽ������
        me1(() -> System.out.println("Lambda���ʽ���"));

        //�������me2, m2�Ĳ����ӿ��У����������󷽷����ᱨ��
//        me2( ()-> System.out.println("����ʹ��Lambda���ʽ") );

        //�����������ʻ����������Ƶ���Lambda��Ӧ�Ľӿ�
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("���������߳�01");
            }
        }).start();//�������߳�

        //()-> System.out.println("��������");
        Runnable r = () -> System.out.println("���������߳�02");
        new Thread(r).start();

        //��
        new Thread(() -> System.out.println("���������߳�03")).start();


    }

    //ֻ��һ�����󷽷��Ľӿ� ��Ϊ ��������
    private static void me1(MyInterfaceMe1 e) {
        e.method();
    }

    //���������󷽷��Ľӿ� ��Ϊ ��������
    private static void me2(MyInterfaceMe2s e) {
        e.method1();
    }


}
