package ����֪ʶ.�̳�.Extends03;
/**

 �ֲ�������         ֱ��д��Ա������
 ����ĳ�Ա������    this.��Ա������
 ����ĳ�Ա������    super.��Ա������

 */
public class Zi extends Fu {

    int num = 20;

    public void method() {
        int num = 30;
        System.out.println(num);       //���ʱ������ľֲ�����
        System.out.println(this.num);  //���ʱ���ĳ�Ա����
        System.out.println(super.num); //���ʸ���ĳ�Ա����
    }

}
