package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class DirectoryOwnerMapper implements RowMapper<ResidentDO> {
	   public ResidentDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ResidentDO residentdo = new ResidentDO();
		   residentdo.setResidentName(rs.getString(1));
		   residentdo.setContactNo(rs.getString(2));
		   residentdo.setAltContact(rs.getString(3));
		   residentdo.setEmailID(rs.getString(4));
		   residentdo.setFlatID(rs.getString(5));
		   residentdo.setFlatNo((rs.getString(6)));

		 //  residentdo.setApartmentName(rs.getString(10));
		  
	      return residentdo;
	     }
}