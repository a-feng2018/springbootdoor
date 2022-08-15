/**
  * Copyright 2022 bejson.com 
  */
package http.web.snapup.bean;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import http.web.snapup.CustomJsonDateDeserializer;

/**
 * Auto-generated: 2022-08-11 10:26:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class SnapupBean {

    private boolean success;
    private int statusCode;
    private String message;
    private Data data;
    private String code;
    public void setSuccess(boolean success) {
         this.success = success;
     }
     public boolean getSuccess() {
         return success;
     }

    public void setStatusCode(int statusCode) {
         this.statusCode = statusCode;
     }
     public int getStatusCode() {
         return statusCode;
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

    public void setCode(String code) {
         this.code = code;
     }
     public String getCode() {
         return code;
     }

}