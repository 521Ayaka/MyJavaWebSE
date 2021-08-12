package A1_MyJava.基础知识.类库.OjbectLei;

public class StudentToStringMethod {

    private String name;
    private int age;

    public StudentToStringMethod() {
    }

    public StudentToStringMethod(String name, int age) {
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

    @Override
    public String toString() {
        return "StudentToStringMethod{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
