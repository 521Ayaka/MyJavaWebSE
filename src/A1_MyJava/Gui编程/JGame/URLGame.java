package A1_MyJava.Gui���.JGame;

import javax.swing.*;
import java.net.URL;

public class URLGame {

    //����
    public static URL bodyURL = URLGame.class.getResource("statics/body.png");
    public static ImageIcon body =new ImageIcon(bodyURL);

    //ͷ��
    public static URL upURL = URLGame.class.getResource("statics/up.png");
    public static ImageIcon up = new ImageIcon(upURL);//��

    public static URL downURL =  URLGame.class.getResource("statics/down.png");
    public static ImageIcon down = new ImageIcon(downURL);//�²�

    public static URL leftURL =  URLGame.class.getResource("statics/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);//��

    public static URL rightURL =  URLGame.class.getResource("statics/right.png");
    public static ImageIcon right = new ImageIcon(rightURL);//�Ҳ�

    //ʳ��
    public static URL foodURL =  URLGame.class.getResource("statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);//�²�

    //���
    public static URL imgURL = URLGame.class.getResource("statics/img.png");
    public static ImageIcon img = new ImageIcon(imgURL);









}
