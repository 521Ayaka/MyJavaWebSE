package A1_MyJava.基础知识.Lambda表达式.A9_函数式接口作为方法的参数;

public class RunThread {

    public static void main(String[] args) {

        //使用匿名内部类的方式
        useThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+": 线程启动");
            }
        });

        //使用Lambda表达式 作为参数
        useThread( ()-> System.out.println(Thread.currentThread().getName()+": 线程启动"));

        //这个之前就学过了, 只是换了种说法而已！！！

    }

    private static void useThread(Runnable r){
        new Thread(r).start();
    }

}
