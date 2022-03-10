package 基础知识.Lambda表达式.A5_Lambda表达式注意事项;

public class RunLambdaT {

    public static void main(String[] args) {

        //使用Lambda表达式调用me1
        me1(() -> {
            System.out.println("Lambda表达式输出");
        });

        //Lambda表达式继续简化
        me1(() -> System.out.println("Lambda表达式输出"));

        //如果调用me2, m2的参数接口中，有两个抽象方法，会报错
//        me2( ()-> System.out.println("不能使用Lambda表达式") );

        //必须有上下问环境，才能推导出Lambda对应的接口
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动多线线程01");
            }
        }).start();//启动多线程

        //()-> System.out.println("这样不行");
        Runnable r = () -> System.out.println("启动多线线程02");
        new Thread(r).start();

        //简化
        new Thread(() -> System.out.println("启动多线线程03")).start();


    }

    //只有一个抽象方法的接口 作为 参数传递
    private static void me1(MyInterfaceMe1 e) {
        e.method();
    }

    //有两个抽象方法的接口 作为 参数传递
    private static void me2(MyInterfaceMe2s e) {
        e.method1();
    }


}
