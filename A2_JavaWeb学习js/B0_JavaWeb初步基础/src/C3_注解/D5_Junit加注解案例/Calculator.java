package C3_注解.D5_Junit加注解案例;

/**
 * 小明定义的计算器类
 */
public class Calculator {

    //加法
    @TestAnn
    public void add(){
        String str = null;
        str.equals("EDG_NB_我们是冠军");
        System.out.println("1 + 0 =" + (1 + 0));
    }


    //减法
    @TestAnn
    public void sub(){
        System.out.println("1 - 0 =" + (1 - 0));
    }

    //乘法
    @TestAnn
    public void mul(){
        System.out.println("1 * 0 =" + (1 * 0));
    }

    //除法
    @TestAnn
    public void div(){
        System.out.println("1 / 0 =" + (1 / 0));
    }


    public void show(){
        System.out.println("永无bug...");
    }

}