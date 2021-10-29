package 基础知识.类库.GetSet;

public class GetSetaLei01 {

    private String name;
    private String gan;
    private boolean en;
    int i = 666;
    String wan = "一起玩LOL吧";

    public void setName (String x){
        name = x;
    }
    public String getName(){
        return name;
    }

    public void setGan(String v){
        gan = v;
    }
    public String getGan(){
        return gan;
    }

    public void methodi(){
        System.out.println(i);
    }

    public void setEn(boolean y){
        en = y;
    }
    public boolean isEn(){              //特例:当Setten、Getten是boolean行时，get不用 换成is... 如：isEn
        return en;
    }


}

