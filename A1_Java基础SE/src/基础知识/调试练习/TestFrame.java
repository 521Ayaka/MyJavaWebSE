package ����֪ʶ.������ϰ;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {

    public TestFrame(String title) {
        this.setTitle(title);
    }

    public static void main(String[] args) {
        new TestFrame("������").init();
    }

    //��ʼ��
    public void init() {
        ImageIcon icon = new ImageIcon("src\\MyImg\\A11.jpg");

        this.setBounds(300, 200,icon.getIconWidth(),icon.getIconHeight()-400);
        this.setResizable(false);
        //

        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon);
        jLabel.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());

        this.getLayeredPane().add(jLabel, new Integer(Integer.MIN_VALUE));

        JPanel jp = (JPanel) this.getContentPane();
        jp.setOpaque(false);


        //

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(9, 236, 236));

        //������
        JComboBox box = new JComboBox();
        box.addItem("��ѡ��");
        box.addItem("����");
        box.addItem("����");
        box.addItem("����Ԫ����");
        box.addItem("����ɰ�������");
        box.setBounds(400, 300, 300, 65);

        JButton jButton = new JButton("ȷ��");
        //
        box.setOpaque(false);
        jButton.setOpaque(false);
        jButton.setContentAreaFilled(false);
        //
        jButton.setBounds(200, 160, 60, 40);

        //��Ӳ���,�������
        container.setLayout(null);
        container.add(box);
        container.add(jButton);

        //�����¼�
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = (String) box.getSelectedItem();
                switch (str) {
                    case "��ѡ��":
                        new MyDialog("��ѡ������",0);
                        break;
                    case "����":
                        new MyDialog("���������أ�hei en tai",0);
                        break;
                    case "����":
                        new MyDialog("����¶ȣ����Ԧ��ס������",0);
                        break;
                    case "����Ԫ����" :
                        new MyDialog("��������һ��ȥת��ȥ����Ԫ�ɣ�",0);
                        break;
                    case "����ɰ�������" :
                        new MyDialog("���������ã����������ao( *^-^)��(*�s^�t)",1);
                }

            }
        });


        this.setVisible(true);
    }


}

//������
class MyDialog extends JDialog {

    public MyDialog(String str,int size) {
        this.setTitle(str);
        if (size == 0){
            this.setBounds(550, 365, 400, 300);
        }
        if (size == 1){
            this.setBounds(450, 365, 600, 300);
        }

        //��������
        Container cPane = this.getContentPane();
        cPane.setBackground(new Color(230, 187, 245));

        //������
        JLabel label = new JLabel(str, SwingConstants.CENTER);
        label.setSize(200, 100);
        label.setFont(new Font("����", Font.BOLD, 25));

        //��ӱ�ǩ
        cPane.add(label);

        //�ɼ���
        this.setVisible(true);
    }

}