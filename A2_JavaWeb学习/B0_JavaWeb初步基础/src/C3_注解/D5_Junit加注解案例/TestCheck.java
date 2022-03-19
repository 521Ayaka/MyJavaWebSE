package C3_注解.D5_Junit加注解案例;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * 简单的测试框架
 * <p>
 * 当主方法执行后, 会自动自行被检测的所有方法 (加了TestAnn注解的方法)
 * 判断方法是否有异常, 记录到文件里
 */

public class TestCheck {

    public static String file = "D:\\源代码\\A2_JavaWeb学习\\B0_JavaWeb初步基础\\src\\C3_注解\\D5_Junit加注解案例\\bug.txt";

    @Test
    public void meTest() throws IOException {

        //1.创建小明的计算机类
        Calculator cal = new Calculator();

        //2.获取对象的Class对象
        Class<? extends Calculator> cla = cal.getClass();

        int num = 0;//记录异常次数
        //创建IO流记录异常 日志
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        //3.获取对象方法的对象
        Method[] mes = cla.getMethods();
        for (Method me : mes) {

            //4.判断方法上是否有TestAnn注解
            if (me.isAnnotationPresent(TestAnn.class)) {

                //5.如果有的话,执行
                try {
                    //通过反射使用方法。
                    me.invoke(cal);

                }
                catch (Exception e) {

                    //6.捕获异常 记录到文件当中
                    num++;
                    bw.write(me.getName() + "出现异常");
                    bw.newLine();
                    bw.write("异常的名称: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因: " + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("=======================================");
                    bw.newLine();
                }

            }

        }

        bw.write("本次测试共出现 " + num + " 次异常。");
        bw.flush();
        bw.close();

        System.out.println("==============================");
        System.out.println("日志以生成,出现: "+num+" 次异常。");

    }

}
