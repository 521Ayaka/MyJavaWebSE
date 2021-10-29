package ����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Supplier�ӿ�;

import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ���е���
//        getString( () -> {
//            return "Supplier�ӿ�";
//        } );

        //Lambda���ʽ��д
        String str = getString(() -> "Supplier����ʽ�ӿ�");
        System.out.println(str);

        //Lambda���ʽ��ȡ
        Integer anInt = getInt(() -> 666);
        System.out.println(anInt);


    }

    //ʹ��Supplier�ӿ�, ��ȡһ���ַ���
    private static String getString(Supplier<String> sup){
        return sup.get(); //Supplier������һ��get()���� , ���ڷ��ط�������
    }

    //ʹ��Supplier�ӿ�, ��ȡһ��Integer
    private static Integer getInt(Supplier<Integer> sup){
        return sup.get(); //Supplier������һ��get()���� , ���ڷ��ط�������
    }

}
