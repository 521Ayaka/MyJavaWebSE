package A1_MyJava.����֪ʶ.������ϰ;

/*
 *��д�������ʵ�ְ�͸����JPanel
 */
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

//import Logic.CastImage;

public class TranslucenceJPanel extends JPanel {

    private BufferedImage background;

    private float transparency;


    public TranslucenceJPanel(){
        try {
            background = ImageIO.read(ImageIO.createImageInputStream(new File("C:\\Users\\Saber\\Desktop\\A6.jpg")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**���������������JPanel��͸����
     *
     * @param transparency:͸����
     *
     * @return void
     */
    public void setTransparent(float transparency) {
        this.transparency = transparency;
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D graphics2d = (Graphics2D) g.create();

        graphics2d.setComposite(AlphaComposite.SrcOver.derive(transparency));

        graphics2d.setColor(Color.white);

        graphics2d.drawImage(background, 0, 0, this);//�������ʹ��Image�Ķ��󣬶�����BufferedImage�Ķ����ǻ��Ʋ������ģ���֪��Ϊ�Ρ�

        graphics2d.dispose();
    }

}
