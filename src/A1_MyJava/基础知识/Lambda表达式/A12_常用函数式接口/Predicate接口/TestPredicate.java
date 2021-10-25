package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Predicate�ӿ�;

import java.util.function.Predicate;
/*
    boolean	test(T t) �ڸ����Ĳ������������ν�ʡ�

    //�߼��ж� ��
    default Predicate<T> negate() ���ر�ʾ��ν�ʵ��߼��񶨵�ν�ʡ�

    //�߼��ж� ��
    default Predicate<T> and(Predicate<? super T> other)
          ����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��

    //�߼��ж� ��
    default Predicate<T> or(Predicate<? super T> other)
            ����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼���

*/

public class TestPredicate {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        boolean p1 = pre1("���������", (s) -> {
            return s.length() >= 6;
        });
        System.out.println(p1);//false

        //Lambda���ʽ ��д
        p1 = pre1("һ�㶼������", s -> s.length() >= 6);
        System.out.println(p1);//true

        //=======================================================

        boolean p2 = pre2("һ�㶼������", (s -> s.length() >= 6));
        System.out.println(p2);//false

        //=======================================================

        boolean p3 = pre3("һ�㶼������", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p3);//false

        //=======================================================

        boolean p4 = pre4("һ�㶼������", (s) -> s.length() < 4, s -> s.length() < 8);
        System.out.println(p4);//true

    }

    //Test �ڸ����Ĳ������������ν�ʡ�
    private static boolean pre1(String str, Predicate<String> e) {
        //boolean	test(T t) �ڸ����Ĳ������������ν�ʡ�
        return e.test(str);
    }

    //negate �߼���
    private static boolean pre2(String str, Predicate<String> e) {
        //return !e.test(str);
        //default Predicate<T> negate() ���ر�ʾ��ν�ʵ��߼��񶨵�ν�ʡ�
        return e.negate().test(str);
        //ʹ�÷��� ֻ�Ƿ� ��Ҫ����test �ȵ���negate negate�ٵ���test����
    }

    //and �߼���
    private static boolean pre3(String str, Predicate<String> e1, Predicate<String> e2) {
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��
        return e1.and(e2).test(str);
    }

    //or �߼���
    private static boolean pre4(String str,Predicate<String> e1,Predicate<String> e2){
        //boolean b1 = e1.test(str);
        //boolean b2 = e2.test(str);
        //return b1 && b2;

        //default Predicate<T> and(Predicate<? super T> other)
        //����һ����ϵ�ν�ʣ���ʾ��ν������һ��ν�ʵĶ�·�߼�AND��
        return e1.or(e2).test(str);
    }

}
