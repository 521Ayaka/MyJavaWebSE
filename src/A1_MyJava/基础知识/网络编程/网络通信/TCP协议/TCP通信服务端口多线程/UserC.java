package A1_MyJava.基础知识.网络编程.网络通信.TCP协议.TCP通信服务端口多线程;
/*
 *
 * 用户 C
 *
 * */

import java.io.*;
import java.net.Socket;

/*
    客户端:
            客户端发文件
*/
public class UserC {

    public static void main(String[] args) {


        try (   //创建客户端Socket对象
                Socket s = new Socket("GanGaJiang", 10086);
                //获取io对象,读取发送文件内容
                BufferedReader br = new BufferedReader(new FileReader(new File("src\\A1_MyJava\\基础知识\\网络编程\\网络通信\\TCP协议\\TCP通信服务端口多线程\\UserC.java")));
                //将s.getOutputStream()封装成 字符缓存输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                //接收数据反馈 同样封装成BufferedReader
                BufferedReader brx = new BufferedReader(new InputStreamReader(s.getInputStream()))
        ) {


            //发送内容==================
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //停止标语
            s.shutdownOutput();

            //接收服务器反馈
            System.out.println(brx.readLine());

            //已自动释放资源。
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}