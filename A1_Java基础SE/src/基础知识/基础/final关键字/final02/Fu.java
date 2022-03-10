package 基础知识.基础.final关键字.final02;
/*
2. 当final关键字修饰一个方法的时候:

当final关键字修饰一个方法的时候，这个方法是最终方法，也就是不能被覆盖重写。

格式:
修饰符 final 返回值类型 方法名称(参数列表){
    //方法体
}

注意事项:
对于类和方法来说，final关键字和abstract关键字不能同时使用，因为矛盾。

*/
public abstract class Fu {

    public final void method (){
        System.out.println("方法执行");
    }

    //不能同时使用，abstract必须被实现覆盖重写，final不能别覆盖重写，相互矛盾。
    public abstract /* final */ void methodAbs();

}
