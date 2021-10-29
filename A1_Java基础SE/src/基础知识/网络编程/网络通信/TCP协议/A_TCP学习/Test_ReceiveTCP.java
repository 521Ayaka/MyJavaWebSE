package 基础知识.网络编程.网络通信.TCP协议.A_TCP学习;
/*
ServerSocket:
    这个类实现了服务器套接字。服务器套接字等待通过网络进入的请求。它根据该请求执行一些操作，然后可能将结果返回给请求者。
*/


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
    服务器: 接收数据, 给出反馈
*/

public class Test_ReceiveTCP {

    public static void main(String[] args) throws IOException {

        //创建服务端的Socket对象(ServerSocket)
        ServerSocket ss = new ServerSocket(/*端口号*/10000);

        //监听客户端连接, 返回一个Socket对象
        // Socket accept() 侦听并接受到此套接字的连接。
        Socket accept = ss.accept();

        //获取输入流, 读数据, 并把数据显示在控制台
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);//读取数据 获取数据长度
        String datas = new String(bys, 0, len);//获取接收数据，字符串行
        System.out.println("服务器接收到数据:" + datas);


        //给出反馈
        OutputStream os = accept.getOutputStream();
        os.write("服务器接收到数据".getBytes());
        //就是io流写入数据[byte数组] 写入反馈。

        //释放资源
        ss.close();

    }

}
