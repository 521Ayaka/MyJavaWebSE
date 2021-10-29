package 基础知识.调试练习;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends JFrame {

    public TestFrame(String title) {
        this.setTitle(title);
    }

    public static void main(String[] args) {
        new TestFrame("下拉框").init();
    }

    //初始化
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

        //添加组件
        JComboBox box = new JComboBox();
        box.addItem("请选择");
        box.addItem("萝莉");
        box.addItem("御姐");
        box.addItem("二次元妹子");
        box.addItem("娇柔可爱的妹子");
        box.setBounds(400, 300, 300, 65);

        JButton jButton = new JButton("确定");
        //
        box.setOpaque(false);
        jButton.setOpaque(false);
        jButton.setContentAreaFilled(false);
        //
        jButton.setBounds(200, 160, 60, 40);

        //添加布局,放入组件
        container.setLayout(null);
        container.add(box);
        container.add(jButton);

        //监听事件
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = (String) box.getSelectedItem();
                switch (str) {
                    case "请选择":
                        new MyDialog("请选择内容",0);
                        break;
                    case "萝莉":
                        new MyDialog("你个死萝莉控！hei en tai",0);
                        break;
                    case "御姐":
                        new MyDialog("姐的温度，你驾驭不住！！！",0);
                        break;
                    case "二次元妹子" :
                        new MyDialog("我们现在一起去转世去二次元吧！",0);
                        break;
                    case "娇柔可爱的妹子" :
                        new MyDialog("别碰俺妹妹，当心让你哭ao( *^-^)ρ(*╯^╰)",1);
                }

            }
        });


        this.setVisible(true);
    }


}

//弹窗类
class MyDialog extends JDialog {

    public MyDialog(String str,int size) {
        this.setTitle(str);
        if (size == 0){
            this.setBounds(550, 365, 400, 300);
        }
        if (size == 1){
            this.setBounds(450, 365, 600, 300);
        }

        //创建容器
        Container cPane = this.getContentPane();
        cPane.setBackground(new Color(230, 187, 245));

        //添加组件
        JLabel label = new JLabel(str, SwingConstants.CENTER);
        label.setSize(200, 100);
        label.setFont(new Font("宋体", Font.BOLD, 25));

        //添加标签
        cPane.add(label);

        //可见性
        this.setVisible(true);
    }

}