package 基础知识.类库.LeiShuoming;
/*

*/

public class Lei02 {
    
    String ganga = "原谅我吧，我错了";

    public int method (int k) {

        for(int i = 1; i < 10; i++ ){
            k += i;
        }
        return k ;
    }

    public void arraystostring(String[] array){
        for(int min = 0, max = array.length-1; max >= min ;max--,min++){
            String ling = array[min];
            array[min] = array[max];
            array[max] = ling;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

	public static void fun(String string) {
	}
    
}
