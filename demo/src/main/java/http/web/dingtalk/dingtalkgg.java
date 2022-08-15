package http.web.dingtalk;

import com.fasterxml.jackson.databind.ObjectMapper;
import http.web.Util.DingUtil;
import http.web.Util.HttpUtil;
import http.web.dingtalk.baen.DingtalkBean;
import http.web.dingtalk.baen.Lists;
import http.web.dingtalk.baen.NoticeDetailBean.NoticeDetailBean;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @program: demo
 * @description:
 * @author: 闫国栋
 * @create: 2022-08-13 23:53
 **/

public class dingtalkgg {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0;i<i+1;i++){
            Thread.sleep(10000);
            cs();
        }
    }
    public static  void cs(){
        String returngonggaojson=HttpUtil.httpURLConnectionPOST("POST","http://h5.skycat.net.cn/api/notice/getNoticeDetail","{\"pageNum\":1,\"pageSize\":10,\"condition\":{}}","NFT_TOKEN=12af352d-75de-4ba2-9b3e-69ba3385b4b8");

        System.out.println("调用获取："+returngonggaojson);
        List<Lists> list1=null;
        List<http.web.dingtalk.baen.NoticeDetailBean.Lists> list11=null;
        try{
            ObjectMapper objectMappe1r=new ObjectMapper();
            NoticeDetailBean NoticeDetailBean=objectMappe1r.readValue(returngonggaojson, NoticeDetailBean.class);
            list11=NoticeDetailBean.getData().getList();
            for (int i=0;i<list11.size();i++){
                http.web.dingtalk.baen.NoticeDetailBean.Lists ss=list11.get(i);
                if(ss.getId()>20){
                    DingUtil.sendMsg("阿枫sky公告提示：\n公告名称："+ss.getTitle()+"；\n公告内容："+ss.getContent().replace("&rdquo;","").replace("&ldquo;","").replace("</p>","").replace("<p>","").replace("&nbsp;","").replace("<br />","\n")+";\n抄底了！！！冲");
                }else{
                    System.out.println("未发现新的公告，不做消息推送！！！！");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
