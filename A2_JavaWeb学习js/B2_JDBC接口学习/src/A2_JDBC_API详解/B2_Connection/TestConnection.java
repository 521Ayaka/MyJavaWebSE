package A2_JDBC_API���.B2_Connection;

import com.mysql.jdbc.exceptions.MySQLDataException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestConnection {

    //ͨ��Java���� [��ϵ�����ݿ�] mysql �Ĳ���
    public static void main(String[] args) throws Exception {

        //1: ע������
        //Class.forName("com.mysql.jdbc.Driver"); //jar5�� ����ʡ������         */

        //2: ��ȡ����
        String url = "jdbc:mysql:///testsql?false";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //��ȡConnection����

        //3. ����sql���
        String sql1 = "update student set math = 99 where id = 8"; //sql���÷ֺ�
        String sql2 = "update student set math = 101 where id = 7";

        //4. ��ȡִ��sql�Ķ��� Statement
        Statement stmt = conn.createStatement();

        /*
        */

        //ʹ���쳣����
        try {
            //��������
            conn.setAutoCommit(false);

            //5-1. ִ��sql
            int count1 = stmt.executeUpdate(sql1); //ִ��sql ����ֵ�� ��Ӱ�������
            //6-1. ������
            System.out.println(count1);

            //5-2. ִ��sql
            int count2 = stmt.executeUpdate(sql2); //ִ��sql ����ֵ�� ��Ӱ�������
            //6-2. ������
            System.out.println(count2);
            
            //�ύ����
            conn.commit();
        }catch(Exception e){
            //�����쳣 �ع�
            conn.rollback();
            //��ӡ�쳣����
            e.printStackTrace();
        }




        //7. �ͷ���Դ
        //stmt��������conn����õ���, �������ͷ�stmt����
        stmt.close();
        conn.close();

    }

}
