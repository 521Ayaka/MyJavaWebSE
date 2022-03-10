package 基础知识.类库.GetSet;

public class LeiFuXi {

    //成员变量
    private int ganga;
    private String name;
    private boolean wen;

    //Set Get 对成员变量进行

    public void setGanga(int ganga){
        this.ganga = ganga;
    }

    public int getGanga(){
        return ganga;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWen(boolean wen){
        this.wen = wen;
    }

    public boolean isWen(){
        return wen;
    }


    //构造方法；全参构造 和 无参构造

    public LeiFuXi(){

    }

    public LeiFuXi(int ganga, String name, boolean wen){
        this.ganga = ganga;
        this.name = name;
        this.wen = wen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LeiFuXi leiFuXi = (LeiFuXi) o;

        if (ganga != leiFuXi.ganga) return false;
        if (wen != leiFuXi.wen) return false;
        return name != null ? name.equals(leiFuXi.name) : leiFuXi.name == null;
    }

    @Override
    public String toString() {
        return "LeiFuXi{" +
                "ganga=" + ganga +
                ", name='" + name + '\'' +
                ", wen=" + wen +
                '}';
    }
}
