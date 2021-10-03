package A1_MyJava.基础知识.调试练习;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ExtJFrame extends JFrame {

    public static void main(String[] args) {
        new ExtJFrame("窗体");
    }

    public ExtJFrame(String title){
        super(title);
        //初始化窗体
        this.setBounds(400,300,500,480);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //添加图片控件
        MyJPanel myJPanel = new MyJPanel();
        this.setContentPane(myJPanel);

        //向面板中添加控件
        //myJPanel.setLayout(new BoxLayout(myJPanel,BoxLayout.Y_AXIS));
        JButton jb1 = new JButton("这就尴尬了");
        //jb1.setBounds(300,200,200,100);
        jb1.setOpaque(false);
        jb1.setContentAreaFilled(false);

        myJPanel.add(jb1);

        //设置可见性
        this.setVisible(true);

    }



    //内部类
    private class MyJPanel extends JPanel{

        Image image = null;

        public MyJPanel(){
            Image im = new ImageIcon("src\\A1_MyJava\\基础知识\\调试练习\\透明窗体\\A00.jpg").getImage();
            try {
                image = im;
            }catch (Exception e){
                e.printStackTrace();
            }

        }

        @Override
        public void paintComponents(Graphics g) {

            super.paintComponent(g);
            int width = this.getWidth();
            int height = this.getHeight();
            g.clearRect(0,0,width,height);
            //画背景图片
            g.drawImage(image,0,0,width,height,null);

            //加上一层半透明的遮罩
            g.setColor(new Color(255, 255, 255,200));
            g.fillRect(0,0,width,height);



        }

    }
}
