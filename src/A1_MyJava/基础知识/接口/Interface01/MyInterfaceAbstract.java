package A1_MyJava.基础知识.接口.Interface01;
/*

在Java任何版本当中都能定义抽象方法。
格式：
public abstract 返回值类型 方法名称(参数列表);   //没有方法体！！！

注意事项：
1. 接口当中的抽象方法修饰符必须是两个固定修饰符号：public abstract 就算不写又是public abstract

2. 这两个修饰符可以选择性的省略，（今天刚学，不推选省略）

3. 方法的三要数可以根据需要随意选择。

注意事项：
“实现类” 如果没有全部覆盖重写接口当中的所有抽象方法，
那么这个 “实现类” 就必须是个抽象类，abstract。

*/

//创建一个接口
public interface MyInterfaceAbstract {

    //创建抽象方法。
    public abstract void methodAbs1();  //1. public abstract是灰色的,就算不写又是public abstract


    /*
    private abstract void methods();  //错误写法，修饰符不能是private。
    */


    //这也是抽象方法
    abstract int methodAbs2(int x);

    //这也是抽象方法
    public void methodAbs3();           //2. 这两个修饰符可以选择性的省略，（今天刚学，不推选省略）

    //这也是抽象方法
    boolean methodAbs4(double total);   //3. 方法的三要数可以根据需要随意选择。




}
