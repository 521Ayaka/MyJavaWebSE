package C3_ע��.D4_����ע��;
/*

ע�⣺
��������Ҫִ�е�����, �ͷ�����

 */


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//���Ԫע��
@Target(value = {ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {

    String className();
    String methodName();

}
