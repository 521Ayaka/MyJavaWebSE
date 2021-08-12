package A1_MyJava.基础知识.类库.OjbectLei;

/*

java.lang.Object
Object 是类层次结构的根类。每个类都使用 Object 作为超类。所有对象（包括数组）都实现这个类的方法。

回想面向对象当中，为什么说子类的构造方法默认访问的是父类的无参构造方法？
因为Object根类只有无参构造方法。

toString()方法
equals()方法

*/
public class ObjectLei {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("尴尬");
        student.setAge(20);

        System.out.println(student); // MyJava.基础知识.类库.OjbectLei.Student@119d7047

        /* println的源码:

        public void println(Object x) {
            String s = String.valueOf(x);                                              // x = student
            if (getClass() == PrintStream.class) {
                // need to apply String.valueOf again since first invocation
                // might return null
                writeln(String.valueOf(s));
            } else {
                synchronized (this) {
                    print(s);
                    newLine();
                }
            }
        }

        跟进valueOf()方法:
        public static String valueOf(Object obj) {                                     //obj = student
               return (obj == null) ? "null" : obj.toString();                         //student是new出来的，非null，执行obj.toString
        }                                                                              //返回String字符串 向上

        跟进toString()方法
        public String toString() {                                                     //Student类默认继承了toString()方法
               return getClass().getName() + "@" + Integer.toHexString(hashCode());    //返回String字符串 向上
        }
       */

        //以此可知，System.out.println(student) 中 底层调用的是Student类默认继承的Object类的toString()方法
        //直接使用toString()方法

        System.out.println(student.toString()); //MyJava.基础知识.类库.OjbectLei.Student@119d7047

        System.out.println((student).equals(student.toString()));

        System.out.println("==========================================================================================");

        System.out.println("覆盖重写后的toString()方法");
        StudentToStringMethod s = new StudentToStringMethod();
        s.setName("尴尬酱");
        s.setAge(19);
        //打印
        System.out.println(s);

        System.out.println("==========================================================================================");
        System.out.println("==========================================================================================");
        System.out.println("==========================================================================================");

        Student student1 = new Student();
        student1.setName("尴尬酱");
        student1.setAge(19);

        Student student2 = new Student();
        student2.setName("尴尬酱");
        student2.setAge(19);

        System.out.println(student1.equals(student2));


    }

}
