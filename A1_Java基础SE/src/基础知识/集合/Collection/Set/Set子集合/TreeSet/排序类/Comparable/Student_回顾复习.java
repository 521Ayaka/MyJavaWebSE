package ����֪ʶ.����.Collection.Set.Set�Ӽ���.TreeSet.������.Comparable;

public class Student_�ع˸�ϰ implements Comparable<Student_�ع˸�ϰ> {

    private String name;
    private int age;

    public Student_�ع˸�ϰ() {
    }

    public Student_�ع˸�ϰ(String name, int age) {
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
    public int compareTo(Student_�ع˸�ϰ o) {
        int num = this.age - o.age;
        int i = num == 0 ? this.name.compareTo(o.name) : num;
        return i;
    }
}
