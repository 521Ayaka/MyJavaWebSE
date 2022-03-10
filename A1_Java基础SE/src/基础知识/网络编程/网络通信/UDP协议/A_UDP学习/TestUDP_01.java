package 基础知识.网络编程.网络通信.UDP协议.A_UDP学习;
/*
    UDP发送数据的步骤
        1.创建发送端的Socket对象(DatagramSocket)
        2.创建数据, 并把数据打包
        3.调用DatagramSocket对象的方法发送数据
        4.关闭发送端

*/

import java.io.IOException;
import java.net.*;

public class TestUDP_01 {

    public static void main(String[] args) throws IOException {


        //1.创建发送端的Socket对象(DatagramSocket)
        //  构造方法：DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口。
        DatagramSocket ds = new DatagramSocket();


        //2.创建数据, 并把数据打包
        //  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //  构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
        byte[] buf = "gan,ga,jiang".getBytes();
        /*int length = buf.length;
        InetAddress address = InetAddress.getByName("192.168.46.201");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(buf,length,address,port);*/
        DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.94.201"),10086);


        //3.调用DatagramSocket对象的方法发送数据
        //  send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);//参数是 DatagramPacket


        //4.关闭发送端
        //  close() 关闭此数据报套接字。
        ds.close();


    }

}
