package A1_MyJava.����֪ʶ.�ӿ�.interface07;
/*
��ʹ�ýӿ�ʱҪע�⣺

1. �ӿ�ʱ�����о�̬�������߹��췽���ġ�
2. һ�����ֱ�Ӹ���ֻ����һ��������һ������� ��ʵ�֡� ����ӿڡ�
��ʽ:
     public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
        //���븲����д��ʵ�ֵ����нӿڵ����г��󷽷����������ʱ��������classǰ�����abstract�ؼ��֡�
     }

3. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ��ĳ��󷽷�����ôֻ��Ҫ������дһ�μ��ɡ�
4. ���ʵ������ʵ�ֵĶ���ӿڵ��У�û�и�����д���еĳ��󷽷��������ͱ���ʱ���󷽷�����2��
5. ���ʵ������ʵ�ֵĶ���ӿڵ��У������ظ���Ĭ�Ϸ�������ôʵ����һ��������д��ͻ��Ĭ�Ϸ�����
6. һ�������ֱ�Ӹ��൱�еķ������ͽӿڵ��е�Ĭ�Ϸ��������˳�ͻ�������ø��൱�еķ�����
*/

public class Interface {

    public static void main(String[] args) {

        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodA();
        impl.methodB();
        impl.method();
        impl.methodDefault();
        System.out.println("==========");
        impl.methodGanGa();
    }

}
