package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DirectoryTenantMapper implements RowMapper<TenantDO> {
	   public TenantDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   TenantDO tenantDO = new TenantDO();
		   tenantDO.setTenantName(rs.getString(1));
		   tenantDO.setTeContactNo(rs.getString(2));
		   tenantDO.setTeAltContactNo(rs.getString(3));
		   tenantDO.setTeEmailID(rs.getString(4));
		   tenantDO.setFlatID(rs.getInt(5));
		   tenantDO.setFlatNO((rs.getString(6)));

		 //  residentdo.setApartmentName(rs.getString(10));
		  
	      return tenantDO;
	     }
}