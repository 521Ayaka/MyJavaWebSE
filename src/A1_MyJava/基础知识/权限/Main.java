package A1_MyJava.����֪ʶ.Ȩ��;
/*
Java����������Ȩ�����η���

                     public    >     protected    >     (default)     >     private
ͬһ����                YES               YES               YES                 YES
ͬһ����                YES               YES               YES                 NO
��ͬ������               YES               YES               NO                  NO
��ͬ��������              YES               NO                NO                  NO
*/

//����
import A1_MyJava.����֪ʶ.Ȩ��.MyLei.MyLei;
import A1_MyJava.����֪ʶ.Ȩ��.MyLei.MyLeiGan;

public class Main extends MyLei{

    public static int num1 = 1;
    protected static int num2 = 2;
    /*(default)*/ static int num3 = 3;
    private static int num4 = 4;

    public static void main(String[] args) {

        //ͬһ����
        System.out.println("=======ͬһ����=======");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        method();

        //ͬһ����
        System.out.println("=======ͬһ����=======");
        MyClass myClass = new MyClass();
        System.out.println(myClass.num1);
        System.out.println(myClass.num2);
        System.out.println(myClass.num3);
//      System.out.println(myClass.num4);  //private��Ա���� �޷�����
//      myClass.method1();                 //private�������� �޷�����
        myClass.method2();//default

 /*
        //��ͬ������
        System.out.println(super.num1);
        System.out.println(super.num2);
        System.out.println(super.num3);
        System.out.println(super.num4);
        //��static main�����в��ɵ��ø���???
        //static���� ����ʹ��this��super
*/

        //��ͬ��������
        System.out.println("======��ͬ��������======");
        MyLeiGan gan = new MyLeiGan();
        System.out.println(gan.num1);
//      System.out.println(gan.num2);  //  protected��Ա����  ���ܵ���
//      System.out.println(gan.num3);  //  (default)��Ա����  ���ܵ���
//      System.out.println(gan.num4);  //  private  ��Ա����  ���ܵ���
        gan.method4();
//      gan.method3();                 //  ͬ����Ա����Ҳ���ܵ���
//      gan.method2();                 //  ͬ����Ա����Ҳ���ܵ���
//      gan.method1();                 //  ͬ����Ա����Ҳ���ܵ���


    }

    private static void method(){
        System.out.println("˽�з���");
    }

    void method0(){
        //��ͬ������
        System.out.println(super.num1);
        System.out.println(super.num2);
//      System.out.println(super.num3);  //(default) ���ܵ���
//      System.out.println(super.num4);  //private   ���ܵ���
    }

}