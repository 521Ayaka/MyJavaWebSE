package 基础知识.网络编程.网络通信.TCP协议.A_TCP学习;
/*
    TCP发送数据的步骤
        1:创建客户端的Socked对象
        2:获取输出流, 写数据
        3:释放资源


*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*

    客户端: 发送数据, 接收服务器反馈

*/

public class Test_SendTCP {

    public static void main(String[] args) throws IOException {

        //1:创建客户端的Socked对象
        //  Socket(InetAddress address, int port) 创建流套接字并将其连接到指定IP地址的指定端口号。
        Socket sk = new Socket(InetAddress.getByName("GanGaJiang"), 10000);

        //2:获取输出流, 写数据
        //  OutputStream getOutputStream() B返回此套接字的输出流。
        OutputStream os = sk.getOutputStream();
        os.write("这就尴尬了".getBytes());

        //2.5: 接收服务器反馈
        InputStream is = sk.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客户端:" + data);


        //3:释放资源
        //os.close();  //这两个不需要释放资源，因为os/is 对象是根据sk获取的 sk释放资源 这两个也会释放资源。
        //is.close();  //这两个不需要释放资源，因为os/is 对象是根据sk获取的 sk释放资源 这两个也会释放资源。
        sk.close();

        /*运行结果:
            Exception in thread "main" java.net.ConnectException: Connection refused: connect
          程序报错！ 报错类:ConnectException
                         --指示尝试将套接字连接到远程地址和端口时发生错误。通常，连接被远程拒绝（例如，没有进程正在监听远程地址/端口）。

          原因：TCP是三次握手的 握手失败 还没创建接收端！
        */

    }

}
