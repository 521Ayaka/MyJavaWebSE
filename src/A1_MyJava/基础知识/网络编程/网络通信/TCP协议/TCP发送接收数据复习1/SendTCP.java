package A1_MyJava.����֪ʶ.������.����ͨ��.TCPЭ��.TCP���ͽ������ݸ�ϰ1;

import java.io.*;
import java.net.Socket;

/*
    �ͻ���:
*/
public class SendTCP {

    public static void main(String[] args) {


        try (   //�����ͻ���Socket����
                Socket s = new Socket("GanGaJiang", 10002);
                //��ȡio����,��װ����¼��
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                //��s.getOutputStream()��װ�� �ַ����������
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                //�������ݷ��� ͬ����װ��BufferedReader
                BufferedReader brx = new BufferedReader(new InputStreamReader(s.getInputStream()));
        ) {

            //���շ���������
            System.out.println(brx.readLine());

            //��������======================
            String line;
            while ((line = br.readLine()) != null) {
                if ("886".equals(line)) {
                    break;
                }
                bw.write(line);
                bw.newLine();
                bw.flush();
            }


            //���Զ��ͷ���Դ��
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
