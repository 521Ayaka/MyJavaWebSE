package ����֪ʶ.����.A����Ϊ��������;

public class Run {

    public static void main(String[] args) {
        //����Ӣ�۶���
        Hero heroOne = new Hero();
        //����Ӣ����Ϣ
        heroOne.setName("�����");
        heroOne.setAge(32);

        //������������
        Weapon weapon = new Weapon();
        weapon.setCode("AK-47");

        //������������
        heroOne.setWeapon(weapon);

        heroOne.method();
        System.out.println("========================================================================================");

        //ֱ�Ӵ���Ӣ�۶������ڲ�����Ӣ����Ϣ����
        Weapon weapon1 = new Weapon("�޾�֮��");
        Hero heroTwo = new Hero("���罣��",31,weapon1);

        heroTwo.method();



    }

}
