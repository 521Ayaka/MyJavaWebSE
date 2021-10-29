package 基础知识.集合.Collection.Set.Set子集合.TreeSet.排序类.Comparable;

public class Student_3 implements Comparable<Student_3>{

    private String name;
    private int age;

    public Student_3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student_3() {
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
    public int compareTo(Student_3 o) {
        int num = this.age - o.age;
        int numL = num == 0 ? this.name.compareTo(o.name) : num;
        return numL;
    }

    /*@Override
    public int compareTo(Student_3 o) {
        int num = this.age - o.age;
        int num1 = num == 0 ? this.name.compareTo(o.name) : num;
        return num1;
    }*/

}