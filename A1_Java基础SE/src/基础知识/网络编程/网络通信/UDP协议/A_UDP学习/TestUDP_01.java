package ����֪ʶ.������.����ͨ��.UDPЭ��.A_UDPѧϰ;
/*
    UDP�������ݵĲ���
        1.�������Ͷ˵�Socket����(DatagramSocket)
        2.��������, �������ݴ��
        3.����DatagramSocket����ķ�����������
        4.�رշ��Ͷ�

*/

import java.io.IOException;
import java.net.*;

public class TestUDP_01 {

    public static void main(String[] args) throws IOException {


        //1.�������Ͷ˵�Socket����(DatagramSocket)
        //  ���췽����DatagramSocket() �������ݱ��׽��ֲ�����󶨵����������ϵ��κο��ö˿ڡ�
        DatagramSocket ds = new DatagramSocket();


        //2.��������, �������ݴ��
        //  DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //  �������ݱ���������������Ϊ length �İ����͵�ָ�������ϵ�ָ���˿ںš�
        byte[] buf = "gan,ga,jiang".getBytes();
        /*int length = buf.length;
        InetAddress address = InetAddress.getByName("192.168.46.201");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(buf,length,address,port);*/
        DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.94.201"),10086);


        //3.����DatagramSocket����ķ�����������
        //  send(DatagramPacket p) �Ӵ��׽��ַ������ݱ���
        ds.send(dp);//������ DatagramPacket


        //4.�رշ��Ͷ�
        //  close() �رմ����ݱ��׽��֡�
        ds.close();


    }

}
