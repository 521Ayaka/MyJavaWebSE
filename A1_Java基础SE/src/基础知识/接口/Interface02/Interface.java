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
*/

public class Interface {

    public static void main(String[] args) {

        MyInterfaceDefaultImplA ImplA = new MyInterfaceDefaultImplA();
        ImplA.methodAbs();

        System.out.println("=======================================");

        MyInterfaceDefaultImplB ImplB = new MyInterfaceDefaultImplB();
        ImplB.methodAbs();

        System.out.println("=======================================\n");
        System.out.println("=======================================");

        //============================================================

        //对于接口的默认方法，会被 ”实现类“ 继承下来。
        //通过”实现类“调用默认方法，如果实现类没有该方法，那么会向上找父类接口。
        ImplA.methodDefault();
        System.out.println("===================");
        ImplB.methodDefault();

    }

}
