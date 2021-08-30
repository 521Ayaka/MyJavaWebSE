package A1_MyJava.Gui编程.Swing.A5_JButton;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JButton_01 extends JFrame {

    public JButton_01(String title){
        super(title);
    }

    public void init(){
        //初始化
        Container container = this.getContentPane();
        this.setBounds(300,200,700,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        container.setBackground(new Color(8, 241, 215));
        container.setLayout(null);

        //添加图片组件
        JButton jButton = new JButton();
        JPanel jPanel = new JPanel();
        jPanel.setBounds(200,100,500,500);
        jPanel.setSize(500,500);
        jPanel.add(jButton);

        URL url = JButton_01.class.getResource("B11.jpg");
        ImageIcon icon = new ImageIcon(url);
        jButton.setIcon(icon);
        jButton.setSize(500,400);

        //添加组件
        container.add(jPanel);


        this.setVisible(true);

    }

    public static void main(String[] args) {
        new JButton_01("图片按钮").init();
    }

}
