package A1_MyJava.����֪ʶ.IO��.���������.�������з����л���.A1_�������л���;

import java.io.Serializable;

public class Student2 implements Serializable/*ʵ�ָýӿں����Ķ����ܱ����л�*/ {

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
