package A1_MyJava.基础知识.基础.final关键字.final03;
/*

3. 对于final关键字修饰局部变量:

一旦使用final关键字修饰局部变量，那么这个变量数值不能进行改变。
【一次赋值，终身不变】

注意事项:
对于基本类型来说，不可变说的是变量当中的数据不可改变。
对于引用类型来说，不可变说的是变量当中的地址值不可改变。

*/
public class Final {

    public static void main(String[] args) {

        final int num1 = 10;
        System.out.println(num1);
//        num1 = 20;  //错误写法
//        System.out.println(num1);

        final int num2 = 20;
        System.out.println(num2);
//        num2 = 20; //错误写法
//        System.out.println(num2);

        final int num3 ;
        num3 = 30;   //正确写法，只要保证是唯一一次赋值即可，终身不变。
        System.out.println(num3);

        //对于基本类型来说，不可变说的是变量当中的数据不可改变。
        //对于引用类型来说，不可变说的是变量当中的地址值不可改变。

        System.out.println("==============================================================================");

        Gan gan = new Gan("尴尬酱");
        System.out.println("//"+gan);         //MyJava.基础知识.基础.final关键字.final03.           Gan@15aeb7ab   地址值
        System.out.println(gan.getName());
                                                                                             // 不同
        gan = new Gan("尴尬帝");
        System.out.println("//"+gan);         //MyJava.基础知识.基础.final关键字.final03.           Gan@7b23ec81   地址值
        System.out.println(gan.getName());

        System.out.println("=============================================================================");

        final Gan gan1 = new Gan("尴尬帝");
        System.out.println("//"+gan1);        //MyJava.基础知识.基础.final关键字.final03.            Gan@6acbcfc0  地址值
        System.out.println(gan1.getName());

//      gan1 = new Gan("尴尬帝");                                                              //相同
//      错误写法，不能重新创建 修改这个使用final的gan1对象了。
        gan1.setName("尴尬帝帝帝帝帝帝");
        System.out.println(gan1.getName());
        System.out.println("//"+gan1);        //MyJava.基础知识.基础.final关键字.final03.            Gan@6acbcfc0  地址值





    }

}