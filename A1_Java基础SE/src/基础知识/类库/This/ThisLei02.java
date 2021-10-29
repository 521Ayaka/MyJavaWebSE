package 基础知识.类库.This;

public class ThisLei02{

    String str = "这是成员变量";

    void fun(String str){
        System.out.println(str);  //打印参数str
        System.out.println(this.str);   //使用this.str 打印全局变量
        
        //是参数str赋值给全局变量str
        this.str = str;
        System.out.println(this.str);
    }
}
