package A1_MyJava.����֪ʶ.���.SystemLei;

/*
java.lang.System     ��̬����

System��lang�����в��õ����� ������Ϊ��̬������ֱ��ʹ��
*/
public class SystemLei {

    public static void main(String[] args) {

        //public static void exit(){...}   //��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ

        //public static lang currentTimeMillis(){...}
        // �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣ע�⣬������ֵ��ʱ�䵥λ�Ǻ���ʱ��ֵ������ȡ���ڵײ����ϵͳ���������ȿ��ܸ������磬������ϵͳ�Լ�ʮ����Ϊ��λ����ʱ�䡣
        // ��ǰʱ����Э������ʱ 1970 �� 1 �� 1 ����ҹ֮���ʱ���Ժ���Ϊ��λ��������

        System.out.println("===========================================================================================");

        //public static long currentTimeMillis(){...}
        // �����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣ע�⣬������ֵ��ʱ�䵥λ�Ǻ���ʱ��ֵ������ȡ���ڵײ����ϵͳ���������ȿ��ܸ������磬������ϵͳ�Լ�ʮ����Ϊ��λ����ʱ�䡣
        // ��ǰʱ����Э������ʱ 1970 �� 1 �� 1 ����ҹ֮���ʱ���Ժ���Ϊ��λ��������

        System.out.println(System.currentTimeMillis());
        System.out.println("������");
        System.out.println(System.currentTimeMillis() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "��"); //��ݼ�ctrl+alt+l     * 1.0Ϊ�˸���ȷ
        System.out.println("��֤��" + (2021 - 1970));
        long a = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            System.out.print(i+"  ");
        }   System.out.println();

        long b = System.currentTimeMillis();
        System.out.println("����ʱ��" + ( (b - a) / 1000) + "��"); // ����ʱ��13��

        //public static void exit(){...}   //��ֹ��ǰ�������е� Java ���������������״̬�룻���ݹ������� 0 ��״̬���ʾ�쳣��ֹ
        System.exit(0);
        System.out.println("����");
    }

}
