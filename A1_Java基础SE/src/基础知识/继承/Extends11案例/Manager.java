package ����֪ʶ.�̳�.Extends11����;

//����
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

//Ⱥ������   //����
public class Manager extends User {

    //Ⱥ���Ĳ�����Ϣ
    public Manager(String name, double money) {
        super(name, money); //���ø��๹�췽������ӡ������Ϣ��
    }

    //Ⱥ�����еķ��������
    public ArrayList<Double> send(double totalMoney, int count) {

        ArrayList<Double> redList = new ArrayList<>();

        //Ⱥ�������
        double leftMoney = this.getMoney();
        //�жϺ������Ƿ���ڵ�ǰ���
        if(totalMoney > leftMoney) {
            System.out.println("��ǰ���㣡");
            return redList;
        }

        //����Ⱥ��ʣ���Ǯ����super���е��ã�������GetSet�������У�setMoney(����)�ǽ��д��븸�����ݵģ�����
        super.setMoney(super.getMoney() - totalMoney);

        //�ֺ�� ����������
        Random r = new Random();

        //��������double num��ǰn-1���͵�Ǯ��yv-num��Ϊ�˼���ʣ�����Ǯ��
        double num = 0;
        double yv = totalMoney;
        //��װ���
        for (int i = 0; i < count; i++) {
            if(i == 0){
                num = r.nextInt((int)(totalMoney/2)); //��һ����Χ��totalMoney�İ롣���ٷ���
                totalMoney = totalMoney - num;
            }else if (i == count - 1){
                double x;
                double y = 0;
                for (int j = 0; j < redList.size(); j++) {
                    x = redList.get(j);
                    y = y + x;
                }
                num = yv - y;
            }else{
                num = r.nextInt((int) totalMoney);
                totalMoney = totalMoney - num;
            }
            redList.add(num); //�򼯺������Ԫ�ؽ�
        }
        //���д������飬��û��ûѧ���������ҵġ�
        Collections.shuffle(redList);

        //���ĺ��max��
        double max = redList.get(0);;
        for (int i = 0; i < redList.size(); i++) {
            if (redList.get(i) > max){
                max = redList.get(i);
            }
        }
        super.setMax(max); //ʹ��setMax()���ഫ��max

        return redList;  //���غ��
    }
}
