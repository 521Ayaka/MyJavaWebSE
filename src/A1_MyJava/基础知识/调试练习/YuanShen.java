package A1_MyJava.児粥岑紛.距編膳楼;
//擬淫

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
泣壘
購廣
仍仍
辛參議三��公倖噴銭窟匆佩/裕丶。ありがとうございます
uid:塗檀挫郭狹
uid:136761371

*/
//蝕兵殻會議圻舞匯爺......
public class YuanShen {

    //嬉蝕嗄老
    public static void main(String[] args) {

        //幹秀斤��
        Scanner sc = new Scanner(System.in);

        //miHoYo 圻舞
        System.out.println("丘崙音措嗄老��詳蒸義井嗄老。");
        System.out.println("廣吭徭厘隠擦��女契鞭騰貧輝。");
        System.out.println("癖業嗄老吩辻��柿痴嗄老彬附。");
        System.out.println("栽尖芦電扮寂���輅椽／吃�試。");
        System.out.println("......");

        System.out.println("\n屎壓墮秘紗墮嗄老方象...");

        System.out.println("泣似販吭侃序秘");//頁倦�觸�秘
        System.out.println("頁倦�觸�秘?yes?no?"); //補秘低議�觀─�。。

        String ask;
        do {
            ask = sc.next();
            if ("yes".equals(ask)) {
                System.out.println("散哭序秘致策啼��");
                method();//距喘method圭隈��屎塀蝕兵嗄老
            } else if ("no".equals(ask)) {
                System.out.println("壅需mHoYo  壅需圻舞。");
            } else {
                System.out.println("伉秤鹸墫��油音峡��涙隈僉夲。");
            }
        } while (!"yes".equals(ask) && !"no".equals(ask));

    }


    //method屎塀蝕兵嗄老議圭隈=================================================================
    public static void method() {
        //幹秀斤��
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        MyYuanShen my = new MyYuanShen();
        int YuanShi = my.getYuanShi();

        System.out.println("屎壓序秘...");

        //頁倦埖触
        if (my.isYueKa()) {
            System.out.println("資誼90圻墳");
            my.setYuanShi(my.getYuanShi() + 90);
        }

        //耽晩販暦��嬉蝕販暦
        System.out.println("=====耽晩販暦=====");
        int yes =MeiRiWeiTuo();//距喘和中議溜熔��旺卦指圻墳
        my.setYuanShi(my.getYuanShi()+yes);//紗厘厘議圻垂様
        System.out.println("勧僕\n檀蟻廓");
        System.out.println("丹�媼厥�氏\n伸肘奏\n�誚登�......");
        System.out.println("湖仍低螺......");
        System.out.println("圻墳+20");
        my.setYuanShi(my.getYuanShi()+20);//紗厘厘議圻垂様

        //書晩資誼圻墳方
        System.out.println("書晩資誼圻墳方��"+(my.getYuanShi()-YuanShi));

        //塗撚
        System.out.println("============================");
        System.out.println("丹�媼厥�氏\n伸肘奏\n�誚登�......");
        System.out.println("塗撚販暦");
        my.setKuang1(my.getKuang1()+9*4);
        my.setKuang2(my.getKuang2()+7*4);
        my.setMoLa(my.getMoLa()+50000*2);

        //繕署岬
        System.out.println("============================");
        System.out.println("繕署岬\n欲鯉追\n狹�進加簡韮�");
        my.setKuang2(my.getKuang2()-5*4*4);
        System.out.println("壅需��");

        //栽撹岬
        System.out.println("============================");
        do {
            //頁倦泣欺休題鱗帽
            int kao =1;
            int xxx= ran.nextInt(2);
            if(kao == xxx){
                System.out.println("栽撹岬\n休題鱗帽\n低挫��低匆斤繕......");
                System.out.println("壅需");
            }else{
                System.out.println("栽撹4倖敵抹峯妛");
                break;
            }
        }while(true);

        //畷技
        System.out.println("============================");
        int yuan = my.getYuanShi()/160;

        for (int i = 0; i < yuan; i++) {

        }

        for (int i = 1; i <= yuan; i++) {
            System.out.println("巾算\n畷技\n畷技匯肝\n鳩協");
            System.out.println("孝浪資誼��");
            System.out.println("參尖捲繁");
            my.setYuanShi(my.getYuanShi()-160);//受肇厘議圻垂様
            System.out.println("複噫圻墳��"+my.getYuanShi());
        }
        System.out.println("畷技頼穎��");

        System.out.println("============================");

        //頁倦容竃嗄老
        System.out.println("頁倦容竃嗄老��yes��no��");
        String str;
        do {
            str = sc.next();
            if ("yes".equals(str)){
                System.out.println("曜竃嗄老");
            }else if("no".equals(str)){
                System.out.println("遥嵩肇......");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }else{
                System.out.println("貧隠久浴阻��來秤鹸墫。。。");
                for (int i = 0; i < 10; i++) {
                    System.out.println(".........");
                }
            }
        }while(!"yes".equals(str) && !"no".equals(str));

        //
    }



    //耽晩溜熔議圭隈=========================================================
    public static int MeiRiWeiTuo(){
        //幹秀斤��
        MyYuanShen my = new MyYuanShen();
        Random ran = new Random();
        ArrayList<String> list = new ArrayList<>();

        //侭嗤販暦坪否
        list.add("舒具議秘盃");
        list.add("妬互裡��");
        list.add("匝裡鞭凋");
        list.add("柏柏繁議匯弌化");
        list.add("海駁峅秘");
        list.add("芦畠塰補");
        list.add("裡字塰補");
        list.add("唾佩宀��厘偶阻");
        list.add("唾佩宀��嬉膝寮伏");
        list.add("唾佩宀��肇......");
        //湊謹阻��焚担並脅斑唾佩宀恂

        //昧字距喘4倖溜熔
        int yes = 0;
        ran.nextInt(list.size());
        for (int i = 0; i < 4; i++) {
            System.out.println("弖忸");
            //戻函溜熔沫哈峙
            int index = ran.nextInt(list.size());
            String renwu = list.get(index);
            System.out.println(renwu);
            list.remove(index);//評茅宸倖溜熔

            System.out.println("販暦頼撹");
            System.out.println("圻墳+10");
            System.out.println("========");
            yes+=10;

        }

        return yes;
    }

}




