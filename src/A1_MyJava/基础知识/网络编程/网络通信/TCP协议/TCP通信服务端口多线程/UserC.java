package A1_MyJava.����֪ʶ.������.����ͨ��.TCPЭ��.TCPͨ�ŷ���˿ڶ��߳�;
/*
 *
 * �û� C
 *
 * */

import java.io.*;
import java.net.Socket;

/*
    �ͻ���:
            �ͻ��˷��ļ�
*/
public class UserC {

    public static void main(String[] args) {


        try (   //�����ͻ���Socket����
                Socket s = new Socket("GanGaJiang", 10086);
                //��ȡio����,��ȡ�����ļ�����
                BufferedReader br = new BufferedReader(new FileReader(new File("src\\A1_MyJava\\����֪ʶ\\������\\����ͨ��\\TCPЭ��\\TCPͨ�ŷ���˿ڶ��߳�\\UserC.java")));
                //��s.getOutputStream()��װ�� �ַ����������
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                //�������ݷ��� ͬ����װ��BufferedReader
                BufferedReader brx = new BufferedReader(new InputStreamReader(s.getInputStream()))
        ) {


            //��������==================
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //ֹͣ����
            s.shutdownOutput();

            //���շ���������
            System.out.println(brx.readLine());

            //���Զ��ͷ���Դ��
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}