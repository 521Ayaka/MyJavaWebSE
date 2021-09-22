package A1_MyJava.����֪ʶ.IO��.��׼�쳣����;

/*
��������:

[����һ JDK7֮ǰ]��
    ʹ��finally��֤���ͷ���Դ,ͬʱ����Ҫ���׳��쳣,���ǲ���̫����

[������ JDK7֮��]:
    ��try()��������д���������ͬʱ��ֵ,�Զ��ͷ���Դ,����Ҫʹ��finally,����Ҫ�׳��쳣,���˴��룡YYDS!

[������ JDK9֮��]:
    �����洴�������󲢸�ֵ,��try()������ʹ�ô����õ�������,���������洴������,��������Ҫ�׳��쳣��

[����]:
    ʹ�÷������ȽϺõ�,���˴���,�������׳��쳣��

*/

import java.io.*;

public class HandleIOException {

    public static File fileYuan = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\��׼�쳣����\\Դ�ļ�.txt");
    public static File fileNewAppend = new File("src\\A1_MyJava\\����֪ʶ\\IO��\\��׼�쳣����");

    public static void main(String[] args) throws IOException/*��Դ��JDK9�������*/ {

        //������
        new HandleIOException().init();

    }

    //��ʼ��
    public void init() throws IOException/*��Դ��JDK9�������*/ {

        ioeJDK6();
        ioeJDK7();
        ioeJDK9();


    }

    //��JDK7֮ǰʹ�õ��쳣������
    public void ioeJDK6() {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk6\\" + fileYuan.getName());

        //��ʼ��������Դ
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(fileYuan));
            bw = new BufferedWriter(new FileWriter(fileNew));
            //��ʼ����
            String str1;//�ַ��������������з���readLend()!!!
            while ((str1 = br.readLine()) != null) {
                bw.write(str1);
                bw.newLine();//ʹ��newLine()����
                bw.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    //��JDK7֮��ʹ�õ��쳣������
    public void ioeJDK7() {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk7\\" + fileYuan.getName());
        /*
        try(����������){

        }catch (�쳣���� ������){
            �쳣�������;
        }
        */
        //��ʼ����
        try (//��try()�������� ���� �������� ����ֵ
             //���Զ��ͷ���Դ
             BufferedReader br = new BufferedReader(new FileReader(fileYuan));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));) {//��ʼ����
            String str2;
            while ((str2 = br.readLine()) != null) {
                bw.write(str2);
                bw.newLine();
                bw.flush();//ˢ����
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    //��JDK9֮��ʹ�õ��쳣������
    public void ioeJDK9() throws IOException /*��Ȼ��Ҫ�׳��쳣*/ {
        //��װĿ��·������
        File fileNew = new File(fileNewAppend, "\\IOEjdk9\\" + fileYuan.getName());

        //JDK9������� ��Ȼ��Ҫ�׳��쳣
        BufferedReader br = new BufferedReader(new FileReader(fileYuan));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileNew));

        try (br; bw;) {
            //��ʼ����
            String str3;
            while ((str3 = br.readLine()) != null) {
                bw.write(str3);
                bw.newLine();
                bw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
