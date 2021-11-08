package 基础知识.反射.A6_反射获取成员方法;
/*
通过反射获取成员方法:

获取所有公共成员方法 数组:
        Method[] getMethods()返回包含一个数组方法对象反射由此表示的类
        或接口的所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。


获取所有成员方法 数组:
        Method[] getDeclaredMethods() 返回包含一个数组方法对象反射的类或接口的所有声明的方法，
        通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。

=====================================================================================

获取单个公共成员方法 数组:
        Method getMethod(String name, class<?>... parameterTypes)
        返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。

获取单个成员方法 数组:
        Method getDeclaredMethod(String name, class<?>... parameterTypes)
        返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。

其中:
        name: name是调用的方法名称
        para: 该name方法的参数 [个数] 和 [类型的class对象]

=====================================================================================

使用Method类:

        Object invoke(Object obj, Object... args)
        在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。

        其中:
        Object: 返回值类型对象
        obj:    调用方法的对象
        args:   待用方法对象的参数。

        TODO: 思考使用非公共成员变量, 见 [练习]

*/

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NewMethod {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //创建class对象
        Class<?> c = Class.forName("基础知识.反射.A3_获取class类的对象.Student");

        //访问成员方法:

        method1(c); //test: 获取所有[公共成员方法] 数组
        method2(c); //test: 获取所有[成员发给发]   数组

        method3(c); //test: 获取单个[公共成员方法]
        method4(c); //test: 获取单个[成员方法]

        useMethod(c); //通过Method类, 使用成员方法

    }

//=======================================================================================================

    public static void method1(Class<?> c) {
        System.out.println("\n==================================================================\n");

        //获取所有公共成员方法 数组:
        Method[] mes = c.getMethods();
        //遍历结果:
        for (Method me : mes) {
            System.out.println(me);
        }
        /*运行结果:
        public java.lang.String 基础知识.反射.A3_获取class类的对象.Student.toString()
        public void 基础知识.反射.A3_获取class类的对象.Student.method1()
        public void 基础知识.反射.A3_获取class类的对象.Student.method2(java.lang.String)
        public void 基础知识.反射.A3_获取class类的对象.Student.method3(java.lang.String,int)
        public void 基础知识.反射.A3_获取class类的对象.Student.method4()
        public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
        public final void java.lang.Object.wait() throws java.lang.InterruptedException
        public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
        public boolean java.lang.Object.equals(java.lang.Object)
        public native int java.lang.Object.hashCode()
        public final native java.lang.Class java.lang.Object.getClass()
        public final native void java.lang.Object.notify()
        public final native void java.lang.Object.notifyAll()
        */ //访问所有公共成员方法, 包括继承的父类方法！

        System.out.println("\n==================================================================\n");

    }


//=======================================================================================================

    public static void method2(Class<?> c) {
        //获取所有成员方法 数组:
        Method[] mes = c.getDeclaredMethods();
        //遍历结果:
        for (Method me : mes) {
            System.out.println(me);
        }
        /*运行结果:

        public java.lang.String 基础知识.反射.A3_获取class类的对象.Student.toString()
        private void 基础知识.反射.A3_获取class类的对象.Student.me()
        public void 基础知识.反射.A3_获取class类的对象.Student.method4()
        public void 基础知识.反射.A3_获取class类的对象.Student.method3(java.lang.String,int)
        public void 基础知识.反射.A3_获取class类的对象.Student.method2(java.lang.String)
        public void 基础知识.反射.A3_获取class类的对象.Student.method1()
        */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void method3(Class<?> c) throws NoSuchMethodException {

        //获取单个公共成员方法
        Method me1 = c.getMethod("method1");
        Method me2 = c.getMethod("method2", String.class);
        Method me3 = c.getMethod("method3", String.class, int.class);
        Method me4 = c.getMethod("method4");
        Method getC = c.getMethod("getClass");
        Method code = c.getMethod("hashCode");
        /*其中:
        name: name是调用的方法名称
        para: 该name方法的参数 [个数] 和 [类型的class对象]
        */

        //输出结果
        System.out.println(me1);
        System.out.println(me2);
        System.out.println(me3);
        System.out.println(me4);
        System.out.println(getC);
        System.out.println(code);
        /*运行结果:

        public void 基础知识.反射.A3_获取class类的对象.Student.method1()
        public void 基础知识.反射.A3_获取class类的对象.Student.method2(java.lang.String)
        public void 基础知识.反射.A3_获取class类的对象.Student.method3(java.lang.String,int)
        public void 基础知识.反射.A3_获取class类的对象.Student.method4()
        public final native java.lang.Class java.lang.Object.getClass()
        public native int java.lang.Object.hashCode()
        */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void method4(Class<?> c) throws NoSuchMethodException {

        //获取单个成员方法:
        Method me = c.getDeclaredMethod("me");

        //输出结果:
        System.out.println(me);

        /*运行结果:

        private void 基础知识.反射.A3_获取class类的对象.Student.me()
                                                                    */

        System.out.println("\n==================================================================\n");
    }


//=======================================================================================================


    public static void useMethod(Class<?> c) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //要想使用Method, 先通过反射获取构造器创建对象
        Constructor<?> con = c.getDeclaredConstructor();

        //通过获取到的构造器创建对象
        con.setAccessible(true);
        Object obj = con.newInstance();

        //通过反射获取成员方法
        Method method = c.getMethod("method1");

        //通过Method类 obj调用method1方法。
        /*
        Object invoke(Object obj, Object... args)
        在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。

        其中:
        Object: 返回值类型对象
        obj:    调用方法的对象
        args:   待用方法对象的参数。

        */

        Object o = method.invoke(obj);
        System.out.println(o);//method1无返回值
        /*
        其中:
        obj对象,obj中的method对象[method1]
        obj后面为空,因为method1中参数列表为空
        o为null,因为method1中没有返回值

        运行结果:
        method1
        null

        */

        //TODO: 思考使用非公共成员变量, 见 [练习]

    }


}
