package ����֪ʶ.�ڲ���.InnerClass02;
/*


*/
public class Wai {

    public void methodOuterOne(){

        class InnerOne {
            String str = "�ֲ��ڲ����Ա����";
            void method(){
                System.out.println("�ֲ��ڲ���ĳ�Ա����");
            }
        }

        InnerOne innerOne = new InnerOne();
        System.out.println(innerOne.str);
        innerOne.method();
    }
    public void methodOutTwo(){
        int num = 666; //final���Բ�д�����Ǳ��뱣֤����ֵ���ٸı�
        //num = 555; //������¸�ֵ���Ͳ���final
        final int age = 18;
        class InnerTwo{
            public void method(){
                System.out.println(num);
                System.out.println(age);
            }
        }
    }



}
