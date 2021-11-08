package C3_注解.D4_解析注解;
/*      框架类


                            */

import java.lang.reflect.Method;

//添加注解, 并赋值属性
@MyAnnotation(className = "C3_注解.D4_解析注解.TestLei01",methodName = "me")
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException {


        //解析注解
        //1获取该类的字节码文件对象
        Class<ReflectTest> c = ReflectTest.class;

        //2获取上边的注解对象
        MyAnnotation ann = c.getAnnotation(MyAnnotation.class);
/*      其实就是在内存中生产了一个该注解接口的子类接实现对象
        并且实现了方法, 返回赋值好的属性值
        public class MyAnnotationImpl implements MyAnnotation{
            public String className(){
                return "C3_注解.D4_解析注解.TestLei01";
            }
            public String methodName(){
                return "me";
            }
        }                                                   */

        //3调用注解对象中定义的抽象方法(属性), 获取返回值。
        String className = ann.className();
        String methodName = ann.methodName();

        System.out.println("类名: "+className+"\n方法名: "+methodName);
        System.out.println("=======================================");

        //注解在成员方法上的步骤
        method();

    }


    //同理 调用在方法上:
    @MyAnnotation(className = "C3_注解.D4_解析注解.TestLei02",methodName = "me")
    public static void method() throws NoSuchMethodException {

        //1.获取该类对象
        Class<ReflectTest> c = ReflectTest.class;

        //2.获取该方法对象
        Method me = c.getDeclaredMethod("method");

        //3.获取这个方法的注解对象
        MyAnnotation ann = me.getAnnotation(MyAnnotation.class);

        //4.调用注解对象中定义的抽象方法(属性), 获取返回值
        String className = ann.className();
        String methodName = ann.methodName();

        System.out.println("类名: "+className+"\n方法名: "+methodName);


    }


}
