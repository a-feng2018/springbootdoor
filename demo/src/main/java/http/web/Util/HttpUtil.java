package http.web.Util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: demo
 * @description: 工具栏
 * @author: 闫国栋
 * @create: 2022-08-13 21:14
 **/

public class HttpUtil {
    /**
     * http请求获取数据
     *
     * @param
     * @param
     * @param
     * @return
     */
    public static String httpURLConnectionPOST(String dingUrl,String reqStr) {
        StringBuffer strBf = new StringBuffer();
        try {
            URL realUrl = new URL(dingUrl);
            //将realUrl以 open方法返回的urlConnection  连接强转为HttpURLConnection连接  (标识一个url所引用的远程对象连接)
            //此时cnnection只是为一个连接对象,待连接中
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            //设置连接输出流为true,默认false (post请求是以流的方式隐式的传递参数)
            connection.setDoOutput(true);
            //设置连接输入流为true
            connection.setDoInput(true);
            //设置请求方式为post
            connection.setRequestMethod("POST");
            //post请求缓存设为false
            connection.setUseCaches(false);
            //设置该HttpURLConnection实例是否自动执行重定向
            connection.setInstanceFollowRedirects(true);
            //设置请求头里面的各个属性 (以下为设置内容的类型,设置为经过urlEncoded编码过的from参数)
            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//            if (!"".equals(token)) {
//                //设置token请求头信息
//                connection.setRequestProperty("Authorization", "Bearer " + token);
//            }
            //建立连接 (请求未开始,直到connection.getInputStream()方法调用时才发起,以上各个参数设置需在此方法之前进行)
            connection.connect();
            //创建输入输出流,用于往连接里面输出携带的参数,(输出内容为?后面的内容)
            DataOutputStream dataout = new DataOutputStream(connection.getOutputStream());
            String query = reqStr.toString();
            //将参数输出到连接
            dataout.write(query.getBytes("UTF-8"));
            // 输出完成后刷新并关闭流
            dataout.flush();
            dataout.close(); // 重要且易忽略步骤 (关闭流,切记!)
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                strBf.append(lines);
            }
            reader.close();
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strBf.toString();
    }
    public static String httpURLConnectionPOST(String postandget,String url, String data, String token) {
        StringBuffer strBf = new StringBuffer();
        try {
            URL realUrl = new URL(url);
            //将realUrl以 open方法返回的urlConnection  连接强转为HttpURLConnection连接  (标识一个url所引用的远程对象连接)
            //此时cnnection只是为一个连接对象,待连接中
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            //设置连接输出流为true,默认false (post请求是以流的方式隐式的传递参数)
            connection.setDoOutput(true);
            //设置连接输入流为true
            connection.setDoInput(true);
            //设置请求方式为post
            connection.setRequestMethod(postandget);
            //post请求缓存设为false
            connection.setUseCaches(false);
            //设置该HttpURLConnection实例是否自动执行重定向
            connection.setInstanceFollowRedirects(true);
            connection.setRequestProperty("User-Agent", "Mozilla/4.0 compatible; MSIE 5.0;Windows NT; DigExt)");//（主要是这一句）
            //设置请求头里面的各个属性 (以下为设置内容的类型,设置为经过urlEncoded编码过的from参数)
            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
            if (!"".equals(token)) {
                //设置token请求头信息
                connection.setRequestProperty("cookie", token);
            }
            //建立连接 (请求未开始,直到connection.getInputStream()方法调用时才发起,以上各个参数设置需在此方法之前进行)
            connection.connect();
            //创建输入输出流,用于往连接里面输出携带的参数,(输出内容为?后面的内容)
            DataOutputStream dataout = new DataOutputStream(connection.getOutputStream());
            String query = data.toString();
            //将参数输出到连接
            dataout.write(query.getBytes("UTF-8"));
            // 输出完成后刷新并关闭流
            dataout.flush();
            dataout.close(); // 重要且易忽略步骤 (关闭流,切记!)
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
            String lines;
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "GBK");
                strBf.append(lines);
            }
            reader.close();
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strBf.toString();
    }
    public static String convertUnicodeToCh(String str) {
        Pattern pattern = Pattern.compile("(\\\\u(\\w{4}))");
        Matcher matcher = pattern.matcher(str);

        // 迭代，将str中的所有unicode转换为正常字符
        while (matcher.find()) {
            String unicodeFull = matcher.group(1); // 匹配出的每个字的unicode，比如\u67e5
            String unicodeNum = matcher.group(2); // 匹配出每个字的数字，比如\u67e5，会匹配出67e5

            // 将匹配出的数字按照16进制转换为10进制，转换为char类型，就是对应的正常字符了
            char singleChar = (char) Integer.parseInt(unicodeNum, 16);

            // 替换原始字符串中的unicode码
            str = str.replace(unicodeFull, singleChar + "");
        }
        return str;
    }
}
