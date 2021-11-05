package 基础知识.网络编程.网络通信.TCP协议.TCP发送接收数据复习2;

/*
    服务器
        这次服务器将接受到的数据 写成一个文本

*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveTCP {

    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(10001);

        try (
                //监听客户端连接, 返回一个Socket对象
                Socket s = ss.accept();
                //获取io流,读数据,封装成BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                //创建io流,将读取到的数据写入成 新文件
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A1_Java基础SE\\src\\基础知识\\网络编程\\网络通信\\TCP协议\\TCP发送接收数据复习2\\接收文件.txt")));

                //创建io流, 反馈用户信息
                /*OutputStream os = s.getOutputStream();*/
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        ) {

            //读取客户端发送来的内容
            String line;
            while ((line = br.readLine()) != null) {
                /*//自定义结束标语
                if ("!@#$%end".equals(line)) {
                    break;
                }*/
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //给用户链接反馈
            bwx.write("文件上传成功");
            bwx.newLine();
            bwx.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

        ss.close();

    }

}
