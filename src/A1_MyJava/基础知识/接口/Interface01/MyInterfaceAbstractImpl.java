package A1_MyJava.����֪ʶ.�ӿ�.Interface01;

//��ʵ���ࡱ ����һ���� �ӿ���+Impl  //I��д��i lСд��l


//����ʹ��ALT+�س������ٸ�����д���󷽷�
public class MyInterfaceAbstractImpl implements MyInterfaceAbstract{


    //������д
    @Override
    public void methodAbs1(){
        System.out.println("methodAbs1������");
    }

    @Override
    public int methodAbs2(int x){
        System.out.println("methodAbs2������");
        return x;
    }

    @Override
    public void methodAbs3(){
        System.out.println("methodAbs3������");
    }

    @Override
    public boolean methodAbs4(double y){
        System.out.println("methodAbs4������");
        return true;
    }


}
