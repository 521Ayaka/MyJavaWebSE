package A1_MyJava.基础知识.集合.Collection.Set.Set子集合.TreeSet.排序类.Comparable;

public class Student_2 implements Comparable<Student_2>{

    private String name;
    private int age;

    public Student_2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student_2() {
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
    public int compareTo(Student_2 o) {
//        return 0;  //重复元素
//        return 1;  //放入后面
//        return -1; //放入前面
        return this.age - o.age;
    }

}