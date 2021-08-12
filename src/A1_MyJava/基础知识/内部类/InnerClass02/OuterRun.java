package A1_MyJava.基础知识.内部类.InnerClass02;
/*
二: 局部内部类

如果一个类定义在一个方法的内部，那么这是一个局部内部类。
“局部” : 只有当前所属的方法才能使用它，出了这个方法外面就不能用了。

[格式]:
修饰符 class 外部类名称{
    //......
    权限修饰符 返回值类型 方法名称(参数列表){
         //......
         class 内部类名称{
               //......
         }
    }
}

[注意]:
One: 定义一个类的时候，权限修饰符规则
     1. 外部类:     public / (default)
     2. 成员内部类:  public / protected / (default) / private
     3. 局部内部类:  什么都不能写,[并不代表是default].

Two: 局部内部类，如果想访问该方法的局部变量，必须保证这个局部变量是【有效final的】
     [备注]: 从Java8+ 开始，只要局部变量事实不发生改变，final关键字可以省略不写。
     [原因]:
     1. new出来的对象在堆内存当中。
     2. 局部变量是跟着方法走的，在栈内存当中。
     3. 方法运行结束之后，立刻出栈，局部变量就会立即消失。
     4. 但是new出来的对象会在堆当中持续存在，直到垃圾回收消失。

========================================================================================================================
【匿名内部类】

如果接口的实现类(或者是父类的子类)只需要使用唯一的一次，
那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】。

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){
     //覆盖重写所有抽象方法
};   //大括号后面有个[;]别忘了

[注意]:
对格式[new 接口名称(){...}]进行解析：
1. new代表创建对象的动作
2. 接口名称就是匿名内部类需要实现的那个接口
3. {...}这才是匿名内部类的内容。

[另外]:
1. 匿名内部类,在【创建对象】的时候，只能使用唯一一次。
   如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义”实现类“了。

2. 匿名对象,在【调用方法】的时候，只能调用唯一一次，
   如果希望同一个对象，调用多次方法，那么必须给对象娶个名字。

3. 匿名内部类是省略了【实现类/子类名称】，但是匿名对象是省略了【对象名称】
   [强调]: 匿名内部类和匿名对象不是一回事！！！

*/
public class OuterRun {

    public static void main(String[] args) {
        Wai wai = new Wai();
        wai.methodOuterOne();

    }

}
