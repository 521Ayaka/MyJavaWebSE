package 基础知识.类库.LeiShuoming;

public class Ganga {

    private int ganga;
    private boolean wen;
    private String str;

    public int getGanga() {
        return ganga;
    }

    public void setGanga(int ganga) {
        this.ganga = ganga;
    }

    public boolean isWen() {
        return wen;
    }

    public void setWen(boolean wen) {
        this.wen = wen;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Ganga() {
    }

    public Ganga(int ganga, boolean wen, String str) {
        this.ganga = ganga;
        this.wen = wen;
        this.str = str;
    }
}