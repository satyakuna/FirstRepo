package com.demo.ams.dobj;

	import java.sql.ResultSet;
	import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

	public class ResidentMapper implements RowMapper<ResidentDO> {
	   public ResidentDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   ResidentDO residentdo = new ResidentDO();
		   residentdo.setResidentName(rs.getString(1));
		   residentdo.setCommAddr(rs.getString(2));
		   residentdo.setContactNo(rs.getString(3));
		   residentdo.setAltContact(rs.getString(4));
		   residentdo.setEmailID(rs.getString(5));
		   System.out.println(rs.getString(5));
		   residentdo.setIdProofNo(rs.getString(6));
		   residentdo.setIdProofType(rs.getString(7));
		   residentdo.setTowerNo(rs.getString(10));
		   residentdo.setFloorNO(rs.getString(11));
		   residentdo.setHouseNO(rs.getString(12));


		   System.out.println("fgdf");
		   residentdo.setFlatID(rs.getString(13));
		   residentdo.setFlatName(rs.getString(14));
		   residentdo.setFlatNo(rs.getString(14));
		   residentdo.setParkingNo(rs.getString(15));
		   residentdo.setApartmentName(rs.getString(16)); 
	       return residentdo;
	     }
	   
	

/*	   select a.resident_name ,a.res_add_comm,a.res_contact_no," +
		"a.res_alt_contact_no,a.res_email_id,b.owner_id,b.tenant_id,b.TOWERNO," +
		"b.floorno,b.houseno,b.flat_id,c.APT_NAME from resident a,apt_detail b,apt_master c" +
		" where a.resident_id=? and (a.resident_id=b.owner_id " +
		"or a.resident_id=b.tenant_id)and b.apt_id=c.apt_id";*/
	}

