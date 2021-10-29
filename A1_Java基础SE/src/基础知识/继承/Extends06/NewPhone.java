package 基础知识.继承.Extends06;

public class NewPhone extends Phone {
    public NewPhone() {
    }

    @Override  //覆盖重写新的方法，实现新功能。//新功能在show方法里多的功能，覆盖重写
    public void show() {

        //super.覆盖重写老功能的方法名。
        super.show(); //调用父类的show()方法，原有的功能。

        //super后的先功能。
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
