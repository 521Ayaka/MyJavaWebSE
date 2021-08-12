package A1_MyJava.基础知识.类库.GetSet;

/*

一个标准的类通常要拥有以下四个组成部分：

1：所有成员变量都要用关键字private进行私有化修饰。

2：为每一个成员变量编写一对儿Getter/Settet方法。

3：编写一个无参数的构造方法。

4：编写一个全参数的构造方法。

这样标准的类，也叫做Java Bean
*/
public class Lei {


    // 1：所有成员变量都要用关键字private进行私有化修饰。
    private String name ;
    private int age;
    private String aihao;
    private boolean liubu;
    private int bian;


    // 2：为每一个成员变量编写一对儿Getter/Settet方法。

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age ;
    }

    public int getAge(){
        return age;
    }

    public void setAihao(String aihao){
        this.aihao = aihao;
    }

    public String getAaihao(){
        return aihao;
    }
    
    public void setLiubu(boolean liubu){
        this.liubu = liubu;
    }

    public boolean isLiubu(){
        return liubu;
    }

    public void setInt(int bian){
        this.bian = bian;
    }

    public int getInt(){
        return bian;
    }



    // 构造方法


    //3：编写一个无参数的构造方法。
    public Lei(){
    }

    //4：编写一个全参数的构造方法。
    public Lei(String name, int age, String aihao, boolean liubu, int bian){
        this.name = name;
        this.age = age;
        this.aihao = aihao;
        this.liubu = liubu;
    }
       
}
