package ����֪ʶ.����.ForDoWhile;

/*
=========================
do-whileѭ���ṹ��׼��ʽ��

do{
    ѭ���壻
} while�������жϣ�;
=========================
���Ÿ�ʽ��

��ʼ�����;
do {
    ѭ�����;
    �������;
} while(�������)��
=========================
*/
public class XunHuan04 {
    public static void main(String[] args){
        for (int i = 1; i<=30; i++ ){
            System.out.println("ԭ��������������! ���Ϲ����ģ�" + i);
        }
        System.out.println("==================================================================");
    // ʹ��do-whlie���
        int x = 1;
        do {
            System.out.println("ԭ��������������! ���Ϲ����ģ�" + x);
            x++;
        } while ( x <= 30 );
    }
}
