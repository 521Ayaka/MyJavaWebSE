package C3_注解.D4_解析注解;
/*

注解：
来描述需要执行的类名, 和方法名

 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//添加元注解
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {

    String className();
    String methodName();

}
