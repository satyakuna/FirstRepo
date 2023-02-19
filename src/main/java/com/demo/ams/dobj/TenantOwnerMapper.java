package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.core.RowMapper;

public class TenantOwnerMapper implements RowMapper<TenantDO> {
	   public TenantDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   TenantDO tenantdo = new TenantDO();
		   tenantdo.setTenantID(Integer.parseInt(rs.getString(1)));
		   tenantdo.setTenantName(rs.getString(2));
		   tenantdo.setTeEmailID(rs.getString(3));
		   tenantdo.setTeContactNo(rs.getString(4));
		   String startDate = new SimpleDateFormat("dd/MM/yyyy").format( rs.getDate((5))); 
           System.out.println("reside date ////// "+startDate);
		   tenantdo.setStayStartDate(startDate);
		   if(rs.getDate((6))!=null)
		   {
			   String endDate = new SimpleDateFormat("dd/MM/yyyy").format( rs.getDate((6))); 
	           System.out.println("reside date ////// "+endDate);
			   tenantdo.setStayEndDate(endDate);

		   }else{
			   tenantdo.setStayEndDate("");

		   }
		   tenantdo.setFlatNO(rs.getString(7));
		   tenantdo.setIsActive(rs.getString(8));


	//	   String endDate = new SimpleDateFormat("dd/MM/yyyy").format( rs.getDate((6))); 
      //     System.out.println("reside date ////// "+endDate);
		   
		 	      return tenantdo;
	     }
}
