package A1_MyJava.����֪ʶ.������ϰ.͸������;

//icon.setImage(icon.getImage().getScaledInstance(392,400,Image.SCALE_DEFAULT)); //ͼƬ��С

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 * ͼƬ�������� ����https://blog.csdn.net/beinlife/article/details/53665152 ����
 */
public class Test2 {


    /**
     * ���ɱ���͸���� ����ˮӡ������λ��͸�����������룬��������ת�Ƕ�
     *
     * @param width ����ͼƬ���
     * @param heigth ����ͼƬ�߶�
     * @param text ˮӡ����
     * @param color ��ɫ����
     * @param font awt����
     * @param degree ˮӡ������ת�Ƕ�
     * @param alpha ˮӡ��͸����0f-1.0f
     */
    public static BufferedImage waterMarkByText(int width, int heigth, String text, Color color,
                                                Font font, Double degree, float alpha) {
        BufferedImage buffImg = new BufferedImage(width, heigth, BufferedImage.TYPE_INT_RGB);
        /**2���õ����ʶ���*/
        Graphics2D g2d = buffImg.createGraphics();
        // ----------  ��������Ĵ���ʹ�ñ���͸��  -----------------
        buffImg = g2d.getDeviceConfiguration()
                .createCompatibleImage(width, heigth, Transparency.TRANSLUCENT);
        g2d.dispose();
        g2d = buffImg.createGraphics();
        // ----------  ����͸���������  -----------------

        // ���ö��߶εľ��״��Ե����
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
                RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        //��ԴͼƬд��
//            g2d.drawImage(srcImg.getScaledInstance(srcImg.getWidth(null),
//                    srcImg.getHeight(null), Image.SCALE_SMOOTH), 0, 0,null);

        // ����ˮӡ��ת
        if (null != degree) {
            //ע��rotate��������theta��Ϊ�����ƣ�������Math.toRadiansת��һ��
            //�Ծ�����������ΪԲ����ת
            g2d.rotate(Math.toRadians(degree), (double) buffImg.getWidth() / 2,
                    (double) buffImg.getHeight() / 2);
        }

        // ������ɫ
        g2d.setColor(color);

        // ���� Font
        g2d.setFont(font);

        //����͸����:1.0fΪ͸���� ��ֵ��0-1.0�����α�ò�͸��
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
        //��ȡ��ʵ���
        float realWidth = getRealFontWidth(text);
        float fontSize = font.getSize();
        //�����ͼƫ��x��y��ʹ��ʹ��ˮӡ������ͼƬ�о���
        //������Ҫ���x��y�����ǻ���Graphics2D.rotate���������ϵ
        float x = 0.5f * width - 0.5f * fontSize * realWidth;
        float y = 0.5f * heigth + 0.5f * fontSize;
        //ȡ���Ƶ��ִ���ȡ��߶��м�����ƫ�ƣ�ʹ��������ͼƬ�����о���
        g2d.drawString(text, x, y);
        //�ͷ���Դ
        g2d.dispose();
//        System.out.println("���ˮӡ�������!");
        return buffImg;

    }
    public static BufferedImage waterMarkByText(int width, int heigth, String text, Color color, float alpha) {
        //jdkĬ������
        Font font = new Font("Dialog", Font.ROMAN_BASELINE, 33);
        return waterMarkByText(width, heigth, text, color,font, -30d, alpha);
    }
    public static BufferedImage waterMarkByText(int width, int heigth, String text, float alpha) {
        return waterMarkByText(width, heigth, text, Color.GRAY, alpha);
    }


    public static BufferedImage waterMarkByText(int width, int heigth, String text) {
        return waterMarkByText(width, heigth, text, 0.2f);
    }

    public static BufferedImage waterMarkByText(String text) {
        return waterMarkByText(200, 150, text);
    }

    /**
     * ��ȡ��ʵ�ַ�����ȣ�ascii�ַ�ռ��0.5�������ַ�ռ��1.0
     */
    private static float getRealFontWidth(String text) {
        int len = text.length();
        float width = 0f;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) < 256) {
                width += 0.5f;
            } else {
                width += 1.0f;
            }
        }
        return width;
    }


    public static void main(String[] args) {
        int width = 200;
        int heigth = 150;
        Font font = new Font("΢���ź�", Font.ROMAN_BASELINE, 33);//����
        BufferedImage bi1 = waterMarkByText(width, heigth, "����aB~,", Color.GRAY, font, -30d,
                0.2f);//��ͼƬ�������ˮӡ
//        BufferedImage bi = waterMarkByText(width, heigth, "����aB~,", Color.GRAY, -30d,
//                0.2f);//��ͼƬ�������ˮӡ
//        BufferedImage bi2 = waterMarkByText(width, heigth, "����aB~,");//��ͼƬ�������ˮӡ
//        BufferedImage bi3 = waterMarkByText("����aB~,");
        try {
            ImageIO.write(bi1, "png", new File("D:\\Դ����\\img\\���������.jpg"));//д���ļ�
            System.out.println(Color.decode("#00bcd4"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
