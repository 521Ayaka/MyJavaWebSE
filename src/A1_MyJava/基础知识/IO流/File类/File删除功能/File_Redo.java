package A1_MyJava.����֪ʶ.IO��.File��.Fileɾ������;

//�ָ���ɾ�����ļ���Ŀ¼

import java.io.File;
import java.io.IOException;

public class File_Redo {

    public static void main(String[] args) throws IOException {

        //��ԭ��ɾ�����ļ���Ŀ¼
        System.out.println(new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\Fileɾ������\\�����ļ�\\�ļ�1.txt").createNewFile());
        System.out.println(new File("D:\\Դ����\\src\\A1_MyJava\\����֪ʶ\\IO��\\File��\\Fileɾ������\\�����ļ�\\Ŀ¼1").mkdir());

        //ɾ��������ӵ��ļ�
        new File("�����ļ�.txt").delete();
        new File("src\\����ģ���µ��ļ�.txt").delete();

    }

}
