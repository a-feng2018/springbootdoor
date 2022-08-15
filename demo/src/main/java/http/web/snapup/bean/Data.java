/**
  * Copyright 2022 bejson.com 
  */
package http.web.snapup.bean;
import java.util.List;

/**
 * Auto-generated: 2022-08-11 10:26:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Data {

    private int pageIndex;
    private int pageSize;
    private String totalCount;
    private int totalPages;
    private int indexFrom;
    private List<Items> items;
    private boolean hasPreviousPage;
    private boolean hasNextPage;
    public void setPageIndex(int pageIndex) {
         this.pageIndex = pageIndex;
     }
     public int getPageIndex() {
         return pageIndex;
     }

    public void setPageSize(int pageSize) {
         this.pageSize = pageSize;
     }
     public int getPageSize() {
         return pageSize;
     }

    public void setTotalCount(String totalCount) {
         this.totalCount = totalCount;
     }
     public String getTotalCount() {
         return totalCount;
     }

    public void setTotalPages(int totalPages) {
         this.totalPages = totalPages;
     }
     public int getTotalPages() {
         return totalPages;
     }

    public void setIndexFrom(int indexFrom) {
         this.indexFrom = indexFrom;
     }
     public int getIndexFrom() {
         return indexFrom;
     }

    public void setItems(List<Items> items) {
         this.items = items;
     }
     public List<Items> getItems() {
         return items;
     }

    public void setHasPreviousPage(boolean hasPreviousPage) {
         this.hasPreviousPage = hasPreviousPage;
     }
     public boolean getHasPreviousPage() {
         return hasPreviousPage;
     }

    public void setHasNextPage(boolean hasNextPage) {
         this.hasNextPage = hasNextPage;
     }
     public boolean getHasNextPage() {
         return hasNextPage;
     }

}