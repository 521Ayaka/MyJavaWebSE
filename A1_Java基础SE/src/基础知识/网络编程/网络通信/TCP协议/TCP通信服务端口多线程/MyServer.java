package 基础知识.网络编程.网络通信.TCP协议.TCP通信服务端口多线程;
/*
    服务器端
        时刻接收用户信息
        多线程
*/


import java.io.IOException;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private static int id = 1;
    public static void main(String[] args) throws IOException {

        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(10086);

        //服务器时刻开着
        while (true){
            //监听用户链接 Socket对象
            Thread t = new Thread(new MyServerReceive(ss.accept()),("用户"+id));
            t.start();//启动线程
            id ++;
        }

        //释放资源
        //ss.close();

    }

}
