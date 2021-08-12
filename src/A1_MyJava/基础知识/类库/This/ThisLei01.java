package A1_MyJava.基础知识.类库.This;

public class ThisLei01 {
    String name;
    public void hello1(String who){
        System.out.println(who+"你好，我叫"+name);
    }

    public void hello2(String namae){
        System.out.println(name+"你好，我叫"+name);
    }
    public void hello3(String name){
        System.out.println(name+"你好，我叫" + this.name);
        //使用了this访问成员变量
    }

    
}
