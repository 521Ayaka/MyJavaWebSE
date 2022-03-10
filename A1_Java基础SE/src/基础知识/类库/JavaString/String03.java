package 基础知识.类库.JavaString;

/*
 ==是进行对象的地址值比较，如果确实是进行字符串进行比较，可以使用两个方法。

 public boolean equals(Object.obj)，参数可以说任意对象，只有参数是字符串并且内容相同的才会给true，否则返回false。

 注意事项：
 1.任何对象都能用Object接收。
 2.equals方法具有对称性，也就是a.equals(b) 和 b.equals(a) 效果一样。
 3.如果比较一个 常量 和一个 变量 ，推选把常量字符串放在前面。
   推选："ABC".equals(str);   不推选：str.equals("ABC");

 public boolean equalsIgnoreCase(String str)  不区分大小写的不叫    但要注意的是参数是String

*/
public class String03 {

    public static void main(String[] args) {

        String str1 = "ABC";
        String str2 = "ABC";

        char[] chararray = {'A','B','C'};
        String str3 = new String(chararray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("ABC"));
        System.out.println("ABC".equals(str3));
        System.out.println("abc".equals(str1));
        System.out.println("================================================");

        String str4 = "ABC";
        String str5 = "abc";
        System.out.println(str4.equals(str5));
        System.out.println(str4.equalsIgnoreCase(str5));


    }

}
