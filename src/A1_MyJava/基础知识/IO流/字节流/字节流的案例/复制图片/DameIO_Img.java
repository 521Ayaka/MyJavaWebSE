package A1_MyJava.����֪ʶ.IO��.�ֽ���.�ֽ����İ���.����ͼƬ;

//���ļ����Ƶ���ǰ�ļ���


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DameIO_Img {

    public static void main(String[] args) {

        //�����ֽ��������������
        FileInputStream input = null;
        FileOutputStream output = null;

        //try...catch...finally ���в�����
        try {
            input = new FileInputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\����ͼƬ\\ͼƬ\\è���~.jpg");
            output = new FileOutputStream("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\�ֽ���\\�ֽ����İ���\\����ͼƬ\\è���~.jpg");

            //���Ʋ�����
            byte [] array = new byte[1024*8];
            int by;
            while ( (by = input.read(array)) != -1 ){
                output.write(array,0,by);//����������������ҲҪд
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (input != null){
                try{
                    input.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (output != null){
                try{
                    output.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }

}
