package 基础知识.IO流.特殊操作流.对象序列反序列化流.A1_对象序列化流;

import java.io.Serializable;

public class Student2 implements Serializable/*实现该接口后该类的对象能被序列化*/ {

    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
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
}
