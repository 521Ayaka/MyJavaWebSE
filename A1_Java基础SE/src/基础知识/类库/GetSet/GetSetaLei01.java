package ����֪ʶ.���.GetSet;

public class GetSetaLei01 {

    private String name;
    private String gan;
    private boolean en;
    int i = 666;
    String wan = "һ����LOL��";

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
    public boolean isEn(){              //����:��Setten��Getten��boolean��ʱ��get���� ����is... �磺isEn
        return en;
    }


}

