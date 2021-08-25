package A1_MyJava.Gui���.Swing.A3_Icon_And_JLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Icon��һ���ӿڣ���Ҫʵ�ָýӿڣ�����д�����3������
 * IconҪ�ڴ���������ʾ����Ҫ�̳д���
 *
 * extends JFrame implements Icon
 * */
class MyIcon extends JFrame implements Icon{

    //����������Ա����/����,�������ÿ��,�߶�
    private int width;
    private int height;

    //Ȼ���ٴ����������췽��
    /**�޲ι���*/
    public MyIcon(){}
    /**ȫ�ι���*/
    public MyIcon(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //�������������Ҫ������
        //�����λ�� , Ҫ����ͼ�� , ͼ���С����1 , ͼ�δ�С����2
        g.fillOval(x,y,width,height);
    }

    @Override
    public int getIconWidth() {
        return /*0*/this.width;
    }

    @Override
    public int getIconHeight() {
        return /*0*/this.height;
    }
}



public class IconAndJLabel {

    //����
    public static void main(String[] args) {

        new IconAndJLabel().init();

    }

    //��ʼ��
    public void init(){
        //��������
        MyIcon setF = new MyIcon(10,10);
        //�������
        Container addF = setF.getContentPane();
        //��ʼ������
        setF.setBounds(500,300,500,400);
        setF.setBackground(new Color(8, 201, 234));
        setF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setF.setVisible(true);

        //����������
        JLabel jLabel = new JLabel("ͼƬ��ǩ", setF, SwingConstants.CENTER);
        addF.add(jLabel);

    }

}
