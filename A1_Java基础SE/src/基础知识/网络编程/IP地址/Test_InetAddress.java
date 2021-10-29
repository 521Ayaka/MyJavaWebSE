package 基础知识.网络编程.IP地址;
/*
1.4 InetAddress的使用
为了方便我们对IP地址的获取和操作,Java提供了一个类 InetAddress供我们使用

InetAddress:此类表示 Internet协议(IP)地址

    static InetAddress getByName(String host) 确定主机名称的IP地址。主机名称可以是机器名称,也可以是IP地址

    String getHostName()       获取此IP地址的主机名

    String getHostAddress()    返回文本显示中的P地址字符串

*/

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test_InetAddress {

    public static void main(String[] args) throws UnknownHostException {

        //static InetAddress getByName(String host)
        //确定主机名称的IP地址。主机名称可以是机器名称,也可以是IP地址
        //需要异常处理
        InetAddress iaIP = InetAddress.getByName("GanGaJiang"/*" 192.168.46.201 "*/);//参数可以是IP 也可以是主机名

        //String getHostName()       获取此IP地址的主机名
        System.out.println("主机名称: " + iaIP.getHostName() + "\n");

        //String getHostAddress()    返回文本显示中的P地址字符串
        System.out.println("主机IP地址: " + iaIP.getHostAddress());

    }

}
