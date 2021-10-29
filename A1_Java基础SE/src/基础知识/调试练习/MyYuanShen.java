package 基础知识.调试练习;

//我的原石数据,不用过多了解这个类文件
public class MyYuanShen {

    private int yuanShi = 6666;
    private int MoLa = 2185556;
    private boolean yueKa = true;
    private int Kuang1 = 354;
    private int Kuang2 = 511;
    private int Kuang3 = 554;
    //................各种资源
    //................各种非酋


    //private修饰成员变量，创建GetSet实现成员变量调取传入

    public int getYuanShi() {
        return yuanShi;
    }

    public void setYuanShi(int yuanShi) {
        this.yuanShi = yuanShi;
    }

    public int getMoLa() {
        return MoLa;
    }

    public void setMoLa(int moLa) {
        MoLa = moLa;
    }

    public boolean isYueKa() {
        return yueKa;
    }

    public void setYueKa(boolean yueKa) {
        this.yueKa = yueKa;
    }

    public int getKuang1() {
        return Kuang1;
    }

    public void setKuang1(int kuang1) {
        Kuang1 = kuang1;
    }

    public int getKuang2() {
        return Kuang2;
    }

    public void setKuang2(int kuang2) {
        Kuang2 = kuang2;
    }

    public int getKuang3() {
        return Kuang3;
    }

    public void setKuang3(int kuang3) {
        Kuang3 = kuang3;
    }
}
