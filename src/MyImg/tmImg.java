package MyImg;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * ���� The type Tm img.
 *
 * @author Jack Que
 * @created 2021 -07-08 10:25:10
 */
public class tmImg {


    /**
     * ���� The entry point of application.
     *
     * @param args the input arguments
     * @author Jack Que
     * @created 2021 -07-08 10:25:10
     */
    public static void main(String[] args) {
        try {
//            changeImgColor("D:\\IEC202105181050.JPG");
            changeImgColor("D:\\Դ����\\src\\MyImg\\A01.jpg");
            changeImgColor("C:\\Users\\Saber\\Desktop\\img\\A7.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * �������滻Ϊ͸��
     *
     * @param imgBytes the img bytes
     * @return
     * @throws IOException the io exception
     * @author Jack Que
     * @created 2021 -07-08 10:25:10 Change img color.
     */
    public static void changeImgColor(String path) throws IOException {

        File file = new File(path);
        String fileName = file.getName();
        BufferedImage bi =  ImageIO.read(file);
        Image image = (Image) bi;
        //��ԭͼƬ�Ķ�����ת��ΪImageIcon
        ImageIcon imageIcon = new ImageIcon(image);
        int width = imageIcon.getIconWidth();
        int height = imageIcon.getIconHeight();
//
        //ͼƬ������
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
        graphics2D.drawImage(imageIcon.getImage(), 0, 0, imageIcon.getImageObserver());

        int alpha = 255;

        //���������ɫ��ѡ��������ѡ����ǱȽ�ƫ��λ�ã������޸�λ�á�����ɫѡ��֪����û�б�ĸ��ŵķ�ʽ�������ȹ���һ���ȡ��ɫ�������ģ�������Ϊ�о���������Ƚϸ���ûȥʵ�֣�������п������ۡ�
        int RGB=bufferedImage.getRGB(width-1, height-1);

        for(int i = bufferedImage.getMinX(); i < width; i++) {
            for(int j = bufferedImage.getMinY(); j < height; j++) {

                int rgb = bufferedImage.getRGB(i, j);

                int r = (rgb & 0xff0000) >>16;
                int g = (rgb & 0xff00) >> 8;
                int b = (rgb & 0xff);
                int R = (RGB & 0xff0000) >>16;
                int G = (RGB & 0xff00) >> 8;
                int B = (RGB & 0xff);
                //aΪɫ�Χֵ������ɫ��Ե������ֵ��Ҫ������ԣ�50���ҵ�Ч���ȽϿ���
                int a = 45;
                if(Math.abs(R-r) < a && Math.abs(G-g) < a && Math.abs(B-b) < a ) {
                    alpha = 0;
                } else {
                    alpha = 255;
                }
                rgb = (alpha << 24)|(rgb & 0x00ffffff);
                bufferedImage.setRGB(i,j,rgb);
            }
        }

//        graphics2D.drawImage(bufferedImage, 0, 0, imageIcon.getImageObserver());

        //�½��ֽ����������������滻�걳����ͼƬ
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        String[] split = fileName.split("\\.");
        fileName = split[0]+"(��ת��)."+split[1];
        ImageIO.write(bufferedImage, "png", new File("D:\\"+fileName));
    }

    public static String convertRgbStr(int color) {
        int red = (color & 0xff0000) >> 16;// ��ȡcolor(RGB)��Rλ
        int green = (color & 0x00ff00) >> 8;// ��ȡcolor(RGB)��Gλ
        int blue = (color & 0x0000ff);// ��ȡcolor(RGB)��Bλ
        return red + "," + green + "," + blue;
    }
}