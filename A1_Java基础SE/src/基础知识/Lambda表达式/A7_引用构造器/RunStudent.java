package 基础知识.Lambda表达式.A7_引用构造器;

public class RunStudent {

    public static void main(String[] args) {

        //通过Lambda表达式创建
        /*useStudent( (name,age)->{
            Student stu = new Student(name,age);
            return stu;
        } );*/
        useStudent((name,age)->new Student(name,age));

        System.out.println("====================");

        //通过Lambda表达式，调用构造器
        useStudent(Student::new);
        //Lambda表达式被构造器代替的时候, 它的形式参数全部传递给构造器的参数
        //返回Student 创建Student 将参数按顺序传给public Student(String name,int age){//...}

    }


    private static void useStudent(StudentInterface e) {
        Student stu = e.builder("尴尬酱", 20);
        System.out.println("姓名: " + stu.getName() + ", 年龄: " + stu.getAge());
    }

}
