package A1_MyJava.基础知识.Lambda表达式.A6_体验方法引用;


public class RunMethod {

    public String string = "阿西吧吧西巴西巴";

    public static void main(String[] args) {

        //使用Lambda表达式
        method1(e -> System.out.println(e));
        System.out.println("=================");

        //接着使用方法引用
        method1(System.out::println);//使用方法引用。
        System.out.println("=================");

        //通过类的静态方法的调用 实现方法引用
        method1(MethodInterface01::me);//自动识别参数类型 String
        System.out.println("=================");
        method1(RunMethod::me);//自动识别参数类型 String
        System.out.println("=================");

        //通过对象调用该对象方法 实现方法引用
        Me meObj = new Me();
        method1(meObj::method);
        System.out.println("=================");

        //String中用一个静态方法substring 参数列表有(String,int,int)
        subString((s,i,eI)->s.substring(i,eI));
        System.out.println("=================");
        subString(String::substring);
        //注意/解释:
        //Lambda表达式被类的实例方法替代的时候
        //第一个参数作为调用者
        //后面的参数全部按顺序传递给该方法作为参数。
        System.out.println("=================");



    }

    private static void subString(MySubString e){
        String str = e.meSubString("零一二三四五六七八", 3, 7);
        System.out.println(str);
    }

    private static void method1(MethodInterface01 e) {
        e.method("这就尴尬了");
    }


    private static int method2(MethodInterface02 e) {
        int i = e.method(6666);
        return i;
    }


    //该类中的两个重载方法
    public static void me(String str) {
        System.out.println("me重载 参数类型: String :" + str);
        System.out.println("RunMethod 内部默认方法。");
    }

    public static void me(int a) {
        System.out.println("me重载 参数类型: int :" + a);
        System.out.println("RunMethod 内部默认方法。");
    }

}
