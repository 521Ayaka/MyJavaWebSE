package A1_MyJava.基础知识.网络编程.网络通信.TCP协议.TCP通信服务端口多线程;

import java.io.*;
import java.net.Socket;

public class MyServerReceive implements Runnable{
    //用户对象Socket
    private Socket s;

    public MyServerReceive(Socket s){
        this.s = s;
    }

    @Override
    public void run() {

        //接收数据   实现反馈
        try (   BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
                BufferedWriter bw =
                        new BufferedWriter(
                        new FileWriter(
                        new File("src\\A1_MyJava\\基础知识\\网络编程\\网络通信\\TCP协议\\TCP通信服务端口多线程\\服务器接收文件\\"
                                +Thread.currentThread().getName()+".txt")));
                BufferedWriter bwx = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
                ){



            //接收数据 写入到接收文件夹中
            String data;
            while ( (data = br.readLine())!=null ){
                bw.write(data);
                bw.newLine();
                bw.flush();
            }
            System.out.println("接收到:"+Thread.currentThread().getName()+"用户,文件copy成功");
            //反馈用户链接
            bwx.write("已接收到连接请求,文件上传成功！");
            bwx.newLine();
            bwx.flush();

        }catch(IOException e){
            e.printStackTrace();
        }


    }


}
