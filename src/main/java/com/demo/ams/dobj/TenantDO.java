package com.demo.ams.dobj;

public class TenantDO {
	
	private int tenantID; 
	private int requestID;
	
	private String tenantName;  
	private String ownerName;
	private int ownerID;  
	private int flatID;
	private String teContactNo; 
	private String teAddrComm;
	private String teAddrPer; 
	private String teAltContactNo;  
	private String teEmailID;
	private String idProofType;
	private String idProofNo;
	private String resideDt;
	private String isVerified;
	private String message;
	private String stayStartDate;
	private String stayEndDate;
	private String flatNO;
	private String isActive;
	public int getRequestID() {
		return requestID;
	}
	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}
	
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	public String getFlatNO() {
		return flatNO;
	}
	public void setFlatNO(String flatNO) {
		this.flatNO = flatNO;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public String getIdProofNo() {
		return idProofNo;
	}
	public void setIdProofNo(String idProofNo) {
		this.idProofNo = idProofNo;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getTenantID() {
		return tenantID;
	}
	public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
	}
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	
	
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public int getFlatID() {
		return flatID;
	}
	public void setFlatID(int flatID) {
		this.flatID = flatID;
	}
	public String getTeAddrComm() {
		return teAddrComm;
	}
	public void setTeAddrComm(String teAddrComm) {
		this.teAddrComm = teAddrComm;
	}
	public String getTeAddrPer() {
		return teAddrPer;
	}
	public void setTeAddrPer(String teAddrPer) {
		this.teAddrPer = teAddrPer;
	}
	
	public String getTeContactNo() {
		return teContactNo;
	}
	public void setTeContactNo(String teContactNo) {
		this.teContactNo = teContactNo;
	}
	public String getTeAltContactNo() {
		return teAltContactNo;
	}
	public void setTeAltContactNo(String teAltContactNo) {
		this.teAltContactNo = teAltContactNo;
	}
	public String getTeEmailID() {
		return teEmailID;
	}
	public void setTeEmailID(String teEmailID) {
		this.teEmailID = teEmailID;
	}
	public String getResideDt() {
		return resideDt;
	}
	public void setResideDt(String resideDt) {
		this.resideDt = resideDt;
	}
	public String getIsVerified() {
		return isVerified;
	}
	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public String getStayStartDate() {
		return stayStartDate;
	}
	public void setStayStartDate(String stayStartDate) {
		this.stayStartDate = stayStartDate;
	}
	public String getStayEndDate() {
		return stayEndDate;
	}
	public void setStayEndDate(String stayEndDate) {
		this.stayEndDate = stayEndDate;
	}
}
