package 基础知识.类库.ArrayList;

public class Student {

    String name ;
    int age ;

    public void AiHao(){
        System.out.println("打云顶之弈");
    }

    public String ID(){
        return "永远i爱你";
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
