package 基础知识.网络编程.网络通信.UDP协议.UDP发送接收数据复习;

/*
    UDP发送
*/

import java.io.*;
import java.net.*;


public class SendUDP {

    public static void main(String[] args){


        //录入需要发送的数据
        try (   //封装键盘录入功能
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //创建DatagramSocket对象
                DatagramSocket ds = new DatagramSocket();
            ) {
            //数据
            String data;
            while ((data = br.readLine()) != null){

                //创建数据报包 DatagramPacket()对象
                DatagramPacket dp = new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getByName("GanGaJiang"),10086);

                //发送数据报包
                ds.send(dp);

                if ( "end".equals(data) ){
                    System.out.println("已关闭发送端。");
                    return;
                }

            }

            //释放资源 在try()中已经完成

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
