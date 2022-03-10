package 基础知识.接口.Interface09案例;

public class Laptop {

    public void powerOn(){
        System.out.println("打开电脑");
    }

    public void powerOff(){
        System.out.println("关闭电脑");
    }

    //调用USB设备
    public void useDevice(USB usb){
        usb.open();  //打开设备

        //向下转型，使用USB设备特有的功能。
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

        usb.close(); //关闭设备
    }

}
