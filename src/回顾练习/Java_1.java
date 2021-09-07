package »Ø¹ËÁ·Ï°;

import java.io.*;

public class Java_1
{
    public static void main(String args[])
    {
        int a=2,b=3,c=1,m;

        if(a>b){
            //*********Found**********
            if(c<b)
                m=b;
            else
                //*********Found**********
                m=(a>c)? c:a;
        }else{
            if(a>c)
                //*********Found**********
                m=a;
            else
                m=(b>c)? c:b;
        }
        //*********Found**********
        System.out.println("median = " + m);

    }
}