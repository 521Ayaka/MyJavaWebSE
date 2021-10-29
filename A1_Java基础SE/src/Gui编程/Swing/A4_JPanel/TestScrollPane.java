package Gui���.Swing.A4_JPanel;

import javax.swing.*;
import java.awt.*;

public class TestScrollPane extends JFrame {

    //ScrollPane���
    public void init1(){
        //��ʼ����
        this.setTitle("�������");
        this.setBounds(200,300,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(8, 201, 234));

        //�����ı���
        TextArea textArea = new TextArea(40, 100);
        //����Ĭ���ı�
        textArea.setText("�ʾ����м���ǡ��һ����ˮ����");

        //�����������
        ScrollPane scrollPane = new ScrollPane();
        scrollPane.add(textArea);

        //����ı������
        container.add(scrollPane);

        //�ɼ���
        this.setVisible(true);
    }


    //��ͨ���
    public void init2(){
        //��ʼ����
        this.setTitle("��ͨ���");
        this.setBounds(800,300,600,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setBackground(new Color(8, 201, 234));

        //�����ı���
        TextArea textArea = new TextArea(40, 100);
        //����Ĭ���ı�
        textArea.setText("�ʾ����м���ǡ��һ����ˮ����");

        //����ı������
        container.add(textArea);

        //�ɼ���
        this.setVisible(true);
    }



    public static void main(String[] args) {
        new TestScrollPane().init1();
        new TestScrollPane().init2();
    }



}
