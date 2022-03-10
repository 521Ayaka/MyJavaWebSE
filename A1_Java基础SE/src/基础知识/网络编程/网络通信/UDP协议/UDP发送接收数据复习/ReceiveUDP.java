package 基础知识.网络编程.网络通信.UDP协议.UDP发送接收数据复习;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveUDP {

    public static void main(String[] args) {

        //创建接收DatagramSocket(端口号)数据对象
        try (   DatagramSocket ds = new DatagramSocket(10086);
        ){
            //接收到的数据
            String dataString = null;
            while (true){

                //创建数据包 用于接收数据包 DatagramPacket(数据,数据长度);
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);

                //接收数据包
                ds.receive(dp);

                //解析数据包
                byte[] datas = dp.getData();//获取数据
                int len = dp.getLength();//获取数据长度
                dataString = new String(datas, 0, len);
                System.out.println(dataString);

                if ("end".equals(dataString)){
                    System.out.println("对方以关闭,接收端正在关闭");
                    for (int i = 0; i < 15; i++) {
                        try {
                            Thread.sleep(100);
                            System.out.print(".");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("\n已关闭接收端。");

                    return;
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
