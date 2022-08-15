/**
  * Copyright 2022 bejson.com 
  */
package http.web.snapup.bean;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import http.web.snapup.CustomJsonDateDeserializer;

import java.util.Date;

/**
 * Auto-generated: 2022-08-11 10:26:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Items {

    private String id;
    private String groupId;
    private String groupName;
    private String commodityNo;
    private String contractAddress;
    private String chainToken;
    private int saleStatus;
    private String saleStatusName;
    private int dbOriginPrice;
    private int originPrice;
    private long dbPrice;
    private String memberCommodityId;
    private int price;
    private int creatorId;
    private String creatorName;
    private String headPortraitUrl;
    private String sellTime;
    private int publishNumber;
    private long ownerId;
    private String ownerName;
    private String ownerHeadPortraitUrl;
    private int chainStatus;
    private String tradeTime;

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    private Date openTime;
    private int lockDays;
    private String resourceUrl;
    private String previewUrl;
    private int commodityType;
    private String commodityTypeName;
    private int salesMethod;
    private String salesMethodName;
    private int saleNumber;
    private int fileType;
    private String fileTypeName;
    private String description;
    private String descriptionMobile;
    private int contractType;
    private String contractTypeName;
    private int commodityCategoryId;
    private String commodityCategoryName;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setGroupId(String groupId) {
         this.groupId = groupId;
     }
     public String getGroupId() {
         return groupId;
     }

    public void setGroupName(String groupName) {
         this.groupName = groupName;
     }
     public String getGroupName() {
         return groupName;
     }

    public void setCommodityNo(String commodityNo) {
         this.commodityNo = commodityNo;
     }
     public String getCommodityNo() {
         return commodityNo;
     }

    public void setContractAddress(String contractAddress) {
         this.contractAddress = contractAddress;
     }
     public String getContractAddress() {
         return contractAddress;
     }

    public void setChainToken(String chainToken) {
         this.chainToken = chainToken;
     }
     public String getChainToken() {
         return chainToken;
     }

    public void setSaleStatus(int saleStatus) {
         this.saleStatus = saleStatus;
     }
     public int getSaleStatus() {
         return saleStatus;
     }

    public void setSaleStatusName(String saleStatusName) {
         this.saleStatusName = saleStatusName;
     }
     public String getSaleStatusName() {
         return saleStatusName;
     }

    public void setDbOriginPrice(int dbOriginPrice) {
         this.dbOriginPrice = dbOriginPrice;
     }
     public int getDbOriginPrice() {
         return dbOriginPrice;
     }

    public void setOriginPrice(int originPrice) {
         this.originPrice = originPrice;
     }
     public int getOriginPrice() {
         return originPrice;
     }

    public void setDbPrice(long dbPrice) {
         this.dbPrice = dbPrice;
     }
     public long getDbPrice() {
         return dbPrice;
     }

    public void setMemberCommodityId(String memberCommodityId) {
         this.memberCommodityId = memberCommodityId;
     }
     public String getMemberCommodityId() {
         return memberCommodityId;
     }

    public void setPrice(int price) {
         this.price = price;
     }
     public int getPrice() {
         return price;
     }

    public void setCreatorId(int creatorId) {
         this.creatorId = creatorId;
     }
     public int getCreatorId() {
         return creatorId;
     }

    public void setCreatorName(String creatorName) {
         this.creatorName = creatorName;
     }
     public String getCreatorName() {
         return creatorName;
     }

    public void setHeadPortraitUrl(String headPortraitUrl) {
         this.headPortraitUrl = headPortraitUrl;
     }
     public String getHeadPortraitUrl() {
         return headPortraitUrl;
     }

    public void setSellTime(String sellTime) {
         this.sellTime = sellTime;
     }
     public String getSellTime() {
         return sellTime;
     }

    public void setPublishNumber(int publishNumber) {
         this.publishNumber = publishNumber;
     }
     public int getPublishNumber() {
         return publishNumber;
     }

    public void setOwnerId(long ownerId) {
         this.ownerId = ownerId;
     }
     public long getOwnerId() {
         return ownerId;
     }

    public void setOwnerName(String ownerName) {
         this.ownerName = ownerName;
     }
     public String getOwnerName() {
         return ownerName;
     }

    public void setOwnerHeadPortraitUrl(String ownerHeadPortraitUrl) {
         this.ownerHeadPortraitUrl = ownerHeadPortraitUrl;
     }
     public String getOwnerHeadPortraitUrl() {
         return ownerHeadPortraitUrl;
     }

    public void setChainStatus(int chainStatus) {
         this.chainStatus = chainStatus;
     }
     public int getChainStatus() {
         return chainStatus;
     }

    public void setTradeTime(String tradeTime) {
         this.tradeTime = tradeTime;
     }
     public String getTradeTime() {
         return tradeTime;
     }

    public void setOpenTime(Date openTime) {
         this.openTime = openTime;
     }
     public Date getOpenTime() {
         return openTime;
     }

    public void setLockDays(int lockDays) {
         this.lockDays = lockDays;
     }
     public int getLockDays() {
         return lockDays;
     }

    public void setResourceUrl(String resourceUrl) {
         this.resourceUrl = resourceUrl;
     }
     public String getResourceUrl() {
         return resourceUrl;
     }

    public void setPreviewUrl(String previewUrl) {
         this.previewUrl = previewUrl;
     }
     public String getPreviewUrl() {
         return previewUrl;
     }

    public void setCommodityType(int commodityType) {
         this.commodityType = commodityType;
     }
     public int getCommodityType() {
         return commodityType;
     }

    public void setCommodityTypeName(String commodityTypeName) {
         this.commodityTypeName = commodityTypeName;
     }
     public String getCommodityTypeName() {
         return commodityTypeName;
     }

    public void setSalesMethod(int salesMethod) {
         this.salesMethod = salesMethod;
     }
     public int getSalesMethod() {
         return salesMethod;
     }

    public void setSalesMethodName(String salesMethodName) {
         this.salesMethodName = salesMethodName;
     }
     public String getSalesMethodName() {
         return salesMethodName;
     }

    public void setSaleNumber(int saleNumber) {
         this.saleNumber = saleNumber;
     }
     public int getSaleNumber() {
         return saleNumber;
     }

    public void setFileType(int fileType) {
         this.fileType = fileType;
     }
     public int getFileType() {
         return fileType;
     }

    public void setFileTypeName(String fileTypeName) {
         this.fileTypeName = fileTypeName;
     }
     public String getFileTypeName() {
         return fileTypeName;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setDescriptionMobile(String descriptionMobile) {
         this.descriptionMobile = descriptionMobile;
     }
     public String getDescriptionMobile() {
         return descriptionMobile;
     }

    public void setContractType(int contractType) {
         this.contractType = contractType;
     }
     public int getContractType() {
         return contractType;
     }

    public void setContractTypeName(String contractTypeName) {
         this.contractTypeName = contractTypeName;
     }
     public String getContractTypeName() {
         return contractTypeName;
     }

    public void setCommodityCategoryId(int commodityCategoryId) {
         this.commodityCategoryId = commodityCategoryId;
     }
     public int getCommodityCategoryId() {
         return commodityCategoryId;
     }

    public void setCommodityCategoryName(String commodityCategoryName) {
         this.commodityCategoryName = commodityCategoryName;
     }
     public String getCommodityCategoryName() {
         return commodityCategoryName;
     }

}