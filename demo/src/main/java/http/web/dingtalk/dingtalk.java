package http.web.dingtalk;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import com.fasterxml.jackson.databind.ObjectMapper;
import http.web.Util.DingUtil;
import http.web.Util.HttpUtil;
import http.web.dingtalk.baen.DingtalkBean;
import http.web.dingtalk.baen.NoticeDetailBean.NoticeDetailBean;

import java.util.*;

/**
 * @program: demo
 * @description: 叮叮消息推送
 * @author: 闫国栋
 * @create: 2022-08-13 21:05
 **/

public class dingtalk {
    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, InterruptedException {
        for (int i=0;i<i+1;i++){
            Thread.sleep(1000);
            cs();
        }
    }
    public static  void cs(){
        String returnjson=HttpUtil.httpURLConnectionPOST("POST","http://h5.skycat.net.cn/api/works/getMarketWorksPage","{\"condition\":{\"name\":\"\",\"productType\":\"WORKS\",\"sortRule\":\"PRICE\",\"sortType\":\"ASC\",\"studioId\":\"\",\"worksName\":\"\",\"topicId\":69},\"pageNum\":1,\"pageSize\":10}","NFT_TOKEN=12af352d-75de-4ba2-9b3e-69ba3385b4b8");

        System.out.println("调用获取："+returnjson);
        System.out.println("调用获取："+HttpUtil.convertUnicodeToCh(returnjson));
        List<http.web.dingtalk.baen.Lists> list1=null;
        List<http.web.dingtalk.baen.NoticeDetailBean.Lists> list11=null;
        try{
            ObjectMapper objectMapper=new ObjectMapper();
            DingtalkBean studentList=objectMapper.readValue(returnjson, DingtalkBean.class);
            list1 =studentList.getData().getList();
            Set<Integer> hh=new TreeSet<>(Comparator.naturalOrder());
            for (int i=0;i<list1.size();i++){
                http.web.dingtalk.baen.Lists ss=list1.get(i);
                hh.add(ss.getPrice());
            }
            Integer[] a=hh.toArray(new Integer[0]);
            if(a[0]<300){
                DingUtil.sendMsg("阿枫提示：\n商品名称：鹏起；当前地板价格为："+a[0]+"元\n抄底了！！！冲");
            }else{
                System.out.println("未触发地板价300，不做消息推送！！！！");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
