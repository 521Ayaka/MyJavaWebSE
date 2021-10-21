package A1_MyJava.����֪ʶ.������.����ͨ��.UDPЭ��.A_UDPѧϰ;
/*
    UDP�������ݵĲ���
        1:�������Ͷ˵�Socket����(DatagramSocket)
        2:����һ�����ݰ�, ���ڽ�������
        3:����DatagramSocket����ķ�����������
        4:�������ݰ�, ���������ڿ���̨��ʾ
        5:�رշ��Ͷ�

*/

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class TestUDP_02 {

    public static void main(String[] args) throws IOException {


        //1:�������Ͷ˵�Socket����(DatagramSocket)
        //  ���췽��:DatagramSocket(int port)�������ݱ��׽��ֲ�����󶨵����������ϵ�ָ���˿ڡ�
        DatagramSocket ds = new DatagramSocket(10086);

        //2:����һ�����ݰ�, ���ڽ�������
        //  ���췽��:DatagramPacket(byte[] buf, int length)����һ�� DatagramPacket���ڽ��ճ��ȵ����ݰ� length ��
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);


        //3:����DatagramSocket����ķ�����������
        //  receive(DatagramPacket p)�Ӵ��׽��ֽ������ݱ�����
        ds.receive(dp);


        //4:�������ݰ�, ���������ڿ���̨��ʾ
        //  byte[] getData() �������ݻ�������
        //  int	getLength() ����Ҫ���͵����ݵĳ��Ȼ���յ������ݵĳ��ȡ�

        byte[] datas = dp.getData();
        int len = dp.getLength();
        String dataString = new String(datas,0,len);
        System.out.println(dataString);

        //��д
        System.out.println(new String(dp.getData(),0,dp.getLength()));


        //�رշ��Ͷ�
        ds.close();
    }

}
