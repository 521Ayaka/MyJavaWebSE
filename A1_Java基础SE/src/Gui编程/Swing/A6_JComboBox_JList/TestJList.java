package Gui���.Swing.A6_JComboBox_JList;

/*
Ӧ�ó�������ʾ��Ϣ��һ���Ƕ�̬����

*/

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class TestJList extends JFrame {

    public TestJList(String title){
        super(title);
    }

    public void init(){
        //��ʼ��
        Container container = this.getContentPane();
        this.setBounds(300,200,700,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setBackground(new Color(8, 241, 215));

        //�����б��
        //1.�������б�����
        String [] str = {"��������","�����Ȱ�","�������"};
        //2.�����б�����б��з������ݡ� ֱ�ӷ��빹�쵱�С�
        JList<String> jList = new JList<String>(str);
        //����.�������򼯺ϵ���������ݡ�
        Vector vector = new Vector();
        /*
        Ҳ���Դ���һ������
        Vector vector = new Vector();
        ���򼯺ϵ������Ԫ��
        vector.add();

        */

        //������
        container.add(jList);

        this.setVisible(true);

    }

    //����
    public static void main(String[] args) {
        new TestJList("�б��").init();
    }

}
