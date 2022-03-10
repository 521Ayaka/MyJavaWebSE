package A4_Request_Study.Request04_中文解码;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/*

* URLEncoder.encode("要转码的字符串" , "要转码的数据的编码格式")
*
* URLDecoder.decode("要解码的字符串" , ”要转码后的数据编码格式“)
*
* 而Tomcat8之前的 解码的格式是ISO-8859-1与编码格式不同 导致乱码
* 但是数据的二进制是一样的 所以只需要进行 3 4步即可
*
*/

public class URLDame {

    public static void main(String[] args) throws UnsupportedEncodingException {

        //先定义一个中文字符串
        String username = "张三";

        //1. URL编码
        String encode = URLEncoder.encode(username, "utf-8"/*要数据的编码的格式*/);
        System.out.println("encode : " + encode);

        //2. URL解码
        String decode = URLDecoder.decode("尴尬","gbk"/*要解码的编码格式*/); //我的控制台gbk gbk无法输出 ISO-8859-1的乱码[全是问号] 用gbk演示了
        System.out.println("decode : " + decode);

        //3. 将decode乱码转换为字节
        byte[] bytes = decode.getBytes();
        for (byte by : bytes) {
            System.out.print(by + " ");
        }
        System.out.println();

        //4. 将bytes字节数组转为文字即可
        String s = new String(bytes, "utf-8");
        System.out.println("转解码相同编码后 :" + s);




    }

}
