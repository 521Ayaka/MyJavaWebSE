package 基础知识.基础.final关键字.final关键字;
/*
4: 对于成员变量来说，使用final关键字进行修饰，那么这个变量照样不可改变。

1. 由于成员变量有默认值，所以用了final关键字之后必须手动赋值，不会再给默认值。
2. 对于final修饰的成员变量，要么使用直接赋值，要么通过构造方法进行赋值，二者选其一。
3. 使用构造方法进行赋值的时候，必须保证【所有】的重载构造方法，都最终对final的成员变量进行赋值。

*/
public class Fu {

    private final String name;

    public Fu() {
        name = "尴尬";
    }

    public Fu(String name) {
        this.name = name;
    }



    public String getName() {
        return name;
    }

//    public void setName(String str) {
//        this.name = str;
//    }

}
