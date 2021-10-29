package ����֪ʶ.������.����ͨ��.TCPЭ��.TCP���ͽ������ݸ�ϰ1;

/*
    ������
*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveTCP {

    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss = new ServerSocket(10002);

        try (
                //�����ͻ�������, ����һ��Socket����
                Socket s = ss.accept();
                //��ȡio��,������,��װ��BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                //����io��, �����û���Ϣ, �޷���װ
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        ) {

            //���û����ӷ���
            bwx.write("���������յ���������");
            bwx.newLine();
            bwx.flush();

            //��ȡ�ͻ��˷����������� ����ӡ����
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        ss.close();

    }

}
