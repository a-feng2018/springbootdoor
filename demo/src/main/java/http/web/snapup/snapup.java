//package http.web.snapup;
//
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import http.web.snapup.bean.Data;
//import http.web.snapup.bean.Items;
//import http.web.snapup.bean.SnapupBean;
//
//import java.io.BufferedReader;
//import java.io.DataOutputStream;
//import java.io.InputStreamReader;
//import java.io.UnsupportedEncodingException;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.util.List;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
///**
// * @program: demo
// * @description: 抢购
// * @author: 闫国栋
// * @create: 2022-08-11 10:08
// **/
//
//public class snapup {
//    public static void main(String[] args) throws UnsupportedEncodingException {
//        for (int i=0;i<i+1;i++){
//            if(httpsup()==true){
//                System.out.println("抢购完成，终止该次动作");
//                return;
//            }
//        }
//    }
//    private static Boolean httpsup() throws UnsupportedEncodingException {
//        Boolean cc=new Boolean(false);
//        String jsonstring="{\"pageIndex\":1,\"pageSize\":1000,\"groupId\":\"220\",\"order\":[{\"fieldName\":\"DbPrice\",\"order\":\"Asc\"}]}";
//        String returnjson=httpURLConnectionPOST("POST","https://m.18art.art/api/agg/market/commodity-items",jsonstring,"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOjEyMzcyMiwiVXNlckluZm8iOiJEclZBVHVMU3NCRUcraVpwWDNMZXlkT3pHTmRmTno3M25BTDJzVmdNWUNXQ3ZVVDlQSlM1SjhneXhXNlp4YUlndDBvUnNYeE1NYTdNc0ZPMnUzWGExcmRKaTVIeENiWFhsMjNpdHVWY3VNOHZDRFd2UXh5eFpTUk9ieUY3YnlKdlN4ZThmSXIxVTk5UGR5Q0tPSHFIWUE9PSIsIm5iZiI6MTY2MDEyNDEyMywiZXhwIjoxNjYwMzQwMTIzLCJpYXQiOjE2NjAxMjQxMjMsImlzcyI6InNoaWJhX2FkbWluIiwiYXVkIjoic2hpYmFfYWRtaW4ifQ.eoIcSSgvYfAxFQyYgfVOiT0rB9Uvv02bk78gMMHN6wo");
//        System.out.println("调用获取："+returnjson.getBytes("UTF-8").toString());
//        System.out.println("调用获取："+returnjson.getBytes("GBK").toString());
//        System.out.println("调用获取："+convertUnicodeToCh(returnjson));
//        SnapupBean stu = null;
//        String list = null;
//        List<Items> list1=null;
//        try {
//            ObjectMapper objectMapper=new ObjectMapper();
//            SnapupBean studentList=objectMapper.readValue(convertUnicodeToCh(returnjson), SnapupBean.class);
//            list=studentList.getMessage();
//            list1 =studentList.getData().getItems();
//            System.out.println("调用获取："+list);
//            System.out.println("调用获取当前报效鸡的商品列表第一个排序分页的产品数量为："+list1.size());
//            for (int i=0;i<list1.size();i++){
//                Items items=list1.get(i);
//                System.out.println("该页所有报效鸡的价格为："+items.getPrice()+",支付状态为："+items.getSaleStatus()+",支付状态名称为："+items.getSaleStatusName()+",产品id为："+items.getId());
//                if(items.getSaleStatus()==3&&items.getPrice()<=12500){
//                    System.out.println("发现状态为3的支付状态为寄售的产品ID为："+items.getId());
//                    System.out.println("调用下单购买接口～～～～～～～～～～～～～～");
//                    String json1string="{\"commodityId\":\""+items.getId()+"\",\"payType\":2,\"addressId\":0}";
//                    String buyjson=httpURLConnectionPOST("GET","https://m.18art.art/api/wagg/order/buy",jsonstring,"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJVc2VySWQiOjEyMzcyMiwiVXNlckluZm8iOiJEclZBVHVMU3NCRUcraVpwWDNMZXlkT3pHTmRmTno3M25BTDJzVmdNWUNXQ3ZVVDlQSlM1SjhneXhXNlp4YUlndDBvUnNYeE1NYTdNc0ZPMnUzWGExcmRKaTVIeENiWFhsMjNpdHVWY3VNOHZDRFd2UXh5eFpTUk9ieUY3YnlKdlN4ZThmSXIxVTk5UGR5Q0tPSHFIWUE9PSIsIm5iZiI6MTY2MDEyNDEyMywiZXhwIjoxNjYwMzQwMTIzLCJpYXQiOjE2NjAxMjQxMjMsImlzcyI6InNoaWJhX2FkbWluIiwiYXVkIjoic2hpYmFfYWRtaW4ifQ.eoIcSSgvYfAxFQyYgfVOiT0rB9Uvv02bk78gMMHN6wo");
//                    System.out.println("调用完成，获取下单结果为："+convertUnicodeToCh(buyjson));
//                    Data buyjson1=objectMapper.readValue(convertUnicodeToCh(buyjson), Data.class);
////                    System.out.println("调用完成，获取下单结果为："+buyjson1.getMessage()+"请求状态码:"+buyjson1.getStatusCode());
////                    if(buyjson1.getStatusCode()==200){
////                        cc=true;
////                    }else{
////                        System.out.println("抢购失败任务继续！！！");
////                    }
//
//                }
//            }
//        } catch (Exception e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        convertUnicodeToCh(returnjson);
//        return cc;
//    }
//    private static String convertUnicodeToCh(String str) {
//        Pattern pattern = Pattern.compile("(\\\\u(\\w{4}))");
//        Matcher matcher = pattern.matcher(str);
//
//        // 迭代，将str中的所有unicode转换为正常字符
//        while (matcher.find()) {
//            String unicodeFull = matcher.group(1); // 匹配出的每个字的unicode，比如\u67e5
//            String unicodeNum = matcher.group(2); // 匹配出每个字的数字，比如\u67e5，会匹配出67e5
//
//            // 将匹配出的数字按照16进制转换为10进制，转换为char类型，就是对应的正常字符了
//            char singleChar = (char) Integer.parseInt(unicodeNum, 16);
//
//            // 替换原始字符串中的unicode码
//            str = str.replace(unicodeFull, singleChar + "");
//        }
//        return str;
//    }
//    /**
//     * http请求获取数据
//     *
//     * @param url 请求的目标地址
//     * @param data 要传递的参数，必须是JSONObject格式
//     * @param token 如果请求的目前地址需要token就传，没有就传个null或""
//     * @return
//     */
//    public static String httpURLConnectionPOST(String postandget,String url, String data, String token) {
//        StringBuffer strBf = new StringBuffer();
//        try {
//            URL realUrl = new URL(url);
//            //将realUrl以 open方法返回的urlConnection  连接强转为HttpURLConnection连接  (标识一个url所引用的远程对象连接)
//            //此时cnnection只是为一个连接对象,待连接中
//            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
//            //设置连接输出流为true,默认false (post请求是以流的方式隐式的传递参数)
//            connection.setDoOutput(true);
//            //设置连接输入流为true
//            connection.setDoInput(true);
//            //设置请求方式为post
//            connection.setRequestMethod(postandget);
//            //post请求缓存设为false
//            connection.setUseCaches(false);
//            //设置该HttpURLConnection实例是否自动执行重定向
//            connection.setInstanceFollowRedirects(true);
//            //设置请求头里面的各个属性 (以下为设置内容的类型,设置为经过urlEncoded编码过的from参数)
//            connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
//            if (!"".equals(token)) {
//                //设置token请求头信息
//                connection.setRequestProperty("Authorization", "Bearer " + token);
//            }
//            //建立连接 (请求未开始,直到connection.getInputStream()方法调用时才发起,以上各个参数设置需在此方法之前进行)
//            connection.connect();
//            //创建输入输出流,用于往连接里面输出携带的参数,(输出内容为?后面的内容)
//            DataOutputStream dataout = new DataOutputStream(connection.getOutputStream());
//            String query = data.toString();
//            //将参数输出到连接
//            dataout.write(query.getBytes("UTF-8"));
//            // 输出完成后刷新并关闭流
//            dataout.flush();
//            dataout.close(); // 重要且易忽略步骤 (关闭流,切记!)
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
//            String lines;
//            while ((lines = reader.readLine()) != null) {
//                lines = new String(lines.getBytes(), "utf-8");
//                strBf.append(lines);
//            }
//            reader.close();
//            connection.disconnect();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return strBf.toString();
//    }
//}
//
