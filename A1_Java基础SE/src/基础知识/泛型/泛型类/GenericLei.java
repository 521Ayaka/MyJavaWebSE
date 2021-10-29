package 基础知识.泛型.泛型类;
/*
泛型类的定义格式:

修饰符 class 类名称<类型>{

//...

}

*/
public class GenericLei<T> {

    private T t;

    public GenericLei() {
    }

    public GenericLei(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
