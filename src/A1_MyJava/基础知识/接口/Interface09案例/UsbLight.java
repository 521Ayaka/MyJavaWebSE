package A1_MyJava.基础知识.接口.Interface09案例;

public class UsbLight implements USB{

    @Override
    public void open() {
        System.out.println("打开USB灯");
    }

    @Override
    public void close() {
        System.out.println("关闭USB灯");
    }

    public void adjust(){
        System.out.println("调节亮度");
    }
}
