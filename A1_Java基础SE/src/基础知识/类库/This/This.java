package 基础知识.类库.This;

public class This {
    public static void main(String[] args) {
        ThisLei01 lei04 = new ThisLei01();
        lei04.name= "王健林";
        lei04.hello1("王思聪");
        System.out.println("=================================");
        
        //当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。

        lei04.name= "王健林";
        //参数 局部变量“ 王健林 ”

        lei04.hello2("王思聪");

        System.out.println("================================");
        lei04.name= "王健林";
        //参数 局部变量“ 王健林 ”
        lei04.hello3("王思聪");
        // System.out.println(name+"你好，我叫"+this.name);
        //使用了this访问成员变量
        
        System.out.println("======================================================");

        ThisLei02 lei02 = new ThisLei02();
        lei02.fun("这是局部变量");

        
        /*      void fun(String str){
                    System.out.println(str);  //打印参数str
                    System.out.println(this.str);   //使用this.str 打印全局变量
            
                    //是参数str赋值给全局变量str
                    this.str = str;
                    System.out.println(this.str);
                }
        */
    }
}
