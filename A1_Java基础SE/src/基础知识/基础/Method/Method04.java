package ����֪ʶ.����.Method;

/*

ʹ�÷�����ʱ��ע�����

1. ����Ӧ�ö������൱�У����ǲ����ڷ��������ٶ��巽��������Ƕ�ס�
2. ���������ǰ��˳������ν��
3. ��������֮�󲻻�ִ�У����ϣ��ִ�У�һ��Ҫ���ã��������á���ӡ���á���ֵ���á�
4. ��������з���ֵ����ô����д�ϡ�return ����ֵ;��������û�С�
5. return����ķ���ֵ���ݣ�����ͷ����ķ���ֵ���ͣ���Ӧ������
6. ����һ��voidû�з���ֵ�ķ���������дreturn����ķ���ֵ��ֻ��дreturn�Լ���
7. ����void�����������һ�е�return����ʡ�Բ�д��
8. һ���������п����ж��return��䣬���Ǳ��뱣֤ͬʱֻ��һ���ᱻִ�е�������return������д��

 */
public class Method04 {

    public static int method1() {
        return 10;
    }

    public static void method2() {
//        return 10; // �����д��������û�з���ֵ��return����Ͳ���д����ֵ��
        return; // û�з���ֵ��ֻ�ǽ���������ִ�ж��ѡ�
    }

    public static void method3() {
        System.out.println("AAA");
        System.out.println("BBB");
//        return; // ���һ�е�return����ʡ�Բ�д��
    }

    public static int getMax(int a, int b) {
        /*int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        return max;*/

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

}