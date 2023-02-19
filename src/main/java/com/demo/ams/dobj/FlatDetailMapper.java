package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

	public class FlatDetailMapper implements RowMapper<FlatDO> {
		   public FlatDO mapRow(ResultSet rs, int rowNum) throws SQLException {
			   FlatDO flatdo = new FlatDO();
			   flatdo.setFlatID(rs.getString(1));
			   flatdo.setFlatNo(rs.getString(2));
			   flatdo.setTowerNo(rs.getString(3));
			   flatdo.setFloorNo(rs.getString(4));
			   flatdo.setHouseNo(rs.getString(5));
			   flatdo.setParkingNo(rs.getString(6));
			   flatdo.setOwnerName(rs.getString(7));			   
		       return flatdo;
		     }


}
