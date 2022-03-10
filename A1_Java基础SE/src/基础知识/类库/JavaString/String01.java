package 基础知识.类库.JavaString;
/*
字符串的特点：
1.字符串的内容永不可变。【重点】
2.正因为字符串的内容不可以变，所以字符串是可以共享使用的。
3.字符串效果上相当于char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的3+1种方式：
三种构造方法：
public String() 创建一个空白字符串，不含用任何内容。
public String(char[] array) 根据字符数组内容，创建对应的字符串。
public String(byte[] array) 根据字节数组内容，创建对应的字符串。
一种直接创建：
String str = "Hello Java";

注意：直接写上双引号，就是字符串对象
*/

public class String01 {
    public static void main(String[] args) {
        //使用空参数构成方法
        String str01 = new String();
        System.out.println("第一种构造方法："+str01);

        //使用char[] 字符数组为参数，构造方法
        char[] chararray= {'A','B','C'};
        String str02 = new String(chararray);     //重点注意 参数格式！！！！！！！！！！
        System.out.println("第二种构造方法：" + str02);

        //使用byte[] 字节数组为参数，构造方法
        byte[] bytearray ={97,98,99};
        String str03 = new String(bytearray);
        System.out.println("第三种构造方法："+ str03);

        //使用直接创建
        String str04 = "Hello Java";
        System.out.println("使用直接创建："+ str04);

    }
}