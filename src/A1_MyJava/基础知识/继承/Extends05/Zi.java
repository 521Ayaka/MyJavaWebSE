package A1_MyJava.基础知识.继承.Extends05;

public class Zi extends Fu {

    @Override
    public void method() {
        System.out.println("子重写覆盖父类成员方法。");
    }

    //==============================================================

    //正确写法
    @Override
    public String method00() {
        String x = "尴尬";
        return x;
    }
    /**

     //错误写法
     //2.子类方法的返回值必须【小于等于】父类方法的返回值范围

     @Override
     public Objet method01(){
         return null;
     }

    */

    //================================================================

    //正确写法
    @Override
    public void method02() {
    }
    @Override
    void method03(){

    }


    /**

     //错误写法
     //3.子类方法的权限必须【大于等于】父类方法的权限修饰符。

     @Override
     void method04(){
     }

     @Override
     private void method05(){
     }

     */
}
