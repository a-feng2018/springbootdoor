/**
  * Copyright 2022 bejson.com 
  */
package http.web.dingtalk.baen;

/**
 * Auto-generated: 2022-08-13 21:52:37
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class DingtalkBean {

    private int code;
    private String message;
    private Data data;
    private String otherInfo;
    public void setCode(int code) {
         this.code = code;
     }
     public int getCode() {
         return code;
     }

    public void setMessage(String message) {
         this.message = message;
     }
     public String getMessage() {
         return message;
     }

    public void setData(Data data) {
         this.data = data;
     }
     public Data getData() {
         return data;
     }

    public void setOtherInfo(String otherInfo) {
         this.otherInfo = otherInfo;
     }
     public String getOtherInfo() {
         return otherInfo;
     }

}