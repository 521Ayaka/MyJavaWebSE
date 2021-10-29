package ����֪ʶ.IO��.�ַ�������.�ַ����������з���;

import java.io.*;

/*

BufferedWriter:
    void newLine(): дһ���зָ���, �зָ����ַ�����ϵͳ���Զ���

BufferedReader:
    public String readLine(): ��һ�����֡���������е����ݵ��ַ���,�������κ�����ֹ�ַ�,
                              ������Ľ�β�Ѿ�����, ��Ϊnull

*/
public class BufferedRWProMethod {

    public static void main(String[] args) {

        newLineMethod();
        readLineMethod();

    }

    public static void newLineMethod() {

        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));
            //д������
            bw.write("���������");
            bw.newLine();
            bw.flush();//ˢ��
            bw.write("�G���һ����ˣ�");
            bw.newLine();
            bw.flush();//ˢ��
            bw.write("¬��ΰţ��,¬��ΰû�п��ң�");
            bw.newLine();
            bw.flush();//ˢ��
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    public static void readLineMethod() {

        BufferedReader br1 = null;
        BufferedReader br2 = null;
        try {
            br1 = new BufferedReader(new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));
            br2 = new BufferedReader(new FileReader("A1_Java����SE\\src\\����֪ʶ\\IO��\\�ַ�������\\�ַ����������з���\\�ļ�.txt"));

            //��ȡ��һ��
            System.out.println(br1.readLine());
            //��ȡ�ڶ���
            System.out.println(br1.readLine());
            //��ȡ������
            System.out.println(br1.readLine());
            //��ȡ������
            System.out.println(br1.readLine());//Ϊnull
            System.out.println("==============================");

            String str;
            while ((str = br2.readLine()) != null) {
                System.out.println(str);//�����Ҫ���е�println
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br1 != null) {
                try {
                    br1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br2 != null) {
                try {
                    br2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
