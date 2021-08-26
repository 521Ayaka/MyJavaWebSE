package �ع���ϰ;

import javax.swing.*;
import java.awt.*;

public class IconLei extends JFrame implements Icon {

    //�����������ԣ�width height
    private int width;
    private int height;

    //�����������췽��
    public IconLei(){}
    public IconLei(int width ,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //Ҫ���Ķ���

        g.setColor(new Color(10, 227, 72));
        g.fillOval(x,y,width,height);

        g.setColor(new Color(255, 8, 132));
        g.drawOval(x-5,y-5,width+10,height+10);

        g.fillRect(x+35,y,width+80,height);
    }

    @Override
    public int getIconWidth() {
        return this.width;//���ؿ��
    }

    @Override
    public int getIconHeight() {
        return this.height;//���ظ߶�
    }


    //ʹ�ã�
    public void init(){
        //��ʼ������
        this.setBounds(500,300,600,500);
        this.setBackground(new Color(25, 204, 236));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

        //�������
        JLabel jL = new JLabel("ͼƬ��ǩ", new IconLei(30,30), SwingConstants.CENTER);
        jL.setSize(400,200);
        jL.setFont(new Font("����",Font.BOLD,25));
        jL.setForeground(new Color(243, 185, 96));

        //������
        Container container = this.getContentPane();
        container.add(jL);
    }

    //����
    public static void main(String[] args) {
        new IconLei().init();
    }
}
