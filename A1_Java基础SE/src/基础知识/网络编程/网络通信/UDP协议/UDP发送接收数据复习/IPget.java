package ����֪ʶ.������.����ͨ��.UDPЭ��.UDP���ͽ������ݸ�ϰ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:
 * @create: 2019-11-07 18:11
 **/
public class IPget {

    /**
     * ����ip��ַ
     */
    private static String publicIp;

    /**
     * ����url���ص�ַ������ip��ַ��Ϊ��ֹĳ��urlʧЧ��
     * ����url��ȡip��ַ����һ���ܳɹ���ȡ�ͷ���
     */
    private static String[] urls = {
            "http://whatismyip.akamai.com",
            "http://icanhazip.com",
            "http://members.3322.org/dyndns/getip",
            "http://checkip.dyndns.com/",
            "http://pv.sohu.com/cityjson",
            "http://ip.taobao.com/service/getIpInfo.php?ip=myip",
            "http://www.ip168.com/json.do?view=myipaddress",
            "http://www.net.cn/static/customercare/yourip.asp",
            "http://ipecho.net/plain",
            "http://myip.dnsomatic.com",
            "http://tnx.nl/ip",
            "http://ifconfig.me"
    };

    /**
     * ip��ַ��ƥ��������ʽ
     */
    private static String regEx = "((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";

    private static Pattern pattern = Pattern.compile(regEx);

    /**
     * ��ȡ����������ַ
     *
     * @return
     */
    public static String getSelfPublicIp() {
        if (publicIp != null && !"".equals(publicIp.trim())) {
            return publicIp;
        }
        for (String url : urls) {
            //http����url��ȡ��ip����Ϣ
            String result = getUrlResult(url);
            //����ƥ�����ip��ַ
            Matcher m = pattern.matcher(result);
            while (m.find()) {
                publicIp = m.group();
//                System.out.println(url + " ==> " + publicIp);
                //ֻ��ȡƥ�䵽�ĵ�һ��IP��ַ
                return publicIp;
            }
        }
        return null;
    }

    /**
     * http����url
     */
    private static String getUrlResult(String url) {
        StringBuilder sb = new StringBuilder();
        BufferedReader in = null;
        try {
            URL realUrl = new URL(url);
            URLConnection connection = realUrl.openConnection();
            connection.setConnectTimeout(1000);
            connection.setReadTimeout(1000);
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
//            System.out.println(e.getMessage());
            return "";
        }
        return sb.toString();
    }

    /**
     * ����
     * @param args
     */
    public static void main(String[] args){
        System.out.println(getSelfPublicIp());
    }
}

