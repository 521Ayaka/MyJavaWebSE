package C1_Junit单元测试.A1_Junit单元测试.tst;

import C1_Junit单元测试.A1_Junit单元测试.Calculator;
//导入环境。
import org.junit.jupiter.api.Test;

//建议类名: 类名+Test
public class CalculatorTest {


    //使用注解:  @Test --> 将Junit调入 jdk 包当中。
    @Test
    void/*建议返回值: void*/ testSum/*建议方法名: test+方法名(开头大写)*/( /*建议参数列表: 空*/) {

        //创建对象 并调用方法 并输出
        System.out.println(new Calculator().sum(1, 2));

        //拆分步骤
    }

    //建议视图: 结构 alt + 7    idea

    //TODO: 继续学习吧！

    @Test
    void testCa() {
        //创建对象 并调用方法
        new Calculator().ca(4, 2);
    }

}
