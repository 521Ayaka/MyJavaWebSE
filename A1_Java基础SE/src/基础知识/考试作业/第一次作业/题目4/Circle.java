package ����֪ʶ.������ҵ.��һ����ҵ.��Ŀ4;
/*
�͵���ϰ��
�����Ͷ���Ϊ����׼�ࡿ

һ����׼������:

��Ա����˽�л�
GetSet�������ø���ȫ��

�вι��� �� �޲ι���

��Ҫ��ʱ����дtoString()���� ��equals()������û��ô��Ҫ��

*/
public class Circle implements Shape{

    //��Ա����˽�л� ʹ��GetSet��������
    private double S;
    private double Z;

    //�޲ι���
    public Circle() {
    }

    //�вι���
    public Circle(double s, double z) {
        S = s;
        Z = z;
    }

    //ʵ�ֽӿ�
    @Override
    public double MJ(double a, double b) {
        S = Math.pow(a,2) * Math.PI;
        return 0;
    }

    //ʵ�ֽӿ�
    @Override
    public double ZC(double a, double b) {
        Z = 2 * a * Math.PI;
        return 0;
    }

    //GetSet����
    public double getS() {
        return S;
    }

    public void setS(double s) {
        S = s;
    }

    public double getZ() {
        return Z;
    }

    public void setZ(double z) {
        Z = z;
    }
}
