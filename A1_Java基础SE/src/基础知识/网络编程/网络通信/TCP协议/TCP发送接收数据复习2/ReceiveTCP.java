package ����֪ʶ.������.����ͨ��.TCPЭ��.TCP���ͽ������ݸ�ϰ2;

/*
    ������
        ��η����������ܵ������� д��һ���ı�

*/

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ReceiveTCP {

    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss = new ServerSocket(10001);

        try (
                //�����ͻ�������, ����һ��Socket����
                Socket s = ss.accept();
                //��ȡio��,������,��װ��BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

                //����io��,����ȡ��������д��� ���ļ�
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A1_Java����SE\\src\\����֪ʶ\\������\\����ͨ��\\TCPЭ��\\TCP���ͽ������ݸ�ϰ2\\�����ļ�.txt")));

                //����io��, �����û���Ϣ
                /*OutputStream os = s.getOutputStream();*/
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        ) {

            //��ȡ�ͻ��˷�����������
            String line;
            while ((line = br.readLine()) != null) {
                /*//�Զ����������
                if ("!@#$%end".equals(line)) {
                    break;
                }*/
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

            //���û����ӷ���
            bwx.write("�ļ��ϴ��ɹ�");
            bwx.newLine();
            bwx.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

        ss.close();

    }

}
