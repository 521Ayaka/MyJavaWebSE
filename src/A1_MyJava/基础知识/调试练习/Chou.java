package A1_MyJava.����֪ʶ.������ϰ;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Chou {

    public static RewardBean rb = new RewardBean();
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();

    //��һ��map��ͳ�Ƽ�¼
    private static Map<String,Integer> map = new HashMap<String,Integer>();

    public static void main(String[] args) {

        System.out.println("������1���������10��ʮ����,����0�˳�");
        //����û������1����10

        //��ʼ��map
        map.put("����",0);
        map.put("����",0);
        map.put("����",0);
        //���׼�����
        map.put("count4",0);
        map.put("count5",0);

//        System.out.println(map.toString());

        boolean flag = true;
        while (flag) {
            int coin = sc.nextInt();

            switch (coin) {
                case 1: {
                    run();
                    break;
                }
                case 10: {
                    for (int i=0 ; i<10 ; i++){
                        run();
                    }
                    break;
                }
                default:
                    System.out.println("�˳�������");
                    flag=false;
                    break;
            }
            System.out.println(map.toString());
        }

    }

    //ģ��鿨����
    private static void run(){
        /*���һ�����֣��������ֵ�ֵ�ķ�Χ���������ʲô����α�����
        0��5��5�ǣ�0.6%��
        10��60��4�ǣ�5.1%��
        ������3��*/
        int ran1 = random.nextInt(1000);

        /*System.out.println("run����");
        System.out.println(map.toString());*/
        int count4 = map.get("count4");
        int count5 = map.get("count5");

        //�ȿ��Ƿ���4�Ǳ��ף�����ͬʱû��5�Ǳ��ף���Ϊ����ͬʱ���׻�ѡ�񴥷�5�ǵı��ף����Բ������4�ǣ�
        //��4�Ǽ������ﵽ9����ʱ�����Ҳ�����5����ʱ���������׻���:0.06%Ϊ5,99.4%Ϊ4
        if(count4 >= 9 && count5 < 89){
            System.out.println("����4�Ǳ��ף�������Ϊ��"+count4);
            Random random4 = new Random();
            int ran4 = random4.nextInt(1000);
            if(ran4 < 6){
                rb.get(5);
                int num = map.get("����");
                //��5�Ǻ�5�Ǳ��׼�����count5����
                map.put("����",num+1);
                map.put("count5",0);
            }else{
                rb.get(4);
                int num = map.get("����");
                //��4�ǣ�5�Ǳ��׼�����count5+1
                map.put("����",num+1);
                map.put("count5",count5+1);
            }
            //4�Ǳ�������
            map.put("count4",0);
        }
        //�������Ϊ0��5��0.6%���ʣ�����5�Ǳ������ﵽ89����90��5����ʱ�򣬳���5��
        else if (ran1 < 6 || count5 == 89) {
            System.out.println("��5���ˣ�������Ϊ��"+count5);
            rb.get(5);
            int num = map.get("����");
            //��5�Ǻ󣬼�����count5����
            map.put("����",num+1);
            map.put("count5",0);
            //4�Ǳ��׼���+1
            map.put("count4",count4+1);
        }

        //�������Ϊ10��60ʱ��5.1%���ʣ�ʱ������4��
        else if ((10 <= ran1 && ran1 < 61) ) {
            System.out.println("��4����,�Ǳ��ף�������Ϊ��"+count4);
            rb.get(4);
            int num = map.get("����");
            map.put("����",num+1);
            //����������
            map.put("count4",0);
            //5�Ǳ��׼���+1
            map.put("count5",count5+1);
        }
        //3����������׼�����+1
        else {
            rb.get(3);
            //��3�ǵ�ʱ��45�Ǳ��׼�����+1
            map.put("count4",count4+1);
            map.put("count5",count5+1);
        }
        map.put("����",map.get("����")+1);
        System.out.println("============================");
    }

    //�ڲ���
    public static class RewardBean {

        public void get(int level){
            //�����Ǽ���ӡ������Ʒ
            for(int i = 0 ; i < level ; i++){
                System.out.print("��");
                if(i == level-1){
                    System.out.println("��Ʒ");
                }
            }

        }
    }
}
