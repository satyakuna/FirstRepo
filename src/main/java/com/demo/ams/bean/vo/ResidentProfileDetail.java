package com.demo.ams.bean.vo;

import java.util.List;

public class ResidentProfileDetail {

	private ResidentProfile resProfile;
	
	private List<ResidentFlat> resFlatLst;
	private List<Complaint> complaintList;
	private List<Tenant> residentList;
	
	private List<Worker> workerList;

	public List<Worker> getWorkerList() {
		return workerList;
	}
	public void setWorkerList(List<Worker> workerList) {
		this.workerList = workerList;
	}
	public List<Tenant> getResidentList() {
		return residentList;
	}
	public void setResidentList(List<Tenant> residentList) {
		this.residentList = residentList;
	}
	public List<Complaint> getComplaintList() {
		return complaintList;
	}
	public void setComplaintList(List<Complaint> complaintList) {
		this.complaintList = complaintList;
	}
	public ResidentProfile getResProfile() {
		return resProfile;
	}
	public void setResProfile(ResidentProfile resProfile) {
		this.resProfile = resProfile;
	}
	public List<ResidentFlat> getResFlatLst() {
		return resFlatLst;
	}
	public void setResFlatLst(List<ResidentFlat> resFlatLst) {
		this.resFlatLst = resFlatLst;
	}



}
