package A1_MyJava.����֪ʶ.�ӿ�.Interface01;
/*

��Java�κΰ汾���ж��ܶ�����󷽷���
��ʽ��
public abstract ����ֵ���� ��������(�����б�);   //û�з����壡����

ע�����
1. �ӿڵ��еĳ��󷽷����η������������̶����η��ţ�public abstract ���㲻д����public abstract

2. ���������η�����ѡ���Ե�ʡ�ԣ��������ѧ������ѡʡ�ԣ�

3. ��������Ҫ�����Ը�����Ҫ����ѡ��

ע�����
��ʵ���ࡱ ���û��ȫ��������д�ӿڵ��е����г��󷽷���
��ô��� ��ʵ���ࡱ �ͱ����Ǹ������࣬abstract��

*/

//����һ���ӿ�
public interface MyInterfaceAbstract {

    //�������󷽷���
    public abstract void methodAbs1();  //1. public abstract�ǻ�ɫ��,���㲻д����public abstract


    /*
    private abstract void methods();  //����д�������η�������private��
    */


    //��Ҳ�ǳ��󷽷�
    abstract int methodAbs2(int x);

    //��Ҳ�ǳ��󷽷�
    public void methodAbs3();           //2. ���������η�����ѡ���Ե�ʡ�ԣ��������ѧ������ѡʡ�ԣ�

    //��Ҳ�ǳ��󷽷�
    boolean methodAbs4(double total);   //3. ��������Ҫ�����Ը�����Ҫ����ѡ��




}
