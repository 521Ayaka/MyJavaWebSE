package ����֪ʶ.�쳣.Throwable;
/*

public String getMessage(){...}     //����throwable����ϸ��Ϣ�ַ���  [����ֵ��String]
public String toSting(){...}        //���ش˿��׳��ļ������         [����ֵ��String]
public void printStackTrace(){...}  //���쳣�Ĵ�����Ϣ����ڿ���̨     [�޷���ֵ��ֱ�Ӵ�ӡ]

ֻҪ�������ϵ�Ķ���ʹ��Throwable�ĳ�Ա������

*/


public class ThrowableLei {

    public static void main(String[] args) {

        System.out.println("����ʼ");

        method1(); /** Index 3 out of bounds for length 3 */

        method2(); /** java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1 */

        method3(); /** java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
                       at MyJava.����֪ʶ.�쳣.Throwable.ThrowableLei.method3(ThrowableLei.java:51)
                       at MyJava.����֪ʶ.�쳣.Throwable.ThrowableLei.main(ThrowableLei.java:22)           */

        method4(); // JVM��������

        System.out.println("�������");
    }

    //��Ա����1
    //public String getMessage(){...}     //����throwable����ϸ��Ϣ�ַ���  [����ֵ��String]
    public static void method1(){

        try {
            int[] array = {0,1,2};
            System.out.println(array[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    //��Ա����2
    //public String toSting(){...}        //���ش˿��׳��ļ������         [����ֵ��String]
    public static void method2(){
        try {
            String[] str = {"�쳣��������ֵ"};
            System.out.println(str[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
    }

    //��Ա����3
    //public void printStackTrace(){...}  //���쳣�Ĵ�����Ϣ����ڿ���̨     [�޷���ֵ��ֱ�Ӵ�ӡ]
    public static void method3(){
        try {
            double[] num ={0.00};
            System.out.println(num[1]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
    }

    //JMV�������쳣��ʱ�򲻻�������У�����try...catch...�쳣����󣬻����¼������С�
    public static void method4(){
        System.out.println("JMV��������");
    }

}
