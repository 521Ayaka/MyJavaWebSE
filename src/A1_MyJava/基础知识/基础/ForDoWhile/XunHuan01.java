package A1_MyJava.基础知识.基础.ForDoWhile;
/*
三种循环的格式：

1：for循环        for(初始化表达式①; 布尔表达式②; 步进表达式④){
                      循环体;
                  }

2：while          初始化表达式 //可有可无
                  while(布尔表达式){
                       循环体;
                       步进表达式  //可有可无
                  }                //当上面两个可有可无的都有时，相当于for循环

3：do-while       初始化表达式;
                  do{
                      循环体;
                      步进表达式;
                  }while(布尔表达式);

=========================================================================================

三种循环的区别。

1. 如果条件判断重来没有满足过，那么for和while循环将会一次都不执行，但do-while循环执行至少一次
2. for循环的变量在小括号当中定义，只有循环内部才可以使用
           int x = 0;
           for(int i1=1;i1 <= 100;i1++){
               if(i1 % 2 ==0){
                  x = x + i1;
                }
            }
            System.out.println(i1);       //这个条语句就是错误的，因为i1是在for里面定义的  当然以后可以继续定义一个i1
    但是while循环和de-while循环初始化语句本来就在外面，所以出循环后可以继续使用

==========================================================================================

for可以用 break return continue

 */
public class XunHuan01{
    public static void main(String[]args){
        System.out.println("==========================循环题==============================");
        //求100以内的偶数和

        //使用for循环
        int x = 0;
        for(int i1=1;i1 <= 100;i1++){
            if(i1 % 2 ==0){
               x = x + i1;
            }
        }
        System.out.println("for结果为"+x);

        //使用while循环                                               
        int y = 0;
        int i2 = 1;
        while (i2 <= 100){
           if(i2 % 2 ==0){
               y = y + i2;
           }
           i2++;
        }
        System.out.println("while结果为"+y);

        //do-while试试
        int z =0;
        int i3 =2;
        do{
            z = z + i3;
            i3+=2;
        }while(i3<=100);
        System.out.println("do-while结果为"+z);
        System.out.println("==========================================");

//============================================================================================

        // for里面可以使用break进行中断
        for(int i =1; i<=10 ; i++){
            System.out.println(i+"===尴尬万岁==="+i);
            if(i==6){
                break;
            }
        }
        System.out.println("===========================");

        //fou里面使用continue进行跳过
        for (int i = 1; i < 10; i++) {
            if(i % 2 != 0){
                continue;
            }else{
                System.out.println(i+"===尴尬万岁==="+i);
            }
            
        }
        System.out.println("==========================");

        //fou里面使用reburn进行中断
        for (int i = 1; i < 10; i++) {
            System.out.println(i+"===尴尬万岁=="+i);
            if(i>=6){
                return;
            }  //  一般不用这个 如果在一个方法中 return会结束返回该方法
        }
        //下面再在这个方法里面写代码是不会运行的，因为return已经中断返回该方法了
        System.out.println("都怪return，我不能运行显示了/好气鸭");

    }
}
