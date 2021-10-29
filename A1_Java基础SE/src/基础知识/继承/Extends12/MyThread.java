package 基础知识.继承.Extends12;

class MyThread extends Thread{
    private  int a;
    public MyThread(int a)
    {
        this.a=a;
    }

    @Override
    public void run() {

        for (int i = 0; i <a+1; i++) {
            //这里可以再考虑优化，如打印，第XX张票售出，体验感会好很多
            System.out.println(currentThread().getName()+"售票一张");
        }
        System.out.println(currentThread().getName()+"共有"+a+"张票，全部售完");


    }
}