package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

public class TenantRequestMapper implements RowMapper<TenantDO> {
	   public TenantDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   TenantDO tenantdo = new TenantDO();
		 //  tenantdo.setTenantID(Integer.parseInt(rs.getString(1)));
		   tenantdo.setTenantName(rs.getString(1));
		   tenantdo.setTeAddrComm(rs.getString(2));
		   tenantdo.setTeAddrPer(rs.getString(3));
		   tenantdo.setTeContactNo(rs.getString(4));
		   tenantdo.setTeAltContactNo(rs.getString(5));
		   tenantdo.setTeEmailID(rs.getString(6));
		   tenantdo.setIdProofNo(rs.getString(7));
		   tenantdo.setIdProofType(rs.getString(8));
		   tenantdo.setOwnerID(rs.getInt(9));
		   tenantdo.setFlatID(rs.getInt(10));
		   /*	   String resDate = new SimpleDateFormat("dd/MM/yyyy").format( rs.getDate((10))); 
          System.out.println("reside date ////// "+resDate);
		   tenantdo.setResideDt(resDate);*/

	      return tenantdo;
	     }
	  
}
