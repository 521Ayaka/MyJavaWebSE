package 基础知识.类库.JavaString;

/*
String中常用与获取相关的方法有：

1.public int length()               获取字符串的长度。   注意：无参数！！！！..
2.public String concat(String str)  将当前字符串和参数字符串拼接成为新的字符串，并返回字符串。
3.public char charAt(int index)     获取指定索引位置的单个字符。（索引从零开始）。
3.public int indexOf(String str)    查找参数字符串在当前字符串中第一次出现的位置索引值，如果没有这返回值为-1。（索引从零开始）。


 */
public class StringGet {
    public static void main(String[] args) {

        //获取字符串长度
        int length = "gangajiangwansui".length();
        System.out.println("字符串长度为："+length);
        System.out.println("===========================");

        //连接字符串
        String str1 = "尴尬酱";
        String str2 = "万岁";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("===========================");

        //获取指定索引位置的单个字符
        String str4 = "永远爱你尴尬酱！";
        for (int i = 0; i < str4.length(); i++) {
            char charat = str4.charAt(i);
            System.out.println(charat);
        }
        System.out.println("============================");

        //查找参数字符串在当前字符串中第一次出现的位置索引值
        String str5 = "永远爱你尴尬酱！尴尬酱万岁！";
        int 尴尬酱 = str5.indexOf("尴尬酱");
        System.out.println("我的第一次位置是："+尴尬酱);


    }
}
