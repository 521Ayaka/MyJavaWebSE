package C3_注解.D3_自定义注解;

import org.junit.jupiter.api.Test;

//@MyAnnotation02(name = "不能注释在方法体上")
public class MyAnnotationTest {

    @Test
    @MyAnnotation01(age = 19, is18 = false, name = "GanGa", MES = Mes.GanGa, SW = @SuppressWarnings("all"), nums = {1, 1, 2}, str = "默认可以不进行赋值")
    public void myAnnotationTest(){
        //有属性就必须赋值, 除非是默认属性, 可以不用赋值。
    }


    @Test
    @MyAnnotation02(name = "注释在方法上")
    public void annTest() {

    }

    @MyAnnotation02(name = "可以注释在成员变量上")
    private static int num = 123;

}
