package ����֪ʶ.����.A�ӿ���Ϊ��������;

public class MyGame {

    public static void main(String[] args) {

        Hero hero = new Hero();
        hero.setName("��������-��ϣ");
        hero.setAge(18);

        //��������
        Weapon weapon = new Weapon("AK-47");
        //��������
        SkillImpl impl = new SkillImpl();

        //�������Ͳ���
        hero.setWeapon(weapon);
        hero.setSkill(impl);

        //����Ӣ��
        hero.method();

        System.out.println("==========================================================================================");

        //���д��

        //�����ڲ�����ʵ�ֽӿ�
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.print("���л����� / ������Բ����");
            }
        };
        //����Ӣ�۲�����Ӣ������
        Hero hero1 = new Hero("��˫����" , 3 , new Weapon("������") , skill);
        hero1.method();

        System.out.println("==========================================================================================");

        //�����
        hero1.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.print("��˫��ս");
            }
        });

        hero1.method();




    }

}
