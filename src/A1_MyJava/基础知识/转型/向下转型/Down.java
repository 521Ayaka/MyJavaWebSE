package A1_MyJava.����֪ʶ.ת��.����ת��;
/*
����ת��һ���ǰ�ȫ�ģ�û������ģ���ȷ�ģ���Ҳ��һ���׶ˣ�
����һ������ת��Ϊ���࣬��ô���޷���������ԭ�����е����ݡ�

����������ö��������ת�͡���ԭ����

*/
public class Down {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

//      animal.catchMouse(); //����д����
        //ʹ������ת��
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //��������ת��
        Dog dog = (Dog) animal;
        //����д�������벻�ᱨ���������л��������: java.lang.ClassCastException ������ת���쳣��

    }

}
