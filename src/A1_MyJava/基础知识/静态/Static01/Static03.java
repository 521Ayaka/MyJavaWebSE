package A1_MyJava.����֪ʶ.��̬.Static01;

public class Static03 {

    public static void main(String[] args) {
        // ��������һ�½��ң����Ǿ�̬�Ķ�����Ӧ��ͨ�������ƽ��е���
        Student.room = "101����";

        Student one = new Student("����", 20);
        System.out.println("one��������" + one.getName());
        System.out.println("one�����䣺" + one.getAge());
        System.out.println("one�Ľ��ң�" + Student.room);
        System.out.println("============");

        Student two = new Student("����", 18);
        System.out.println("two��������" + two.getName());
        System.out.println("two�����䣺" + two.getAge());
        System.out.println("two�Ľ��ң�" + Student.room);
    }

}
