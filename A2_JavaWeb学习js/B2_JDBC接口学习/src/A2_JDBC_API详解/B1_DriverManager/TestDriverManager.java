package A2_JDBC_API���.B1_DriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*  DriverManager���

package com.mysql.jdbc;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Driver extends NonRegisteringDriver implements java.sql.Driver {

    public Driver() throws SQLException {
    }

    static {
        try { //����������DriverManager.registerDriver()������ע������
            DriverManager.registerDriver(new Driver());
        } catch (SQLException var1) {
            throw new RuntimeException("Can't register driver!");
        }
    }
}

*/


public class TestDriverManager {

    //ͨ��Java���� [��ϵ�����ݿ�] mysql �Ĳ���
    public static void main(String[] args) throws Exception {

        //1: ע������
        //Class.forName("com.mysql.jdbc.Driver"); //jar5�� ����ʡ������
/*
        static {
            try { //����������DriverManager.registerDriver()������ע������
                DriverManager.registerDriver(new Driver());
            } catch (SQLException var1) {
                throw new RuntimeException("Can't register driver!");
            }
        }
                                                                     */


        //2: ��ȡ����
        /*
        * url��ʽ��
        *       jdbc:mysql:// ��Ҫ���ӵ�ip������ : �˿ں� / Ҫʹ�õ����ݿ����� ? ��ֵ��[�ɲ�д]
        *
        * mysql��Ĭ�϶˿���3306 �����Ĭ�϶˿� ����ʡ��
        *       jdbc:mysql:// ��Ҫ���ӵ�ip������ / Ҫʹ�õ����ݿ����� ? ��ֵ��[�ɲ�д]
        *
        * ������ӱ���Host��mysql ����Լ򻯲�дip�Ͷ˿ں�
        *       jdbc:mysql:/// Ҫʹ�õ����ݿ����� ? ��ֵ��[�ɲ�д]
        *
        * ʹ�ü�ֵ�� ȥ��SSL�ľ���
        *       useSSL = false
        *
        *
        * */
        String url = "jdbc:mysql:///testsql?useSSL=false";
        String user = "root";
        String password = "ganga";
        Connection conn = DriverManager.getConnection(url, user, password); //��ȡConnection����

        //3. ����sql���
        String sql = "update student set math = 99 where id = 8"; //sql���÷ֺ�

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

}
