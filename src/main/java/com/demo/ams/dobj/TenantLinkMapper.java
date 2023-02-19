package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TenantLinkMapper implements RowMapper<TenantDO> {
	   public TenantDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   TenantDO tenanatdo = new TenantDO();
		   tenanatdo.setTenantName(rs.getString(1));
		   tenanatdo.setTeAddrComm(rs.getString(2));
		   tenanatdo.setTeContactNo(rs.getString(3));
		   tenanatdo.setTeAltContactNo(rs.getString(4));
		   tenanatdo.setTeEmailID(rs.getString(5));
		   tenanatdo.setIdProofNo(rs.getString(6));
		   tenanatdo.setIdProofType(rs.getString(7));
		   tenanatdo.setFlatNO(rs.getString(8));
		   tenanatdo.setRequestID(rs.getInt(9));
		   tenanatdo.setOwnerName(rs.getString(10));
	       return tenanatdo;
	     }
	  
	 
	  
}