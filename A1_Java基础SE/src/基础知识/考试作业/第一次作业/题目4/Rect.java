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
public class Rect implements Shape{
    private double S;
    private double Z;

    public Rect() {
    }

    public Rect(double s, double z) {
        S = s;
        Z = z;
    }

    //ʵ�ֽӿ�
    @Override
    public double MJ(double a, double b) {
        S = a * b;
        return 0;
    }
    //ʵ�ֽӿ�
    @Override
    public double ZC(double a, double b) {
        Z = ( a+b );
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
