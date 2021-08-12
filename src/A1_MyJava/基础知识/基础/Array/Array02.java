package A1_MyJava.基础知识.基础.Array;

/*
1：求数组中元素的max值或者min值
2：数组反转

*/
public class Array02 {
    public static void main(String[] args) {
        int [] array = new int[]{156,48,864,64,51,665,645,89,49,949165};

        //求数组array中的max值      //调用方法arraymax
        System.out.println("数组array中的max值为："+arraymax(array));
        System.out.println("=====================================");

        //同理 求数组array中的min值  //调用方法arraymin
        System.out.println("数组array中的min值为："+arraymin(array));
        System.out.println("=====================================");
        
        //重点！！！！求array数组的反转！！！！  
        System.out.println("原数组为：");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("=====================================");
        System.out.println("反转后的数组为：");
        fanzhuanarray(array);    //调用放法fanzhuanarray
        System.out.println("尴尬酱万岁>.<");
        
    }

    // 方法求 max
    public static int arraymax(int [] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    //方法求 min
    public static int arraymin(int [] array){
        int min =array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    //方法求 反转
    public static void fanzhuanarray(int [] array){
        for(int min = 0, max = array.length-1; max >= min ;max--,min++){
            int ling = array[min];
            array[min] = array[max];
            array[max] = ling;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
