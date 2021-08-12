package A1_MyJava.����֪ʶ.�ڲ���.InnerClass03;

/*
�������ڲ��ࡿ

����ӿڵ�ʵ����(�����Ǹ��������)ֻ��Ҫʹ��Ψһ��һ�Σ�
��ô��������¾Ϳ���ʡ�Ե�����Ķ��壬����Ϊʹ�á������ڲ��ࡿ��

�����ڲ���Ķ����ʽ��
�ӿ����� ������ = new �ӿ�����(){
     //������д���г��󷽷�
};   //�����ź����и�[;]������

[ע��]:
�Ը�ʽ[new �ӿ�����(){...}]���н�����
1. new����������Ķ���
2. �ӿ����ƾ��������ڲ�����Ҫʵ�ֵ��Ǹ��ӿ�
3. {...}����������ڲ�������ݡ�

[����]:
1. �����ڲ���,�ڡ��������󡿵�ʱ��ֻ��ʹ��Ψһһ�Ρ�
   ���ϣ����δ������󣬶����������һ���Ļ�����ô�ͱ���ʹ�õ������塱ʵ���ࡰ�ˡ�

2. ��������,�ڡ����÷�������ʱ��ֻ�ܵ���Ψһһ�Σ�
   ���ϣ��ͬһ�����󣬵��ö�η�������ô���������Ȣ�����֡�

3. �����ڲ�����ʡ���ˡ�ʵ����/�������ơ�����������������ʡ���ˡ��������ơ�
   [ǿ��]: �����ڲ��������������һ���£�����

*/
public class RunClass {

    public static void main(String[] args) {
        //��ͨ��������
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();

        //ʹ�ö�̬д��
        MyInterface obj = new MyInterfaceImpl();
        obj.methodA();


        //����ֱ�Ӵ����ӿڵĶ���
        //MyInterface two = new MyInterface(); //����д����

        MyInterface one = new MyInterface(){
            @Override
            public void methodA() {
                System.out.println("������д�ӿڵĳ��󷽷���111-A");
            }

            @Override
            public void methodB() {
                System.out.println("������д�ӿڵĳ��󷽷���222-B");
            }

        };
        one.methodA();

        MyInterfaceImpl t = new MyInterfaceImpl(){
            @Override
            public void methodA(){
                System.out.println("����Ҳ�ǡ�����");
            }
        };
        t.methodA();
        System.out.println("==================================================");

        //======================================================================

        Fu zi = new Fu(){
            @Override
            public void methodFu(){
                System.out.println("�����ڲ��࣬������д�󷽷�ִ�У�");
            }
            @Override
            public void method(){
                System.out.println("���������");
            }
        };
        zi.methodFu();
        zi.method();

        //========================================================================
        System.out.println("====================================================");
        System.out.println("====================================================");
        //========================================================================

        //[����]:

        //����ʹ��
        MyInterface objA = new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("������д�ӿڵĳ��󷽷���111-A");
            }

            @Override
            public void methodB() {
                System.out.println("������д�ӿڵĳ��󷽷���222-B");
            }
        };
        objA.methodA();
        objA.methodB();

        System.out.println("===================================");

        //ʹ�������ڲ��࣬����ʹ����������
        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("������д�ӿڵĳ��󷽷���111-A");
            }

            @Override
            public void methodB() {
                System.out.println("������д�ӿڵĳ��󷽷���222-B");
            }
        }.methodA();
        //��Ϊ��������ֻ��ʹ��һ�ε��÷���,�޷����õڶ���,����Ҫ����ʹ����������
        new MyInterface() {
            @Override
            public void methodA() {
                System.out.println("������д�ӿڵĳ��󷽷���111-A");
            }

            @Override
            public void methodB() {
                System.out.println("������д�ӿڵĳ��󷽷���222-B");
            }
        }.methodB();


    }


}
