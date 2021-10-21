package A1_MyJava.����֪ʶ.������.����ͨ��.TCPЭ��.A_TCPѧϰ;
/*
    TCP�������ݵĲ���
        1:�����ͻ��˵�Socked����
        2:��ȡ�����, д����
        3:�ͷ���Դ


*/

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
/*

    �ͻ���: ��������, ���շ���������

*/

public class Test_SendTCP {

    public static void main(String[] args) throws IOException {

        //1:�����ͻ��˵�Socked����
        //  Socket(InetAddress address, int port) �������׽��ֲ��������ӵ�ָ��IP��ַ��ָ���˿ںš�
        Socket sk = new Socket(InetAddress.getByName("GanGaJiang"), 10000);

        //2:��ȡ�����, д����
        //  OutputStream getOutputStream() B���ش��׽��ֵ��������
        OutputStream os = sk.getOutputStream();
        os.write("���������".getBytes());

        //2.5: ���շ���������
        InputStream is = sk.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("�ͻ���:" + data);


        //3:�ͷ���Դ
        //os.close();  //����������Ҫ�ͷ���Դ����Ϊos/is �����Ǹ���sk��ȡ�� sk�ͷ���Դ ������Ҳ���ͷ���Դ��
        //is.close();  //����������Ҫ�ͷ���Դ����Ϊos/is �����Ǹ���sk��ȡ�� sk�ͷ���Դ ������Ҳ���ͷ���Դ��
        sk.close();

        /*���н��:
            Exception in thread "main" java.net.ConnectException: Connection refused: connect
          ���򱨴� ������:ConnectException
                         --ָʾ���Խ��׽������ӵ�Զ�̵�ַ�Ͷ˿�ʱ��������ͨ�������ӱ�Զ�ܾ̾������磬û�н������ڼ���Զ�̵�ַ/�˿ڣ���

          ԭ��TCP���������ֵ� ����ʧ�� ��û�������նˣ�
        */

    }

}
