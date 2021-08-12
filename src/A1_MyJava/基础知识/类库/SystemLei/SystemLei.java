package A1_MyJava.基础知识.类库.SystemLei;

/*
java.lang.System     静态方法

System在lang包当中不用导包， 方法都为静态方法，直接使用
*/
public class SystemLei {

    public static void main(String[] args) {

        //public static void exit(){...}   //终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止

        //public static lang currentTimeMillis(){...}
        // 返回以毫秒为单位的当前时间。注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间。
        // 当前时间与协调世界时 1970 年 1 月 1 日午夜之间的时间差（以毫秒为单位测量）。

        System.out.println("===========================================================================================");

        //public static long currentTimeMillis(){...}
        // 返回以毫秒为单位的当前时间。注意，当返回值的时间单位是毫秒时，值的粒度取决于底层操作系统，并且粒度可能更大。例如，许多操作系统以几十毫秒为单位测量时间。
        // 当前时间与协调世界时 1970 年 1 月 1 日午夜之间的时间差（以毫秒为单位测量）。

        System.out.println(System.currentTimeMillis());
        System.out.println("返回年");
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年"); //快捷键ctrl+alt+l     * 1.0为了更精确
        System.out.println("验证：" + (2021 - 1970));
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            System.out.print(i+"  ");
        }   System.out.println();

        long b = System.currentTimeMillis();
        System.out.println("共耗时：" + ( (b - a) / 1000) + "秒"); // 共耗时：13秒

        //public static void exit(){...}   //终止当前正在运行的 Java 虚拟机。参数用作状态码；根据惯例，非 0 的状态码表示异常终止
        System.exit(0);
        System.out.println("结束");
    }

}
