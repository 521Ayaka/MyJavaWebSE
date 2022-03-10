package 基础知识.网络编程.网络通信.UDP协议.A_UDP学习;
/*
    UDP发送数据的步骤
        1:创建发送端的Socket对象(DatagramSocket)
        2:创建一个数据包, 用于接收数据
        3:调用DatagramSocket对象的方法接收数据
        4:解析数据包, 并把数据在控制台显示
        5:关闭发送端

*/

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUDP_02 {

    public static void main(String[] args) throws IOException {


        //1:创建发送端的Socket对象(DatagramSocket)
        //  构造方法:DatagramSocket(int port)构造数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket ds = new DatagramSocket(10086);

        //2:创建一个数据包, 用于接收数据
        //  构造方法:DatagramPacket(byte[] buf, int length)构造一个 DatagramPacket用于接收长度的数据包 length 。
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);


        //3:调用DatagramSocket对象的方法接收数据
        //  receive(DatagramPacket p)从此套接字接收数据报包。
        ds.receive(dp);


        //4:解析数据包, 并把数据在控制台显示
        //  byte[] getData() 返回数据缓冲区。
        //  int	getLength() 返回要发送的数据的长度或接收到的数据的长度。

        byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println(dataString);

        //简写
        System.out.println(new String(dp.getData(),0,dp.getLength()));


        //关闭发送端
        ds.close();
    }

}
