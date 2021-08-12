package A1_MyJava.基础知识.接口.Interface01;

//“实现类” 命名一般是 接口名+Impl  //I大写的i l小写的l


//可以使用ALT+回车，快速覆盖重写抽象方法
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{


    //覆盖重写
    @Override
    public void methodAbs1(){
        System.out.println("methodAbs1方法体");
    }

    @Override
    public int methodAbs2(int x){
        System.out.println("methodAbs2方法体");
        return x;
    }

    @Override
    public void methodAbs3(){
        System.out.println("methodAbs3方法体");
    }

    @Override
    public boolean methodAbs4(double y){
        System.out.println("methodAbs4方法体");
        return true;
    }


}
