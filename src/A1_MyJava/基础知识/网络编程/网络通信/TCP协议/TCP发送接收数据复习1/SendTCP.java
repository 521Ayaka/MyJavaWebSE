package A1_MyJava.基础知识.网络编程.网络通信.TCP协议.TCP发送接收数据复习1;

import java.io.*;
import java.net.Socket;

/*
    客户端:
*/
public class SendTCP {

    public static void main(String[] args) {


        try (   //创建客户端Socket对象
                Socket s = new Socket("GanGaJiang", 10002);
                //获取io对象,封装键盘录入
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //将s.getOutputStream()封装成 字符缓存输出流
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                //接收数据反馈 同样封装成BufferedReader
                BufferedReader brx = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {

            //接收服务器反馈
            System.out.println(brx.readLine());

            //发送内容======================
            String line;
            while ((line = br.readLine()) != null) {
                if ("886".equals(line)) {
                    break;
                }
                bw.write(line);
                bw.newLine();
                bw.flush();
            }


            //已自动释放资源。
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
