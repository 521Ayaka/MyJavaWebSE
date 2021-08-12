package A1_MyJava.基础知识.类库.JavaString;
/*
String字符串常量池：
程序当中直接写上的双引号的字符串，就在字符串常量池中。

对于基本类型来说：==是进行数值的比较。
对于引用类型来说：==是进行地址值的比较。


 */
public class String02 {
    public static void main(String[] args) {

        String str01 = "ABC";
        String str02 = "ABC";

        char [] chararray= {'A','B','C'};
        String str03 = new String(chararray);

        System.out.println(str01 == str02);  //true
        System.out.println(str01 == str03);  //false
        System.out.println(str02 == str03);  //false



    }
}
