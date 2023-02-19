package com.demo.ams.dao;

import java.util.List;

import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.TenantDO;

public interface FlatDAO {
	
	public void addFlatDetails(final List<FlatDO> FlatList );
	public List<FlatDO> getFlatDetails();
	public String linkResident(FlatDO flatdo);
	public String removeFlat(int flatID);
	public List<FlatDO> getFlatListNoOwner();
	public String removeBulkFlat(List flatIds);
	public String linkBulkResident(List residentList);
//	public String linkBulkTenant(List tenantList);
	


}
