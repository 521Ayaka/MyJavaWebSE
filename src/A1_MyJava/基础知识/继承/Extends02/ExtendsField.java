package A1_MyJava.����֪ʶ.�̳�.Extends02;
/**

�ڸ�����ļ̳й�ϵ���У������Ա�����������򴴽��������ʱ�����������ַ�ʽ��

ֱ��ͨ�����������ʳ�Ա������
    �Ⱥ������˭����������˭��û���������ҡ�

���ͨ����Ա�������ʳ�Ա������
    �÷�������˭����������˭��û���������ҡ�

 */
public class ExtendsField {

    public ExtendsField() {
    }

    public static void main(String[] args) {
        Fu fu = new Fu();//�����������
        System.out.println(fu.numFu);//ֻ��ʹ�ø���Ķ�����û���κ��������� //10

        Zi zi = new Zi();//�����������
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20

        System.out.println("======================");

        System.out.println(zi.num);
        System.out.println(fu.num);

        System.out.println("=======================");
        // �Ⱥ������˭����������˭
        zi.methodZi();
        // ����������ڸ��൱�ж���ģ�����Ҳû�У������ø����methodFu()������
        zi.methodFu();
    }
}