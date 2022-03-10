package 基础知识.反射.A3_获取class类的对象;

public class Student {

    //一个私有成员变量
    private String name;
    //一个默认成员变量
    int age;
    //一个公共成员变量
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
        System.out.println("me私有方法");
    }

    public void method1() {
        System.out.println("method1");
    }

    public void method2(String name) {
        this.name = name;
        System.out.println("method2"+"  姓名:" + name);
    }

    public String method3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("method3"+"  姓名:" + name + "年龄:" + age);
        return "姓名:" + name + "年龄:" + age;
    }

    public void method4() {
        System.out.println("method4");
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
