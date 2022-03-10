package 基础知识.基础.Method;

/*
=========================================================================

方法的三种调用格式。
1. 单独调用：方法名称(参数);
2. 打印调用：System.out.println(方法名称(参数));
3. 赋值调用：数据类型 变量名称 = 方法名称(参数);

=======================================================================================

*/  
public class Method02 {
      public static void main(String[]args){

        System.out.println("============================");

          // 1. 单独调用
          method1();
          System.out.println("============================");

          // 2. 打印调用
          System.out.println("打印调用方法method2()输出结果为"+method2());
          System.out.println("============================");

          // 3. 赋值调用
          int x = method2();
          System.out.println("把method2()方法的返回值"+ x + "赋值给x");
          System.out.println("============================");
      }
//=====================================================================================

      //第一个方法
      public static void method1(){
          int k = 0;
          for(int q = 1; q<=100; q++){
              if( q % 2 ==0){
                  k+=q;
              }
          }
          System.out.println("方法method1()内部输出结果为"+k);
      }

      //第二个方法
      public static int method2(){
          int j=0;
          for(int q = 1;q<=100;q++){
              if(q % 2 != 0){
                  j+=q;
              }
          }

          return j;
      }


  }
  
  