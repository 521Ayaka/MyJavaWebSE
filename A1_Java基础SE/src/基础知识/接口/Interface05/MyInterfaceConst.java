package 基础知识.接口.Interface05;
/*
接口当中也可以定义 “成员变量” ，但是必须使用 public static final 三个关键字进行修饰。

格式：
public static final 数据类型 常量名称 = 数据值;

备注：
一旦使用了final关键字进行修饰之后，说明不可改变。

注意：
1. 接口当中的常量，可以省略public static final 但是，不写也是这样的。
2. 接口当中的常量，必须进行赋值，不能不赋值。

*/
public interface MyInterfaceConst {

    //其实这是一个常量，一旦赋值，不可以修改。
    public static final int NUM_OF_MY_CLASS = 2;
    public static final boolean BOOL_MY_LIU_BU_LIU = true;
    String STR_CONST = "可以省略public static final不写，但仍然是这些修饰";
    //SHIFT+F6 把这些常量都命名为大写


}
