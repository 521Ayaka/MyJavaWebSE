package A1_MyJava.����֪ʶ.��̬.Static01;

/*

 ���һ����Ա����ʹ����static�ؼ��֣���ô��������������ڶ����Լ��������������ڵ��ࡣ
 ���������ͬһ�����ݡ�

 */
public class Static01 {

    public static void main(String[] args) {

        Student two = new Student("����", 16);
        two.room = "101����";
        System.out.println("������" + two.getName()
                + "�����䣺" + two.getAge() + "�����ң�" + two.room
                + "��ѧ�ţ�" + two.getId());

        Student one = new Student("����", 19);
        System.out.println("������" + one.getName()
                + "�����䣺" + one.getAge() + "�����ң�" + one.room
                + "��ѧ�ţ�" + one.getId());
    }

}
