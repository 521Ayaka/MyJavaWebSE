package ����֪ʶ.������.����ͨ��.TCPЭ��.A_TCPѧϰ;
/*
ServerSocket:
    �����ʵ���˷������׽��֡��������׽��ֵȴ�ͨ�������������������ݸ�����ִ��һЩ������Ȼ����ܽ�������ظ������ߡ�
*/


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
/*
    ������: ��������, ��������
*/

public class Test_ReceiveTCP {

    public static void main(String[] args) throws IOException {

        //��������˵�Socket����(ServerSocket)
        ServerSocket ss = new ServerSocket(/*�˿ں�*/10000);

        //�����ͻ�������, ����һ��Socket����
        // Socket accept() ���������ܵ����׽��ֵ����ӡ�
        Socket accept = ss.accept();

        //��ȡ������, ������, ����������ʾ�ڿ���̨
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);//��ȡ���� ��ȡ���ݳ���
        String datas = new String(bys, 0, len);//��ȡ�������ݣ��ַ�����
        System.out.println("���������յ�����:" + datas);


        //��������
        OutputStream os = accept.getOutputStream();
        os.write("���������յ�����".getBytes());
        //����io��д������[byte����] д�뷴����

        //�ͷ���Դ
        ss.close();

    }

}
