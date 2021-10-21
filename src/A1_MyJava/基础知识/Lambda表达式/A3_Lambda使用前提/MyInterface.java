package A1_MyJava.基础知识.Lambda表达式.A3_Lambda使用前提;

public interface MyInterface {

    //Lambda使用前提是
    //1.是个接口
    //2.接口中仅有一个抽象方法
    public abstract int method(String str, int lenX, int lenY);

}
