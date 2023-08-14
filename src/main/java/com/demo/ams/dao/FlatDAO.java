package com.demo.ams.dao;

import java.util.List;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.TenantDO;

public interface FlatDAO {
	
	public void addFlatDetails(final List<FlatDO> FlatList );
	public List<ResidentFlat> getFlatDetails(String restype);
	public String linkResident(FlatDO flatdo);
	public String removeFlat(int flatID);
	public List<ResidentFlat> getFlatListNoOwner();
	public String removeBulkFlat(List flatIds);
	public String linkBulkResident(List residentList);
//	public String linkBulkTenant(List tenantList);
	


}
