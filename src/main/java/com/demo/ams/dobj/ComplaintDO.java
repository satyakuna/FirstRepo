package com.demo.ams.dobj;

import java.sql.Date;

public class ComplaintDO {
	
	private String complaintID;
	private int requestorID;
	private String issueDesc;
	private String categoryID;
	private String categoryDesc;
	private Date raisedDt;
	private Date closeDt;
	private String status;
	private int flatID;
	private String towerNo;
	private String houseNo;
	private String floorNo;
	
	public String getComplaintID() {
		return complaintID;
	}
	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}
	public int getRequestorID() {
		return requestorID;
	}
	public void setRequestorID(int requestorID) {
		this.requestorID = requestorID;
	}
	public String getIssueDesc() {
		return issueDesc;
	}
	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}
	public String getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}
	public Date getRaisedDt() {
		return raisedDt;
	}
	public void setRaisedDt(Date raisedDt) {
		this.raisedDt = raisedDt;
	}
	public Date getCloseDt() {
		return closeDt;
	}
	public void setCloseDt(Date closeDt) {
		this.closeDt = closeDt;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getFlatID() {
		return flatID;
	}
	
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public void setFlatID(int flatID) {
		this.flatID = flatID;
	}
	public String getTowerNo() {
		return towerNo;
	}
	public void setTowerNo(String towerNo) {
		this.towerNo = towerNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(String floorNo) {
		this.floorNo = floorNo;
	}
	
	
}
