package �ع���ϰ;

public class Gp <T>{

    public void method(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {

        new Gp<String>().method("������");

        new Gp<Integer>().method(66666);

        System.out.println("============");

        new GpX().method("���ͷ����ĵ���");

    }


}
class GpX{

    public <T> void method(T t){
        System.out.println(t);
    }

}