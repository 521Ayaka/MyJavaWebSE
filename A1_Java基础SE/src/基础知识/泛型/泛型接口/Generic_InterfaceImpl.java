package 基础知识.泛型.泛型接口;

public class Generic_InterfaceImpl<T> implements Generic_Interface<T>{

    @Override
    public void method(T t) {
        System.out.println(t);
    }

}
