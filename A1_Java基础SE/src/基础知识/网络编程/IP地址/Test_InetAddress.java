package ����֪ʶ.������.IP��ַ;
/*
1.4 InetAddress��ʹ��
Ϊ�˷������Ƕ�IP��ַ�Ļ�ȡ�Ͳ���,Java�ṩ��һ���� InetAddress������ʹ��

InetAddress:�����ʾ InternetЭ��(IP)��ַ

    static InetAddress getByName(String host) ȷ���������Ƶ�IP��ַ���������ƿ����ǻ�������,Ҳ������IP��ַ

    String getHostName()       ��ȡ��IP��ַ��������

    String getHostAddress()    �����ı���ʾ�е�P��ַ�ַ���

*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test_InetAddress {

    public static void main(String[] args) throws UnknownHostException {

        //static InetAddress getByName(String host)
        //ȷ���������Ƶ�IP��ַ���������ƿ����ǻ�������,Ҳ������IP��ַ
        //��Ҫ�쳣����
        InetAddress iaIP = InetAddress.getByName("GanGaJiang"/*" 192.168.46.201 "*/);//����������IP Ҳ������������

        //String getHostName()       ��ȡ��IP��ַ��������
        System.out.println("��������: " + iaIP.getHostName() + "\n");

        //String getHostAddress()    �����ı���ʾ�е�P��ַ�ַ���
        System.out.println("����IP��ַ: " + iaIP.getHostAddress());

    }

}
