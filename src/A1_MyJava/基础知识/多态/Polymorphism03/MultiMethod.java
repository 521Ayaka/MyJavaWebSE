package A1_MyJava.����֪ʶ.��̬.Polymorphism03;
/*

�ڶ�̬�Ĵ��뵱�У���Ա�����ķ��ʹ����ǣ�
     ��new��˭����������˭��û����������

�ھ�: ���뿴��ߣ����п��ұߡ� [��Ա��������]

*/
public class MultiMethod {

    public static void main(String[] args) {

        Fu obj = new Zi();

        obj.method();

        obj.methodFu();

        //���뿴��ߣ������Fu��Fu����û��methodZi()���������Ա��뱨��
//      obj.methodZi(); //����д�� ��̬�в�������������

    }

}
