package A1_MyJava.����֪ʶ.Lambda���ʽ.A9_����ʽ�ӿ���Ϊ�����Ĳ���;

public class RunThread {

    public static void main(String[] args) {

        //ʹ�������ڲ���ķ�ʽ
        useThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+": �߳�����");
            }
        });

        //ʹ��Lambda���ʽ ��Ϊ����
        useThread( ()-> System.out.println(Thread.currentThread().getName()+": �߳�����"));

        //���֮ǰ��ѧ����, ֻ�ǻ�����˵�����ѣ�����

    }

    private static void useThread(Runnable r){
        new Thread(r).start();
    }

}
