package A1_MyJava.����֪ʶ.����.���ͽӿ�;

public class Generic_Run {

    public static void main(String[] args) {

        Generic_InterfaceImpl<String> gen1 = new Generic_InterfaceImpl<>();
        gen1.method("����");

        Generic_InterfaceImpl<Integer> gen2 = new Generic_InterfaceImpl<Integer>();
        gen2.method(9);

        Generic_Interface<String> gen3= new Generic_Interface<String>(){
            @Override
            public void method(String s) {
                System.out.println(s);
            }
        };
        gen3.method("�����ڲ���");
    }

}
