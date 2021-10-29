package ����֪ʶ.�ӿ�.Interface09����;

public class InterfaceMain {

    public static void main(String[] args) {

        //�����ʼǱ����Զ���
        Laptop laptop = new Laptop();

        laptop.powerOn();  //�򿪵���

        System.out.println("=========");
        //��һ�ַ���: ʹ�ö�̬���ӿ�����ָ��ʵ�������
        USB usb = new Mouse();
        laptop.useDevice(usb);

        System.out.println("=========");
        //�ڶ��ַ���: û��ʹ�ö�̬�����Ƿ����������ʱ��Ҳ���Զ�����ת�͡�
        Keyboard keyboard = new Keyboard();
        laptop.useDevice(keyboard);//                      keyboard ---> usb    Ҳ���Զ�����ת��Ϊusb

        System.out.println("=========");
        //���� Ҳ�����������������Ϊ��:
        laptop.useDevice(new UsbLight());//       ͬ��:     new UsbLight() ---> usb Ҳ���Զ�����ת��Ϊusb

        System.out.println("=========");

        laptop.powerOff(); //�رյ���

        System.out.println("==========================================================================================");

        method(10.0);//                       �ͱ���:  int ---> double
        int num = 10;
        method((double) num); //������ת��Ϊdouble           int ----> double

    }

    public static void method(Double num){
        System.out.println(num);
    }

}
