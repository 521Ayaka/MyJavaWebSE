package A1_MyJava.����֪ʶ.�̳�.Extends06;

public class Run {

    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.call();
        phone.send();
        phone.show();

        System.out.println("===================");

        NewPhone newphone = new NewPhone();

        newphone.call();
        newphone.send();
        newphone.show();
    }

}