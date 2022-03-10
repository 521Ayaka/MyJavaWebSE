package 基础知识.类库.JavaString;
/*
字符串的截取方法：
public String substring(int index) 截取从参数位置到字符串结尾的一个新字符串，返回新字符串，它是此字符串的一个子字符串。
public String substring(int begin, int end) begin是开始截取的索引值，end是结束截取的位置索引值。
重点注意：begin和end 都是索引值 且对应的区间是：[begin,end) begin是包括的，但是end是不包括的！！！！！！！！！！！！！！

*/
public class Substring {

    public static void main(String[] args) {

        String str = "爱你大爷三千，爱你大爷三千千";
        System.out.println("============================================");

        String str1 = str.substring(7);
        System.out.println(str1);

        System.out.println("=============================================");

        String str2 = str.substring(7,13);//注意：结束索引值 end:13 是不包括的啊
        System.out.println(str2);


        // 下面这种写法，字符串的内容仍然是没有改变的
        // 下面有两个字符串："Hello"，"Java"
        // strA当中保存的是地址值。
        // 本来地址值是Hello的0x666，
        // 后来地址值变成了Java的0x999
        String strA = "Hello";
        System.out.println(strA); // Hello
        strA = "Java";
        System.out.println(strA); // Java


    }

}
