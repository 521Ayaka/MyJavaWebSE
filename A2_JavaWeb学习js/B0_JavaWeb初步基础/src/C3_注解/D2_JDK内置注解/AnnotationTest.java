package C3_注解.D2_JDK内置注解;
/*

JDK中预定义的一些注解

	* @Override	：检测被该注解标注的方法是否是继承自父类(接口)的
	* @Deprecated：该注解标注的内容，表示已过时
	* @SuppressWarnings：压制警告
		* 一般传递参数all  @SuppressWarnings("all")

    @SuppressWarnings("all")  是有参数的！
*/

import org.junit.jupiter.api.Test;

@SuppressWarnings("all") //作用类前，镇压类全部按警告
public class AnnotationTest {

    @SuppressWarnings("all")  //作用方法前，镇压方法全部警告
    @Override //Override 编译检测是否重写父类方法
    public String toString(){
        String s = "重写toString";
        return s;
    }

    @Test
    public void testDeprecated(){
        me1(); //idea会提示该方法已过时。
        me2();

    }

    @Deprecated
    public void me1(){
        System.out.println("me1已荒废,不推选使用");
    }

    public void me2(){
        System.out.println("me2完善了me1方法");
    }




}
