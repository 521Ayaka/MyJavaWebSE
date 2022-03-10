package 基础知识.网络编程.网络通信.TCP协议.TCP发送接收数据复习2;

import java.io.*;
import java.net.Socket;

/*
    客户端:
            客户端发文件

    使用用自动化结束标语 结束io读取数据
    socketObj.shutdownOutput();

*/
public class SendTCP {

    public static void main(String[] args) {


        try (   //创建客户端Socket对象
                Socket s = new Socket("GanGaJiang", 10001);
                //获取io对象,读取发送文件内容
                BufferedReader br = new BufferedReader(new FileReader(new File("A1_Java基础SE\\src\\基础知识\\网络编程\\网络通信\\TCP协议\\TCP发送接收数据复习2\\SendTCP.java")));
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
            //直接使用 该方法正常停止标语
            s.shutdownOutput();
            /*//自定义接收标语
            bw.write("!@#$%end");
            bw.newLine();//newLine不能少！!!
            bw.flush();*/


            //接收服务器反馈
            System.out.println(brx.readLine());

            //已自动释放资源。
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
