package A1_MyJava.����֪ʶ.ת��.��Instanceof�ؼ���;
/*
��β���֪��һ���������õĶ��󣬱�����ʲô��?
��ʽ: �������� instanceof ��������;

�������ص���һ��booleanֵ�������жϸ������õĶ����Ƿ�Ϊ�������
*/
public class Down {

    public static void main(String[] args) {

        Animal animal = new Cat();

        //ʹ��instanceof�ؼ��ֽ����жϸ������õĶ����Ƿ�Ϊ���������
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchMouse();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

        //ʲôʱ��ʹ��instanceof:
        giveMeAPet(new Dog());//���÷���������������󣬸�������ָ��������󣬾�������ת�ͣ���̬��
    }

    //����һ�����������Ǹ����� ��Χ ������Ĳ�����ĳ���� С��Χ���ڸ÷��������ǲ�֪���������õ����Ǹ����࣬ʹ��instanceof�����жϡ�
    public static void giveMeAPet(Animal animal){
        //�жϸ����Ƿ����õĹ���
        if(animal instanceof Dog){
            Dog dog = (Dog) animal;//����ת��
            dog.watchMouse();
        }
        //�жϸ����Ƿ����õ�è
        if(animal instanceof Cat){
            Cat catTwo = (Cat)animal;//����ת��
            catTwo.catchMouse();
        }
    }

}
