package ����֪ʶ.���.Random;

import java.util.Random;

/*

��ȡһ�������int���֣���Χ��int���з�Χ�����������֣���int num = r.nextInt()
��ȡһ�������int���֣����������˷�Χ������ҿ����䣩��int num = r.nextInt(3)
ʵ���ϴ���ĺ����ǣ�[0,3)��Ҳ����0~2

���㣺�����ΧΪ [10��80] ֮���int����
 */
public class Random02 {
    public static void main(String[] args) {
        Random r = new Random();
        int x;
        for (int i = 0; i < 100; i++) {
            x = r.nextInt(71) + 10;
            System.out.println("[10,80]֮��������Ϊ��" + x);
        }

    }
}
