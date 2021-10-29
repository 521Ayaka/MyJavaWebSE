package ����֪ʶ.Lambda���ʽ.A7_���ù�����;

public class RunStudent {

    public static void main(String[] args) {

        //ͨ��Lambda���ʽ����
        /*useStudent( (name,age)->{
            Student stu = new Student(name,age);
            return stu;
        } );*/
        useStudent((name,age)->new Student(name,age));

        System.out.println("====================");

        //ͨ��Lambda���ʽ�����ù�����
        useStudent(Student::new);
        //Lambda���ʽ�������������ʱ��, ������ʽ����ȫ�����ݸ��������Ĳ���
        //����Student ����Student ��������˳�򴫸�public Student(String name,int age){//...}

    }


    private static void useStudent(StudentInterface e) {
        Student stu = e.builder("���ν�", 20);
        System.out.println("����: " + stu.getName() + ", ����: " + stu.getAge());
    }

}
