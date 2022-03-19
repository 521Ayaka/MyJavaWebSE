package C3_注解.D3_自定义注解;
/*

元注解:

    用于描述注解的注解：

    		* @Target：描述注解能够作用的位置
    			* ElementType取值：
    				* TYPE：可以作用于类上
    				* METHOD：可以作用于方法上
    				* FIELD：可以作用于成员变量上

    		* @Retention：描述注解被保留的阶段
    			* @Retention(RetentionPolicy.RUNTIME)：当前被描述的注解，会保留到class字节码文件中，并被JVM读取到
                             RetentionPolicy.

    		* @Documented：描述注解是否被抽取到api文档中
    		* @Inherited：描述注解是否被子类继承


*/

import java.lang.annotation.*;


//元注解在自定义注解前面:

//@Target：描述注解能够作用的位置
@Target(/*value = */{ElementType.METHOD, ElementType.FIELD}) //TYPE

//@Retention: 描述注解被保留的阶段
@Retention(RetentionPolicy.RUNTIME)

//@Documented：描述注解是否被抽取到api文档中
@Documented  //使用这个自定义注解的类, 使用doc命令会保留注解注释


//@Inherited：描述注解是否被子类继承
@Inherited  //使用这个自定义注解的类的子类, 保留这个注解

public @interface MyAnnotation02 {

    String name();

}
