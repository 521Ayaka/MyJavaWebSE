package ����֪ʶ.����.�������1;

//���г�Ա    //����
public class User {

    //ʹ��private���γ�Ա�������������GetSet�������õȣ���߰�ȫ�ԡ�
    private String name;
    private double money;
    private double max;

    //���췽��
    public User() {
    }

    public User(String name, double money) {
        this.name = name;
        this.money = money;
    }

    //��Ա��������ӡ�û���Ϣ��
    public void show() {
        System.out.println("�ҽУ�" + this.name + "���ҵ����Ϊ��" + this.money);
    }

    //ʹ������GetSet������߰�ȫ��
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }
}
