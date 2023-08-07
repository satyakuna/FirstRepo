package com.demo.ams.dao;

import java.util.List;
import java.util.Map;

import com.demo.ams.bean.vo.ResidentProfile;
import com.demo.ams.bean.vo.Tenant;
import com.demo.ams.dobj.ComplaintDO;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.OwnerDO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.dobj.TenantDO;
import com.demo.ams.dobj.WorkerDO;

public interface ResidentDAO {
	 public int fetchResidentID(String uid,String pwd);
	 public List<ResidentDO> getResidentDetailsByID(String residentID);
     public List<ResidentDO> getResidentDetails(int residentID,String resType);
     public List<ResidentDO> getResidentAllByType(String resType);
     public List<TenantDO> getTenantList();
     public List<ResidentDO> getOwnerList();
     public List<TenantDO> getPTAList();
     public List<ResidentDO> getPAList();
     
 	public String linkTenant(TenantDO tenantdo);


     
     public List<ComplaintDO> getComplaintDetails(int residentID);
     public FlatDO getFlatDetails(String flatID);
     public List<ComplaintDO> getComplaintDetailsByStaus(int residentID,String status);
     public List<ComplaintDO> getComplaintDetailsByFlatID(int residentID,String status,int flatID);

     public List<ComplaintDO> getCompCategory();
     public String createNewComplaint(ComplaintDO complaintdo);
     public List<TenantDO> getTenantList(String apartmentID);  
     public TenantDO getTenantDetails(String flatID);     
     public String removeTenant(TenantDO tenantDo);
     public String addTenant(TenantDO tenantDo);
     public String saveTenantRequest(TenantDO tenantDo);
     
     public void addResidents(List<ResidentDO> resList);
     public String addNewResident(ResidentDO resDO);
     
   //  public OwnerDO getResidentDetails(String residentID);
   //  public TenantDO getTenantDetails(String residentID);
     public List<ResidentDO> getResidentList(String apartmentID);
     //public String updateResidentDetail(ResidentProfile resprofile);
     public List<WorkerDO> getWorkerDetails(int residentID);
     public String removeWorker(int flatID,int workerID);
     
     public List<WorkerDO> searchWorkerByName(String workerName);
     public List<WorkerDO> searchWorkerByCNo(String contactNo);
     public String linkWorker(int flatID,int workerID);
     
     public String removeResidentInBulk(List pendingOwList);
     
     public String removeOwnerByFlatID(FlatDO flatdo);
 	 public List<TenantDO> getTenantListByOwner(String residentID);
  //   public String removeO(FlatDO flatdo);
     public String removeTenantByOwner(TenantDO tenantDo);
     
     
     public List getDirectoryListByOwner(String apartmentID);
     public List getDirectoryListByTenant(String apartmentID);
	 public List<ResidentDO> getResidentDetailsByID(int residentID);

     



     

     
}
