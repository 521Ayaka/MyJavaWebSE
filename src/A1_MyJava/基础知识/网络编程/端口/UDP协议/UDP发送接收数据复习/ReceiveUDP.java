package A1_MyJava.����֪ʶ.������.�˿�.UDPЭ��.UDP���ͽ������ݸ�ϰ;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveUDP {

    public static void main(String[] args) {

        //��������DatagramSocket(�˿ں�)���ݶ���
        try (   DatagramSocket ds = new DatagramSocket(10086);
        ){
            //���յ�������
            String dataString = null;
            while (true){

                //�������ݰ� ���ڽ������ݰ� DatagramPacket(����,���ݳ���);
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);

                //�������ݰ�
                ds.receive(dp);

                //�������ݰ�
                byte[] datas = dp.getData();//��ȡ����
                int len = dp.getLength();//��ȡ���ݳ���
                dataString = new String(datas, 0, len);
                System.out.println(dataString);

                if ("end".equals(dataString)){
                    System.out.println("�Է��Թر�,���ն����ڹر�");
                    for (int i = 0; i < 15; i++) {
                        try {
                            Thread.sleep(100);
                            System.out.print(".");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("\n�ѹرս��նˡ�");

                    return;
                }
            }


        }catch (IOException e){
            e.printStackTrace();
        }


    }

}
