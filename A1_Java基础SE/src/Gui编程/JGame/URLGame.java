package Gui编程.JGame;

import javax.swing.*;
import java.net.URL;

public class URLGame {

    //身体
    public static URL bodyURL = URLGame.class.getResource("statics/body.png");
    public static ImageIcon body =new ImageIcon(bodyURL);

    //头部
    public static URL upURL = URLGame.class.getResource("statics/up.png");
    public static ImageIcon up = new ImageIcon(upURL);//上

    public static URL downURL =  URLGame.class.getResource("statics/down.png");
    public static ImageIcon down = new ImageIcon(downURL);//下部

    public static URL leftURL =  URLGame.class.getResource("statics/left.png");
    public static ImageIcon left = new ImageIcon(leftURL);//左部

    public static URL rightURL =  URLGame.class.getResource("statics/right.png");
    public static ImageIcon right = new ImageIcon(rightURL);//右部

    //食物
    public static URL foodURL =  URLGame.class.getResource("statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);//下部

    //广告
    public static URL imgURL = URLGame.class.getResource("statics/TestOutputStreamImpl.png");
    public static ImageIcon img = new ImageIcon(imgURL);









}
