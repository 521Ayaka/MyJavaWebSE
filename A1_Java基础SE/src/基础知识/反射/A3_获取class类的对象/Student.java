package ����֪ʶ.����.A3_��ȡclass��Ķ���;

public class Student {

    //һ��˽�г�Ա����
    private String name;
    //һ��Ĭ�ϳ�Ա����
    int age;
    //һ��������Ա����
    public String id;

    public Student(){

    }

    private Student(String name){
        this.name = name;
    }

    Student(String name , int age ){
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    private void me(){
        System.out.println("me˽�з���");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String name) {
        this.name = name;
        System.out.println("method2"+"  ����:" + name);
    }

    public String method3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("method3"+"  ����:" + name + "����:" + age);
        return "����:" + name + "����:" + age;
    }

    public void method4() {
        System.out.println("method4");
    }

    //��дtoString����
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
