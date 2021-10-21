package A1_MyJava.基础知识.Lambda表达式.A1_初步了解体验;

public class TestLambda {

    public static void main(String[] args) {

        //方式一:
        RunnableImpl runImpl = new RunnableImpl();
        Thread t = new Thread(runImpl);
        t.start();


        //方式二: 通过匿名内部类改进
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("方式二: 多线程程序启动！");
            }
        }).start();


        //方式三: 通过Lambda表达式改进
        new Thread(() -> {
            System.out.println("方式三: 多线程程序启动！");
        }).start();


    }

}
