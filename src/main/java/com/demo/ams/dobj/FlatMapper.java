package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FlatMapper implements RowMapper<FlatDO> {
		   public FlatDO mapRow(ResultSet rs, int rowNum) throws SQLException {
			   FlatDO flatdo = new FlatDO();
			   flatdo.setTowerNo(rs.getString(1));
			   flatdo.setFloorNo(rs.getString(2));
			   flatdo.setHouseNo(rs.getString(3));
			   flatdo.setParkingNo(rs.getString(4));
			   flatdo.setOwnerID(rs.getString(5));			   
			   flatdo.setApartmentName(rs.getString(6));
			   System.out.println(rs.getString(7));
			   flatdo.setOwnerName(rs.getString(7));			   
		       return flatdo;
		     }

}
