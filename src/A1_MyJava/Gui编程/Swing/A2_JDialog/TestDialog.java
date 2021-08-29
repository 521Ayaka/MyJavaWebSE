package A1_MyJava.Gui���.Swing.A2_JDialog;
/*
�ص㣡����������������������

Dialog������һ���࣬������ʵ���ڵģ�һ��VisibleΪtrue

�����õ�����ʱ�򣬻ᴴ���������ʹ������

������Ĭ�ϵĹرգ�����Ҫ�ټ��룬����ᱨ��

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestDialog {

    public static void main(String[] args) {
        new MyJFrame().init();
    }

}

class MyJFrame extends JFrame{

    private Container container;

    //��ʼ������
    public void init(){
        this.setBounds(500,300,500,400);
        this.setBackground(new Color(25, 204, 236));
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        //�������
        this.container = this.getContentPane();
        //������
        Sub();
    }

    //���
    public void Sub (){
        JButton jButton = new JButton("������ť");
        jButton.setBounds(150,150,200,100);
        jButton.setBackground(new Color(224, 9, 231));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialog();
            }
        });

        this.container.add(jButton);

    }

}
//JDialog�������һ�����壬��������һ�������������ӣ�����
class MyDialog extends JDialog{

    public MyDialog(){
        this.setBounds(600,400,300,300);
        this.setVisible(true);

        Container cPane = this.getContentPane();
        cPane.setBackground(new Color(255, 8, 132));

        //���������޲���ģʽʱ����Ϊ(null)ʱ,��ӵ����Ҫ���ô�Сλ�õ���Ϣ�����������ú������ǩҲ��������ˣ����ǵ���Location
        //cPane.setLayout(null);

        JLabel label = new JLabel("�����ѱ�������", SwingConstants.CENTER);
        label.setSize(200,100);
        label.setFont(new Font("����",Font.BOLD,25));

        //��ӱ�ǩ
        cPane.add(label);

    }

}

