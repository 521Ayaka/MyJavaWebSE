package A1_MyJava.基础知识.IO流.特殊操作流.对象序列反序列化流.A3_对象反序列化的问题与标准;

import java.io.Serializable;

//比较标准的写法：
public class Student implements Serializable/*1:实现Serializable接口*/ {
    //2:给对象所属的类加一个serialVersionUID
         //--必须是 静态的 final修饰 long类型 名字是serialVersionUID
    private static final long serialVersionUID = 42L;

    //成员变量
    private String name;
    private int age;
    //3:如果不想序列化该成员变量使用transient修饰
    private transient int ID = 0;

    //4:要想不报错,必须有可访问的无参构造方法！
    public Student() {
    }

    public Student(String name, int age, int ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //重写toString()方法

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                '}';
    }
}
