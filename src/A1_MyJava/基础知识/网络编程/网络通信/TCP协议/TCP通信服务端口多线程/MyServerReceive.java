package A1_MyJava.����֪ʶ.������.����ͨ��.TCPЭ��.TCPͨ�ŷ���˿ڶ��߳�;

import java.io.*;
import java.net.Socket;

public class MyServerReceive implements Runnable{
    //�û�����Socket
    private Socket s;

    public MyServerReceive(Socket s){
        this.s = s;
    }

    @Override
    public void run() {

        //��������   ʵ�ַ���
        try (   BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw =
                        new BufferedWriter(
                        new FileWriter(
                        new File("src\\A1_MyJava\\����֪ʶ\\������\\����ͨ��\\TCPЭ��\\TCPͨ�ŷ���˿ڶ��߳�\\�����������ļ�\\"
                                +Thread.currentThread().getName()+".txt")));
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                ){



            //�������� д�뵽�����ļ�����
            String data;
            while ( (data = br.readLine())!=null ){
                bw.write(data);
                bw.newLine();
                bw.flush();
            }
            System.out.println("���յ�:"+Thread.currentThread().getName()+"�û�,�ļ�copy�ɹ�");
            //�����û�����
            bwx.write("�ѽ��յ���������,�ļ��ϴ��ɹ���");
            bwx.newLine();
            bwx.flush();

        }catch(IOException e){
            e.printStackTrace();
        }


    }


}
