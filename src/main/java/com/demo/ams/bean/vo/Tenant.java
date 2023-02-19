package com.demo.ams.bean.vo;

public class Tenant {
	
	private int tenantID; 
	private String tenantName;  
	private int ownerID;  
	private String ownerName;
	private int flatID;
	private String teContactNo; 
	private String teAddrComm;
	private String teAddrPer; 
	private String teAltContactNo; 
	private String teVehicleNo;
	private String teEmailID;
	private String idProofType;
	private String idProofNo;
	private String teresdt;
	private String isVerified;
	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}

	public String getTeresdt() {
		return teresdt;
	}

	public void setTeresdt(String teresdt) {
		this.teresdt = teresdt;
	}

	private String message;
	
	
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

	public String getTeAddrComm() {
		return teAddrComm;
	}
	public int getFlatID() {
		return flatID;
	}

	public void setFlatID(int flatID) {
		this.flatID = flatID;
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
	public String getTeVehicleNo() {
		return teVehicleNo;
	}

	public void setTeVehicleNo(String teVehicleNo) {
		this.teVehicleNo = teVehicleNo;
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
	

}
