package ����֪ʶ.����.Method;

/*
��ĿҪ��
����һ�������������ж����������Ƿ���ͬ��
 */
public class Method03 {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20)); // false
        System.out.println(isSame(20, 20)); // true
    }

    /*
    ��Ҫ�أ�
    ����ֵ���ͣ�boolean
    �������ƣ�isSame
    �����б�int a, int b
     */
    public static boolean isSame(int a, int b) {
    
    //���������4�ַ�����д ��Ҳ���Ҵ���Method03��ԭ�򣡣���������������������������������������������������������������������������

    //=========================================

        /*boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }*/

    //===========================================

        // boolean same = a == b ? true : false;

    //===========================================

        // boolean same = a == b;

    //===========================================

        return a == b;
    
    //===========================================
    }
}