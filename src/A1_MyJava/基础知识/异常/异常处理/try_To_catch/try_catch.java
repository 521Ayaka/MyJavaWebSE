package A1_MyJava.����֪ʶ.�쳣.�쳣����.try_To_catch;

/*
[��ʽ]:
      try{
           //���ܳ��ֵ��쳣�Ĵ���;
      } catch(�쳣���� ������){
           //�쳣�Ĵ������;
      }

[˵��]: �����try����Ĵ��뿪ʼִ��
       �����쳣�����Զ�����һ���쳣����󣬸��쳣���󽫱��ύ��java����ʱϵͳ
       ��Java����ʱϵͳ���յ��쳣����ʱ���ص�catch����ƥ����쳣�࣬�ҵ�������쳣�Ĵ���
       ִ�����֮�󣬳��򻹿��Լ�������ִ�С�

[����]: JVM��Ĭ�ϴ�����:
       ���������������⣬����û�����κδ�������JVM��Ĭ�ϵĴ���
       --���쳣�����ƣ��쳣��ԭ���쳣���ֵ�λ�õ���Ϣ������˿���̨
       --����ִֹͣ��

========================================================================================================================

Throwable�ĳ�Ա����:
public String getMessage(){...}     //����throwable����ϸ��Ϣ�ַ���
public String toSting(){...}        //���ش˿��׳��ļ������
public void printStackTrace(){...}  //���쳣�Ĵ�����Ϣ����ڿ���̨

 */
public class try_catch {

    public static void main(String[] args) {
        System.out.println("����ʼ����");
        System.out.println("=========");

        method();

        System.out.println("�����������");
        System.out.println("=========");
    }

    public static void method(){

        int [] array = { 0, 1, 2, 3, 4,5, 6};
        System.out.println(array[3]);
//      System.out.println(array[7]);   //�쳣��: ArrayIndexOutOfBoundsException
        try{
            System.out.println(array[7]);
        }catch(ArrayIndexOutOfBoundsException e){  //����ֱ��дException
            System.out.println("�������ֵԽ����");
            e.printStackTrace(); //���ö���ķ���
            e.toString();
        }

    }

}
