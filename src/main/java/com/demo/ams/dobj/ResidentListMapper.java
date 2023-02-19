package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ResidentListMapper implements RowMapper<ResidentDO> {
	   public ResidentDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ResidentDO residentdo = new ResidentDO();
		   residentdo.setResidentName(rs.getString(1));
		   residentdo.setCommAddr(rs.getString(2));
		   residentdo.setContactNo(rs.getString(3));
		   residentdo.setAltContact(rs.getString(4));
		   residentdo.setEmailID(rs.getString(5));
		   residentdo.setTowerNo(rs.getString(6));
		   residentdo.setFloorNO(rs.getString(7));
		   residentdo.setHouseNO(rs.getString(8));
		   residentdo.setFlatID(rs.getString(9));
		   residentdo.setFlatName((rs.getString(10)));

		 //  residentdo.setApartmentName(rs.getString(10));
		  
	      return residentdo;
	     }
}