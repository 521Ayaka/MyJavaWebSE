package 基础知识.基础.final关键字.final02;

public class Zi extends Fu{

    //错误写法，不能被覆盖重写使用final修饰的成员方法。
//    @Override
//    public void method(){
//        System.out.println("覆盖重写");
//    }

    @Override
    public void methodAbs() {
        System.out.println("实现方法。");
    }

}
