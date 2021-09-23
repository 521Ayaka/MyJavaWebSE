package MyImg;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class IMG {
    public static void main(String[] args) throws Exception{
        BufferedImage image = ImageIO.read(new File("C:\\Users\\Saber\\Desktop\\img\\A6.jpg"));
        // �߶ȺͿ��
        int height = image.getHeight();
        int width = image.getWidth();

        // ��������͸��������͸����ͼƬ
        ImageIcon imageIcon = new ImageIcon(image);
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2D = (Graphics2D) bufferedImage.getGraphics(); // ��ȡ����
        g2D.drawImage(imageIcon.getImage(), 0, 0, null); // ����Image��ͼƬ��ʹ����imageIcon.getImage()��Ŀ�ľ��ǵõ�image,ֱ��ʹ��image�Ϳ��Ե�

        int alpha = 0; // ͼƬ͸����
        // ��������Y�������
        for (int y = bufferedImage.getMinY(); y < bufferedImage.getHeight(); y++) {
            // �ڲ������X�������
            for (int x = bufferedImage.getMinX(); x < bufferedImage.getWidth(); x++) {
                int rgb = bufferedImage.getRGB(x, y);
                // �Ե�ǰ��ɫ�ж��Ƿ���ָ��������
                if (colorInRange(rgb)){
                    alpha = 0;
                }else{
                    // ����Ϊ��͸��
                    alpha = 255;
                }
                // #AARRGGBB ��ǰ��λΪ͸����
                rgb = (alpha << 24) | (rgb & 0x00ffffff);
                bufferedImage.setRGB(x, y, rgb);
            }
        }
        // ����������RGB����ͼƬ,��һ���о�����Ҳ����ֻ��͸���ط�����ǳ�б仯���ѣ�������������ĸо�
        g2D.drawImage(bufferedImage, 0, 0, null);

        // ����ͼƬΪPNG
        ImageIO.write(bufferedImage, "png", new File("C:\\Users\\Saber\\Desktop\\img\\A6.png"));
       // MyLogger.logger.info("��ɻ�ͼ");
    }

    // �ж��Ǳ�����������
    public static boolean colorInRange(int color) {
        int red = (color & 0xff0000) >> 16;// ��ȡcolor(RGB)��Rλ
        int green = (color & 0x00ff00) >> 8;// ��ȡcolor(RGB)��Gλ
        int blue = (color & 0x0000ff);// ��ȡcolor(RGB)��Bλ
        // ͨ��RGB���������жϵ�ǰ��ɫ�Ƿ���ָ������ɫ������
        if (red >= color_range && green >= color_range && blue >= color_range){
            return true;
        };
        return false;
    }

    //ɫ�Χ0~255    210
    public static int color_range = 210;
}
