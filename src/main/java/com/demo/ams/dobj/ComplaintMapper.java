package com.demo.ams.dobj;

	import java.sql.ResultSet;
	import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

	public class ComplaintMapper implements RowMapper<ComplaintDO> {
	   public ComplaintDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ComplaintDO complaintdo = new ComplaintDO();
		   complaintdo.setComplaintID(rs.getString(1));
		   complaintdo.setIssueDesc(rs.getString(2));
		   complaintdo.setRaisedDt(rs.getDate(3));
		   complaintdo.setCloseDt(rs.getDate(4));
		   complaintdo.setStatus(rs.getString(5));	
		   complaintdo.setCategoryDesc(rs.getString(6));
		  /* complaintdo.setTowerNo(rs.getString(7));
		   complaintdo.setFloorNo(rs.getString(8));
		   complaintdo.setHouseNo(rs.getString(9));*/
			   
	      return complaintdo;
	     }
	   
/*	   select a.resident_name ,a.res_add_comm,a.res_contact_no," +
		"a.res_alt_contact_no,a.res_email_id,b.owner_id,b.tenant_id,b.TOWERNO," +
		"b.floorno,b.houseno,b.flat_id,c.APT_NAME from resident a,apt_detail b,apt_master c" +
		" where a.resident_id=? and (a.resident_id=b.owner_id " +
		"or a.resident_id=b.tenant_id)and b.apt_id=c.apt_id";*/
	}
	
	