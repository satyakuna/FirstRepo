package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ResidentLinkMapper implements RowMapper<ResidentDO> {
	   public ResidentDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ResidentDO residentdo = new ResidentDO();
		   residentdo.setResidentName(rs.getString(17)); //owner name
		   residentdo.setCommAddr(rs.getString(2));
		   residentdo.setContactNo(rs.getString(3));
		   residentdo.setAltContact(rs.getString(4));
		   residentdo.setEmailID(rs.getString(5));
		   residentdo.setIdProofNo(rs.getString(6));
		   residentdo.setIdProofType(rs.getString(7));
		   residentdo.setFlatNo(rs.getString(8));
		   residentdo.setResidentID(rs.getInt(9));
		   residentdo.setTenantName(rs.getString(1));
		   residentdo.setFlatID(rs.getString(14));
		   System.out.println("residentdo" + residentdo.getFlatID());
	      return residentdo;
	     }
	   
	  
}