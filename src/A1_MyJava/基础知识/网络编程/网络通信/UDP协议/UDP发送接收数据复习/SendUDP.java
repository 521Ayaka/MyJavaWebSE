package A1_MyJava.����֪ʶ.������.����ͨ��.UDPЭ��.UDP���ͽ������ݸ�ϰ;

/*
    UDP����
*/

import java.io.*;
import java.net.*;


public class SendUDP {

    public static void main(String[] args){


        //¼����Ҫ���͵�����
        try (   //��װ����¼�빦��
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //����DatagramSocket����
                DatagramSocket ds = new DatagramSocket();
            ) {
            //����
            String data;
            while ((data = br.readLine()) != null){

                //�������ݱ��� DatagramPacket()����
                DatagramPacket dp = new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getByName("GanGaJiang"),10086);

                //�������ݱ���
                ds.send(dp);

                if ( "end".equals(data) ){
                    System.out.println("�ѹرշ��Ͷˡ�");
                    return;
                }

            }

            //�ͷ���Դ ��try()���Ѿ����

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
