package com.demo.ams.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dao.ResidentDAO;
import com.demo.ams.dobj.ComplaintDO;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.dobj.ResidentMapper;
import com.demo.ams.dobj.TenantDO;
import com.demo.ams.dobj.WorkerDO;

@Repository
public class ResidentDaoImpl implements ResidentDAO{
	
	@Autowired
	private JdbcTemplate jtemplate;

	@Override
	public int fetchResidentID(String uid, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ResidentDO> getResidentDetailsByID(int residentID) {
		// TODO Auto-generated method stub
		String SQL="";
		SQL="Select RESIDENT_ID,RESIDENT_NAME, RES_CONTACT_NO  FROM resident where RESIDENT_ID=?";
		List<ResidentDO> ResidentList=jtemplate.query(SQL, new Object[] { residentID },new ResidentMapper());
		System.out.println("ResidentList....."+ResidentList.size());
		return ResidentList;
		
		
	}

	@Override
	public List<ResidentDO> getResidentDetails(int residentID, String resType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentDO> getResidentAllByType(String resType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TenantDO> getTenantList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentDO> getOwnerList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TenantDO> getPTAList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentDO> getPAList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String linkTenant(TenantDO tenantdo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComplaintDO> getComplaintDetails(int residentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FlatDO getFlatDetails(String flatID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComplaintDO> getComplaintDetailsByStaus(int residentID, String status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComplaintDO> getComplaintDetailsByFlatID(int residentID, String status, int flatID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ComplaintDO> getCompCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String createNewComplaint(ComplaintDO complaintdo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TenantDO> getTenantList(String apartmentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TenantDO getTenantDetails(String flatID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeTenant(TenantDO tenantDo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addTenant(TenantDO tenantDo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveTenantRequest(TenantDO tenantDo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addResidents(List<ResidentDO> resList) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String addNewResident(ResidentDO resDO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentDO> getResidentList(String apartmentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkerDO> getWorkerDetails(int residentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeWorker(int flatID, int workerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkerDO> searchWorkerByName(String workerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WorkerDO> searchWorkerByCNo(String contactNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String linkWorker(int flatID, int workerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeResidentInBulk(List pendingOwList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeOwnerByFlatID(FlatDO flatdo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TenantDO> getTenantListByOwner(String residentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeTenantByOwner(TenantDO tenantDo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDirectoryListByOwner(String apartmentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getDirectoryListByTenant(String apartmentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ResidentDO> getResidentDetailsByID(String residentID) {
		// TODO Auto-generated method stub
		return null;
	}
	


}
