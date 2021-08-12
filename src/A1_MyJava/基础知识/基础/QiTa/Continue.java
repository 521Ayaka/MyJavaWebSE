package A1_MyJava.基础知识.基础.QiTa;

class GetSet {
    public static void main(String[]args){
        for(int i=1 ;i <= 10 ; i++ ){
            if(i==4){
                continue;
            }
            System.out.printf("%d楼到啦！\n",i); //一定一定要注意 循环体要在if判断后
        }
    }
}
