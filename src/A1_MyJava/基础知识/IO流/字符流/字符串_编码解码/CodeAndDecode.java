package A1_MyJava.基础知识.IO流.字符流.字符串_编码解码;
/*
编码: [String类 中的 静态方法]

    byte[] getBytes(): 使用平台默认字符集将该String编码为一系列字节，将结果存储到新的字节组中
    byte[] getBytes(String charsetName): 通过指定的字符集编码...

解码: [String类 中的 构造方法]

    String(byte[] bytes): 通过使用平台的默认字符集解码指定的字节数组来构造新的String
    String(byte[] bytes,String charsetName): 通过指定的字符集解码...

注意:
    1.这里当然用的IDEA平台来编写代码了！IDEAYYDS
    2.不管是编码还是解码，规定 编码解码格式 的操作，都要进行异常处理
      异常类: UnsupportedEncodingException

*/


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CodeAndDecode {

    public static void main(String[] args) {

        /**编码  String(byte[] bytes): 通过使用平台的默认字符集解码指定的字节数组来构造新的String*/
        String str1 = "中国汉字";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));
        //文件是GBK,IDEA就用当前文件的编码格式:
        //[-42, -48, -71, -6, -70, -70, -41, -42]

        System.out.println("===============================");

        /**编码  String(byte[] bytes,String charsetName): 通过指定的字符集解码...*/
        String str2 = "中国汉字";
        try {//需要异常处理，这里我用的是try...catch...异常环绕
            byte[] utf8s = str2.getBytes("UTF8");//指定UTF8进行编码
            System.out.println(Arrays.toString(utf8s));
            //UTF8汉字是三个字节:
            //[-28, -72, -83, -27, -101, -67, -26, -79, -119, -27, -83, -105]
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("===============================");
        System.out.println("===============================");

        /**解码  String(byte[] bytes): 通过使用平台的默认字符集解码指定的字节数组来构造新的String*/
        byte [] bytes2 = {-42, -48, -71, -6, -70, -70, -41, -42};
        System.out.println(new String(bytes2));
        //默认IDEA解码，当前文件是GBK,那么IDEA也用GBK
        //输出结果：中国汉字

        System.out.println("===============================");

        /**解码  String(byte[] bytes,String charsetName): 通过指定的字符集解码...*/
        byte [] bytes3 = {-28, -72, -83, -27, -101, -67, -26, -79, -119, -27, -83, -105};
        try {//依然需要异常处理，这里我用的是try...catch...异常环绕
            System.out.println(new String(bytes3,"UTF8"));
            //输出结果是：中国汉字
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("===============================");
        System.out.println("===============================");

        /* GBK解码出的byte数组,使用UTF8进行解码 */
        try {//别忘了异常处理
            System.out.println(new String(bytes2,"UTF8"));
            //运行结果: ?й?????
            //编码肯定会出现错误！
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }

}
