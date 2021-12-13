package A1_JDBC��������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC01 {


    //ͨ��Java���� [��ϵ�����ݿ�] mysql �Ĳ���
    public static void main(String[] args) throws Exception {

        //1: ע������
        Class.forName("com.mysql.jdbc.Driver"); //jar5�� ����ʡ������

        //2: ��ȡ����
        String url = "jdbc:mysql://172.20.48.100/testsql";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //��ȡConnection����

        //3. ����sql���
        String sql = "update student set math = 100 where id = 8"; //sql���÷ֺ�

        //4. ��ȡִ��sql�Ķ��� Statement
        Statement stmt = conn.createStatement();

        //5. ִ��sql
        int count = stmt.executeUpdate(sql); //ִ��sql ����ֵ�� ��Ӱ�������

        //6. ������
        System.out.println(count);

        //7. �ͷ���Դ
        //stmt��������conn����õ���, �������ͷ�stmt����
        stmt.close();
        conn.close();

    }
    /*
    Host is not allowed to connect to this MySQL server�������

    ִ��use mysql;
    ִ��update user set host = '%' where user = 'root';��һ��ִ������ܻᱨ�����ù�����
    ִ��FLUSH PRIVILEGES;

    */

}
