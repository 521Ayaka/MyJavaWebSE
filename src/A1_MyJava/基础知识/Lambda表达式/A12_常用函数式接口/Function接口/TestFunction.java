package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Function�ӿ�;

import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        convert("4399", (String s) -> {
            return Integer.parseInt(s);
        });
        //�Ż�
        convert("3213", s -> Integer.parseInt(s));
        //�ٴ��Ż� �෽������
        convert("6666", Integer::parseInt);

        System.out.println("===================================");

        convert(4567, i -> String.valueOf(i + 8));

        System.out.println("===================================");

        converts("8838", Integer::parseInt, s -> String.valueOf(s + 10));

    }

    //����һ������,��һ���ַ���תΪint����, �ڿ���̨���
    private static void convert(String s, Function<String, Integer> function) {
        int i = function.apply(s);
        //����ֻ�ǵ���applyת������
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println(i);
    }

    //����һ������,��һ��int���͵����ݼ���һ������֮��, תΪ�ַ����ڿ���̨���
    private static void convert(int i, Function<Integer, String> function) {
        String str = function.apply(i);
        //����ֻ�ǵ���applyת������
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println(str);
    }

    //����һ������,��һ���ַ���תΪint����, int���͵����ݼ���һ������֮����תΪ�ַ���, �ڿ���̨���
    private static void converts(String str, Function<String, Integer> e1, Function<Integer, String> e2) {
        int i = e1.apply(str);
        String newStr = e2.apply(i);
        //����ʵ��ʵ��Lambda���ʽ�����������ġ�
        System.out.println("newString:"+newStr);
    }


}
