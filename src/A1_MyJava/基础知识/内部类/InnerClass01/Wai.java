package A1_MyJava.����֪ʶ.�ڲ���.InnerClass01;

public class Wai {

    int num = 10; //�ⲿ��ĳ�Ա����
    private String str = "�ⲿ��ĳ�Ա����";

    public void methodWai(){
        System.out.println("�ⲿ��ĳ�Ա����");
    }

    public class Nei{
        public void methodNei(){
            System.out.println("�ڲ���ĳ�Ա����");

            System.out.println("======�����ǵ����ⲿ��======");

            System.out.println("�ڲ������"+str);  //�ڲ��������������ⲿ��Ķ���
            Wai.this.methodWai(); //�����ⲿ��ĳ�Ա������
        }
        String string = "�ڲ���ĳ�Ա����";
        int num = 20; //�ڲ���ĳ�Ա����
        public void methodNum(){
            int num = 30; //�ڲ���ľֲ�����
            System.out.println("�ڲ��ֲ�����:"+num);
            System.out.println("�ڲ���Ա����:"+this.num);
            System.out.println("�ⲿ��Ա����:"+Wai.this.num);
        }
    }

    public void method(){
      //System.out.println(string);//�޷�����
        System.out.println(new Nei().string);
        //�����ڣ�Ҫ�����������ʹ�����������������ڲ���
        new Nei().methodNei();
    }

    //ʹ���ڲ���:
    //==========================================================================================
    //1. ���ʹ���ڲ���
    public void method01(){
        Nei nei = new Nei();
        System.out.println("�������ڲ��ࣺ"+nei.string);
        System.out.print("��ӵ����ڲ��ࣺ");
        nei.methodNei();
    }

}
