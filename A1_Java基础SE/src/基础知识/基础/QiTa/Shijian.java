package ����֪ʶ.����.QiTa;

public class Shijian {
public static  void main (String[] args){
        for(int hour = 0; hour<24;hour++){
            for(int minute=0;minute<60;minute++){
                for(int s=0;s<60;s++){
                    System.out.println("                          "+hour+"��"+minute+"��"+s+"��"+"������...");
                }
            }
        }
        System.out.println("                          24��00��00������Ȼ��������");
    }
}