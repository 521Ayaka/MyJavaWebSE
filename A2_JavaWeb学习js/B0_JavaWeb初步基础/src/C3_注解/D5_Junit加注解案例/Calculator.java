package C3_ע��.D5_Junit��ע�ⰸ��;

/**
 * С������ļ�������
 */
public class Calculator {

    //�ӷ�
    @TestAnn
    public void add(){
        String str = null;
        str.equals("EDG_NB_�����ǹھ�");
        System.out.println("1 + 0 =" + (1 + 0));
    }


    //����
    @TestAnn
    public void sub(){
        System.out.println("1 - 0 =" + (1 - 0));
    }

    //�˷�
    @TestAnn
    public void mul(){
        System.out.println("1 * 0 =" + (1 * 0));
    }

    //����
    @TestAnn
    public void div(){
        System.out.println("1 / 0 =" + (1 / 0));
    }


    public void show(){
        System.out.println("����bug...");
    }

}