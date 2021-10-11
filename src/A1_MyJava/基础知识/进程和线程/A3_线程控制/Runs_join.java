package A1_MyJava.基础知识.进程和线程.A3_线程控制;

public class Runs_join {

    public static void main(String[] args) {

        //创建线程对象
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        //设置线程名字
        tj1.setName("曹操");
        tj2.setName("曹丕");
        tj3.setName("曹植");

        //启动线程
        tj1.start();

        try {//依然需要异常处理 try...catch...
            tj1.join();//等待曹操死后......
                       //三国称霸 太子夺嫡...
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tj2.start();
        tj3.start();

    }

}

class ThreadJoin extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }

}
