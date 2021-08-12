package A1_MyJava.����֪ʶ.���.OjbectLei;

/*

java.lang.Object
Object �����νṹ�ĸ��ࡣÿ���඼ʹ�� Object ��Ϊ���ࡣ���ж��󣨰������飩��ʵ�������ķ�����

������������У�Ϊʲô˵����Ĺ��췽��Ĭ�Ϸ��ʵ��Ǹ�����޲ι��췽����
��ΪObject����ֻ���޲ι��췽����

toString()����
equals()����

*/
public class ObjectLei {

    public static void main(String[] args) {

        Student student = new Student();
        student.setName("����");
        student.setAge(20);

        System.out.println(student); // MyJava.����֪ʶ.���.OjbectLei.Student@119d7047

        /* println��Դ��:

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

        ����valueOf()����:
        public static String valueOf(Object obj) {                                     //obj = student
               return (obj == null) ? "null" : obj.toString();                         //student��new�����ģ���null��ִ��obj.toString
        }                                                                              //����String�ַ��� ����

        ����toString()����
        public String toString() {                                                     //Student��Ĭ�ϼ̳���toString()����
               return getClass().getName() + "@" + Integer.toHexString(hashCode());    //����String�ַ��� ����
        }
       */

        //�Դ˿�֪��System.out.println(student) �� �ײ���õ���Student��Ĭ�ϼ̳е�Object���toString()����
        //ֱ��ʹ��toString()����

        System.out.println(student.toString()); //MyJava.����֪ʶ.���.OjbectLei.Student@119d7047

        System.out.println((student).equals(student.toString()));

        System.out.println("==========================================================================================");

        System.out.println("������д���toString()����");
        StudentToStringMethod s = new StudentToStringMethod();
        s.setName("���ν�");
        s.setAge(19);
        //��ӡ
        System.out.println(s);

        System.out.println("==========================================================================================");
        System.out.println("==========================================================================================");
        System.out.println("==========================================================================================");

        Student student1 = new Student();
        student1.setName("���ν�");
        student1.setAge(19);

        Student student2 = new Student();
        student2.setName("���ν�");
        student2.setAge(19);

        System.out.println(student1.equals(student2));


    }

}
