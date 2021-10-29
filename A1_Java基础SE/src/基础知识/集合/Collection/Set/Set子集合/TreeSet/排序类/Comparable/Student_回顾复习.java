package 基础知识.集合.Collection.Set.Set子集合.TreeSet.排序类.Comparable;

public class Student_回顾复习 implements Comparable<Student_回顾复习> {

    private String name;
    private int age;

    public Student_回顾复习() {
    }

    public Student_回顾复习(String name, int age) {
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
    public int compareTo(Student_回顾复习 o) {
        int num = this.age - o.age;
        int i = num == 0 ? this.name.compareTo(o.name) : num;
        return i;
    }
}
