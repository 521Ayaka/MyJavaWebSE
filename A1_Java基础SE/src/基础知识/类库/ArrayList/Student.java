package ����֪ʶ.���.ArrayList;

public class Student {

    String name ;
    int age ;

    public void AiHao(){
        System.out.println("���ƶ�֮��");
    }

    public String ID(){
        return "��Զi����";
    }

    public Student() {
    }

    public Student(String name, int age) {
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
