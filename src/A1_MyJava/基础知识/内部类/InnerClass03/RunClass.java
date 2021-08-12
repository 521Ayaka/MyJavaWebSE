package A1_MyJava.基础知识.内部类.InnerClass03;

/*
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
public class RunClass {

    public static void main(String[] args) {
        //普通创建对象
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();

        //使用多态写法
        MyInterface obj = new MyInterfaceImpl();
        obj.methodA();


        //不能直接创建接口的对象
        //MyInterface two = new MyInterface(); //错误写法。

        MyInterface one = new MyInterface(){
            @Override
            public void methodA() {
                System.out.println("覆盖重写接口的抽象方法，111-A");
            }

            @Override
            public void methodB() {
                System.out.println("覆盖重写接口的抽象方法，222-B");
            }

        };
        one.methodA();

        MyInterfaceImpl t = new MyInterfaceImpl(){
            @Override
            public void methodA(){
                System.out.println("这样也是。。。");
            }
        };
        t.methodA();
        System.out.println("==================================================");

        //======================================================================

        Fu zi = new Fu(){
            @Override
            public void methodFu(){
                System.out.println("匿名内部类，覆盖重写后方法执行！");
            }
            @Override
            public void method(){
                System.out.println("这就尴尬了");
            }
        };
        zi.methodFu();
        zi.method();

        //========================================================================
        System.out.println("====================================================");
        System.out.println("====================================================");
        //========================================================================

        //[另外]:

        //正常使用
        MyInterface objA = new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("覆盖重写接口的抽象方法，111-A");
            }

            @Override
            public void methodB() {
                System.out.println("覆盖重写接口的抽象方法，222-B");
            }
        };
        objA.methodA();
        objA.methodB();

        System.out.println("===================================");

        //使用匿名内部类，并且使用匿名对象
        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("覆盖重写接口的抽象方法，111-A");
            }

            @Override
            public void methodB() {
                System.out.println("覆盖重写接口的抽象方法，222-B");
            }
        }.methodA();
        //因为匿名对象只能使用一次调用方法,无法调用第二次,所以要重新使用匿名对象。
        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("覆盖重写接口的抽象方法，111-A");
            }

            @Override
            public void methodB() {
                System.out.println("覆盖重写接口的抽象方法，222-B");
            }
        }.methodB();


    }


}
