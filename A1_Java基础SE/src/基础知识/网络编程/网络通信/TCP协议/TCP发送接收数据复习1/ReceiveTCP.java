package 基础知识.网络编程.网络通信.TCP协议.TCP发送接收数据复习1;

/*
    服务器
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveTCP {

    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10002);

        try (
                //监听客户端连接, 返回一个Socket对象
                Socket s = ss.accept();
                //获取io流,读数据,封装成BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                //创建io流, 反馈用户信息
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        ) {

            //给用户链接反馈
            bwx.write("服务器接收到链接请求");
            bwx.newLine();
            bwx.flush();

            //读取客户端发送来的内容 并打印出来
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        ss.close();

    }

}
