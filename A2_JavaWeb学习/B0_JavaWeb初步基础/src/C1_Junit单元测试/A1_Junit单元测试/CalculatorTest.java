package C1_Junit单元测试.A1_Junit单元测试;
/*
    测试了

    不通过 Junit单元测试,
    需要使用main方法

*/

public class CalculatorTest {

    public static void main(String[] args) {

        //创建对象
        Calculator cal = new Calculator();

/*        //调用方法
        cal.ca(3,2);*/

        //调用方法
        cal.sum(1,1);

        /*
        这种测试方法的弊端：

        需要使用main方法
        需要不停注释掉其他方法

        */
    }

}
