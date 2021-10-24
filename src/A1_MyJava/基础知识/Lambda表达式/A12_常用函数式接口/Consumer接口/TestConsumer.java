package A1_MyJava.����֪ʶ.Lambda���ʽ.A12_���ú���ʽ�ӿ�.Consumer�ӿ�;

import java.util.function.Consumer;

public class TestConsumer {

    public static void main(String[] args) {

        //ʹ��Lambda���ʽ
        setAccept( "Saber",(s)-> System.out.println(s) );
        //ʹ��Lambda ʹ�÷������� ��д��
        setAccept("GanGa",System.out::println);

        System.out.println("======================");

        //������ ����
        /*setAccept("���ν�",s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });*/
        setAccept("���ν�",(s) -> System.out.println(new StringBuilder(s).reverse().toString()) );

    }

    private static void setAccept(String name, Consumer<String> consumer){
        consumer.accept(name);
    }



}
