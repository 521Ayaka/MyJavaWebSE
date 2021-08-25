package A1_MyJava.Gui编程.Swing.A3_Icon_And_JLabel;

import javax.swing.*;
import java.awt.*;

/**
 * Icon是一个接口，需要实现该接口，并重写里面的3个方法
 * Icon要在窗体里面显示，需要继承窗体
 *
 * extends JFrame implements Icon
 * */
class MyIcon extends JFrame implements Icon{

    //设置两个成员变量/属性,用于设置宽度,高度
    private int width;
    private int height;

    //然后再创建两个构造方法
    /**无参构造*/
    public MyIcon(){}
    /**全参构造*/
    public MyIcon(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        //这个方法里面是要操作的
        //放入的位置 , 要画的图形 , 图像大小参数1 , 图形大小参数2
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

    //启动
    public static void main(String[] args) {

        new IconAndJLabel().init();

    }

    //初始化
    public void init(){
        //创建对象
        MyIcon setF = new MyIcon(10,10);
        //添加容器
        Container addF = setF.getContentPane();
        //初始化窗体
        setF.setBounds(500,300,500,400);
        setF.setBackground(new Color(8, 201, 234));
        setF.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setF.setVisible(true);

        //创建添加组件
        JLabel jLabel = new JLabel("图片标签", setF, SwingConstants.CENTER);
        addF.add(jLabel);

    }

}
