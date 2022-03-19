package C1_Junit单元测试.A1_Junit单元测试.tst;
/*
    Assertions  断言 类

    assert   断言
    Expected  预期

    Assertions.assertEquals();

    @Before  之前
    @After   之后
                                */

import C1_Junit单元测试.A1_Junit单元测试.Calculator;

//导入环境。
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//建议类名: 类名+Test
public class CalculatorTest {

    @Before //注解 @Before  先运行所有测试方法！
    public void init(){
        System.out.println("init...");
    }

    @After //注解 @After  运行完所有测试方法后 执行该方法内容！
    public void close(){
        System.out.println("close...");
    }


    //使用注解:  @Test --> 将Junit调入 jdk 包当中。
    @Test
    void/*建议返回值: void*/ testSum/*建议方法名: test+方法名(开头大写)*/( /*建议参数列表: 空*/) {
        System.out.println("testSun...");
        //创建对象
        Calculator cal = new Calculator();
        //调用方法
        int num = cal.sum(1, 2);
/*      //输出
        System.out.println(num);*/
        //一般使用输出, 只看颜色
        //使用: 断言:
        //方式一:
        // assert 4 == num;
        //方式二:
        Assertions.assertEquals(3,num);
        //参数1：预期   参数2：程序运行结果
    }

    //建议视图: 结构 alt + 7    idea

    //TODO: 继续学习吧！

    @Test
    void testCa() {
        System.out.println("testCa...");
        //创建对象
        Calculator cal = new Calculator();
        //调用方法
        int num = cal.ca(3, 2);

        //断言
        Assertions.assertEquals(1,num);
    }


}
