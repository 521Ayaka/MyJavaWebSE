package A1_MyJava.����֪ʶ.������ҵ.��һ����ҵ.��Ŀ4;
/*
����Ͷ����Ϊһ���������!

����һ��������Ҫ��

���췽��˽�л����Ͳ��ܴ���������

��Ա������̬���������Ϳ���ͨ��һ����ֱ�ӵ��÷����ˣ�

*/
public class SquareGongJv extends Rect{

    //�����Ҷ���������������a=8ʱ��������ܳ���
    //���������Ū�㳣��������˵��Math��PI����
    public static double A8_T0_MJ = 64;
    public static double A8_T0_ZC = 32;

    //���췽��˽�л����޷���������
    private SquareGongJv() {
    }

    //ԭ�з���Ϊ�Ǿ�̬����̬�в��ܵ��÷Ǿ�̬������������ԭ�з���
    public static double MJ(double a){
        return Math.pow(a,2);
    }

    public static double ZC(double a){
        return 4*a;
    }


}
