package A1_MyJava.����֪ʶ.��̬.Static01;
/*
 ע�����
 1. ��̬����ֱ�ӷ��ʷǾ�̬��
 ԭ����Ϊ���ڴ浱���ǡ��ȡ��еľ�̬���ݣ������еķǾ�̬���ݡ�
 �����˲�֪�����ˣ����Ǻ���֪�����ˡ���
 2. ��̬�������в�����this��
 ԭ��this����ǰ����ͨ��˭���õķ�����˭���ǵ�ǰ����

*/
public class MyClass {

    int num; // ��Ա����
    static int numStatic; // ��̬����


    // ��Ա����
    public void method() {
        System.out.println("����һ����Ա������");

        // ��Ա�������Է��ʳ�Ա����
        System.out.println(num);

        // ��Ա�������Է��ʾ�̬����
        System.out.println(numStatic);
    }


    // ��̬����
    public static void methodStatic() {
        System.out.println("����һ����̬������");
        // ��̬�������Է��ʾ�̬����
        System.out.println(numStatic);



/**     ��̬����ֱ�ӷ��ʷǾ�̬���ص㡿

        System.out.println(num); // ����д����

*/


/**     ��̬�����в���ʹ��this�ؼ��֡�

        System.out.println(this); // ����д����

 */

    }

}
