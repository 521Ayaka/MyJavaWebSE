package 基础知识.接口.Interface02;
/*

从Java 8开始，接口里允许定义默认方法。
格式：
public default 返回值类型 默认方法名称(参数列表){
     //方法体
}

备注：接口当中的默认方法，可以解决接口升级问题。

说明: 新添加的方法，改成默认方法。
     public是灰色的，可以省略，但是不能改成其他的修饰符，只能说public或者省略不写。
     对于接口的默认方法，会被 ”实现类“ 继承下来。


接口的默认方法，可以被接口 ”实现类“ 对象直接调用。
接口的默认方法，也可以被接口的 “实现类” 覆盖重写。

*/
public interface MyInterfaceDefault {

    //创建一个抽象方法，此时，两个实现类AB是正确的
    public abstract void methodAbs();


    //接口升级后，多了一个抽象方法，但是，两个实现类AB举报错了。
    /*
    public abstract void methodAbs2();
    */



    //新添加的方法，改成默认方法。
    public default void methodDefault(){
        System.out.println("接口的默认方法");
    }
    //public是灰色的，可以省略，但是不能改成其他的修饰符，只能说public或者省略不写。  但是default不能省略不写！！！

    //对于接口的默认方法，会被 ”实现类“ 继承下来。
    //接口的默认方法，可以被接口 ”实现类“ 对象直接调用。
    //接口的默认方法，也可以被接口的 “实现类” 覆盖重写。

}
