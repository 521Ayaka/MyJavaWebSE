package ����֪ʶ.������.����ͨ��.TCPЭ��.TCPͨ�ŷ���˿ڶ��߳�;
/*
    ��������
        ʱ�̽����û���Ϣ
        ���߳�
*/


import java.io.IOException;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    private static int id = 1;
    public static void main(String[] args) throws IOException {

        //������������Socket����
        ServerSocket ss = new ServerSocket(10086);

        //������ʱ�̿���
        while (true){
            //�����û����� Socket����
            Thread t = new Thread(new MyServerReceive(ss.accept()),("�û�"+id));
            t.start();//�����߳�
            id ++;
        }

        //�ͷ���Դ
        //ss.close();

    }

}
