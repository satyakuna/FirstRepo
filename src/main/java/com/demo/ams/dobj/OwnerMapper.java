package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class OwnerMapper implements RowMapper<OwnerDO> {
	
		   public OwnerDO mapRow(ResultSet rs, int rowNum) throws SQLException {
			   OwnerDO ownerdo = new OwnerDO();
			   ownerdo.setOwnerID(Integer.parseInt(rs.getString(1)));
			   ownerdo.setOwnerName(rs.getString(2));
			 //  ownerdo.setFlatID(rs.getString(3));
			   ownerdo.setOwContactNo(rs.getString(3));
			   ownerdo.setOwAddrComm(rs.getString(4));
			   ownerdo.setOwAddrPer(rs.getString(5));
			   ownerdo.setOwAltContactNo(rs.getString(6));
			   ownerdo.setOwEmailID(rs.getString(7));  
		      return ownerdo;
		     }
}
