package A1_MyJava.����֪ʶ.����.final�ؼ���.final03;
/*

3. ����final�ؼ������ξֲ�����:

һ��ʹ��final�ؼ������ξֲ���������ô���������ֵ���ܽ��иı䡣
��һ�θ�ֵ�������䡿

ע������:
���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı䡣
��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ���ɸı䡣

*/
public class Final {

    public static void main(String[] args) {

        final int num1 = 10;
        System.out.println(num1);
//        num1 = 20;  //����д��
//        System.out.println(num1);

        final int num2 = 20;
        System.out.println(num2);
//        num2 = 20; //����д��
//        System.out.println(num2);

        final int num3 ;
        num3 = 30;   //��ȷд����ֻҪ��֤��Ψһһ�θ�ֵ���ɣ������䡣
        System.out.println(num3);

        //���ڻ���������˵�����ɱ�˵���Ǳ������е����ݲ��ɸı䡣
        //��������������˵�����ɱ�˵���Ǳ������еĵ�ֵַ���ɸı䡣

        System.out.println("==============================================================================");

        Gan gan = new Gan("���ν�");
        System.out.println("//"+gan);         //MyJava.����֪ʶ.����.final�ؼ���.final03.           Gan@15aeb7ab   ��ֵַ
        System.out.println(gan.getName());
                                                                                             // ��ͬ
        gan = new Gan("���ε�");
        System.out.println("//"+gan);         //MyJava.����֪ʶ.����.final�ؼ���.final03.           Gan@7b23ec81   ��ֵַ
        System.out.println(gan.getName());

        System.out.println("=============================================================================");

        final Gan gan1 = new Gan("���ε�");
        System.out.println("//"+gan1);        //MyJava.����֪ʶ.����.final�ؼ���.final03.            Gan@6acbcfc0  ��ֵַ
        System.out.println(gan1.getName());

//      gan1 = new Gan("���ε�");                                                              //��ͬ
//      ����д�����������´��� �޸����ʹ��final��gan1�����ˡ�
        gan1.setName("���ε۵۵۵۵۵�");
        System.out.println(gan1.getName());
        System.out.println("//"+gan1);        //MyJava.����֪ʶ.����.final�ؼ���.final03.            Gan@6acbcfc0  ��ֵַ





    }

}