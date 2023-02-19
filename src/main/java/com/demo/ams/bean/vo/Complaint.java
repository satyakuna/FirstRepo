package com.demo.ams.bean.vo;

import java.sql.Date;

public class Complaint {
	
	private String complaintID;
	private String requestorID;
	private String issueDesc;
	private String categoryID;
	private String categoryDesc;
	private String raisedDt;
	private String closeDt;
	private String status;
	private String flatID;
	private String flatName;
	
	public String getComplaintID() {
		return complaintID;
	}
	public void setComplaintID(String complaintID) {
		this.complaintID = complaintID;
	}
	public String getRequestorID() {
		return requestorID;
	}
	public void setRequestorID(String requestorID) {
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
	public String getCategoryDesc() {
		return categoryDesc;
	}
	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}
	public String getRaisedDt() {
		return raisedDt;
	}
	public void setRaisedDt(String raisedDt) {
		this.raisedDt = raisedDt;
	}
	public String getCloseDt() {
		return closeDt;
	}
	public void setCloseDt(String closeDt) {
		this.closeDt = closeDt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFlatID() {
		return flatID;
	}
	public void setFlatID(String flatID) {
		this.flatID = flatID;
	}
	public String getFlatName() {
		return flatName;
	}
	public void setFlatName(String flatName) {
		this.flatName = flatName;
	}
	

}
