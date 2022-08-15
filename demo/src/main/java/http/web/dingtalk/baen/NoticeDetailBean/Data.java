/**
  * Copyright 2022 bejson.com 
  */
package http.web.dingtalk.baen.NoticeDetailBean;
import java.util.List;

/**
 * Auto-generated: 2022-08-13 22:47:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private int pageNum;
    private int pageSize;
    private int totalPage;
    private int total;
    private List<Lists> list;
    public void setPageNum(int pageNum) {
         this.pageNum = pageNum;
     }
     public int getPageNum() {
         return pageNum;
     }

    public void setPageSize(int pageSize) {
         this.pageSize = pageSize;
     }
     public int getPageSize() {
         return pageSize;
     }

    public void setTotalPage(int totalPage) {
         this.totalPage = totalPage;
     }
     public int getTotalPage() {
         return totalPage;
     }

    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setList(List<Lists> list) {
         this.list = list;
     }
     public List<Lists> getList() {
         return list;
     }

}