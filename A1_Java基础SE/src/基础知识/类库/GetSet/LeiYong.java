package ����֪ʶ.���.GetSet;

public class LeiYong {
    public static void main(String[] args) {
        //���޲����Ĺ��췽��
        Lei lei1 = new Lei();
        lei1.setName("���ν�");
        lei1.setAge(18);
        lei1.setAihao("��LOL���η���ѧϰ��˯�����ô���");
        lei1.setLiubu(true);

        System.out.println("�ҽ�" + lei1.getName());
        System.out.println("�����Ѿ�" + lei1.getAge() + "����");
        System.out.println("�ҵİ����ǣ�" + lei1.getAaihao());
        System.out.println("����LOL��6�ģ�" + lei1.isLiubu() + "��!!!");
        System.out.println("========================================");

        //���в����Ĺ��췽��
        Lei lei2 = new Lei( "���ν�", 18, "��LOL���η���ѧϰ��˯�����ô���", true,666);
        System.out.println("�ҽ�" + lei2.getName());
        System.out.println("�����Ѿ�" + lei2.getAge() + "����");
        System.out.println("�ҵİ����ǣ�" + lei2.getAaihao());
        System.out.println("����LOL��6�ģ�" + lei2.isLiubu() + "��!!!");
        System.out.println("========================================");
        lei2.setAge(19);//��Ȼ�����ڷ����ڲ�ʹ��Getter/Settet������
        System.out.println("������ˣ��ҿ�" + lei2.getAge() + "��");
        System.out.println("========================================");
    }
}
