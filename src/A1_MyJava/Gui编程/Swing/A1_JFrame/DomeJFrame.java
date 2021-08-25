package A1_MyJava.Gui编程.Swing.A1_JFrame;
/*

GUI包括AWT和Swing
AWT是底层
Swing是AWT的封装

*/


import javax.swing.*;
import java.awt.*;

public class DomeJFrame {

    private JFrame jFrame;

    //一般游戏开发式，init()初始化。
    public void init(){

        //位置大小
        jFrame = new JFrame("Swing中的JFrame窗口");
        jFrame.setLocation(500,300);
        jFrame.setSize(500,400);

        //关闭
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //创建容器
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(new Color(8, 201, 234));


        //设置文字。用标签JLabel, 另外，第二个常数SwingConstants.-- 调整标签位置
        JLabel jLabel = new JLabel("可以不写",SwingConstants.CENTER);
        jLabel.setText("这就尴尬了");

        /* 这些都是没有用的
        jLabel.setBackground(new Color(9, 243, 216));
        frame.setLayout(new BorderLayout());
        frame.add(jLabel,BorderLayout.CENTER);
        //只能使用
        */
        jLabel.setFont(new Font("宋体",Font.BOLD,50));
        jLabel.setForeground(new Color(234, 100, 232));
        contentPane.add(jLabel);
        
        //===============================================================
        JLabel jL = new JLabel("",SwingConstants.CENTER);
        jL.setSize(100,500);
        ImageIcon image = new ImageIcon("src/MyImg/A0.jpg");


        //设置图片大小
        Image img = image.getImage();
        img = img.getScaledInstance(400, 600, Image.SCALE_DEFAULT);
        image.setImage(img);

        //添加
        jL.setIcon(image);
        jL.setSize(40,10);
        contentPane.add(jL);

        //设置可见性
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {

        new DomeJFrame().init();

    }

}
