package A1_MyJava.����֪ʶ.�ӿ�.Interface09����;

public class Laptop {

    public void powerOn(){
        System.out.println("�򿪵���");
    }

    public void powerOff(){
        System.out.println("�رյ���");
    }

    //����USB�豸
    public void useDevice(USB usb){
        usb.open();  //���豸

        //����ת�ͣ�ʹ��USB�豸���еĹ��ܡ�
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }else if(usb instanceof UsbLight){
            UsbLight usbLight = (UsbLight) usb;
            usbLight.adjust();
        }

        usb.close(); //�ر��豸
    }

}
