package com.demo.ams.dobj;

	import java.sql.ResultSet;
	import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

	public class CompCategoryMapper implements RowMapper<ComplaintDO> {
	   public ComplaintDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ComplaintDO complaintdo = new ComplaintDO();
		   complaintdo.setCategoryID(rs.getString(1));
		   complaintdo.setCategoryDesc(rs.getString(2));
			   
	      return complaintdo;
	     }

	}
	
	