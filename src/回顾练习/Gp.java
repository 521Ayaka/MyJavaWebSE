package 回顾练习;

public class Gp <T>{

    public void method(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {

        new Gp<String>().method("尴尬了");

        new Gp<Integer>().method(66666);

        System.out.println("============");

        new GpX().method("泛型方法的调用");

    }


}
class GpX{

    public <T> void method(T t){
        System.out.println(t);
    }

}