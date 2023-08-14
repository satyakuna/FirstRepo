package com.demo.ams.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dao.FlatDAO;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.FlatDetailMapper;
import com.demo.ams.dobj.FlatDetailNoOWMapper;
import com.demo.ams.dobj.FlatMapper;
import com.demo.ams.dobj.TenantDO;
import com.demo.ams.dobj.TenantLinkMapper;
import com.demo.ams.dobj.TenantMapper;
import com.demo.ams.dobj.TenantRequestMapper;
import com.demo.ams.dobj.WorkerMapper;

@Repository
public class FlatDaoImpl implements FlatDAO {

	@Autowired
	private JdbcTemplate jtemplate;

	@Override
	public void addFlatDetails(final List<FlatDO> flatList) {

		String sql = "INSERT INTO APT_DETAIL "
				+ "(FLAT_ID,FLATNO,TOWERNO,FLOORNO,HOUSENO,PARKINGNO,APT_ID) VALUES (NULL,?,?, ?, ?,?,?)";

		getJtemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// String sqlIdentifier = "select FLAT_SEQ.NEXTVAL from dual";
				// int sequence=getJtemplate().queryForObject(sqlIdentifier,Integer.class);

				FlatDO flatDO = flatList.get(i);

				ps.setString(1, flatDO.getFlatNo());
				ps.setString(2, flatDO.getTowerNo());
				ps.setString(3, flatDO.getFloorNo());
				ps.setString(4, flatDO.getHouseNo());
				ps.setString(5, flatDO.getParkingNo());
				ps.setInt(6, Integer.parseInt(flatDO.getApartmentID()));

			}

			@Override
			public int getBatchSize() {
				return flatList.size();
			}
		});
	}

	public JdbcTemplate getJtemplate() {
		return jtemplate;
	}

	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}

	@Override
	public List<FlatDO> getFlatDetails() {
		System.out.println("inside getflatdeatils....");
		String SQL = "select b.flat_id,b.flatno,b.TOWERNO,b.floorno,b.houseno,b.parkingno,a.resident_name from "
				+ " APT_DETAIL b left outer join RESIDENT a on b.owner_id=a.resident_id";

		List<FlatDO> flatList = jtemplate.query(SQL, new FlatDetailMapper());
		System.out.println(flatList.size());
		return flatList;
	}

	@Override
	public String removeFlat(int flatID) {
		System.out.println("inside getflatdeatils....");
		String SQL = "delete from APT_DETAIL where FLAT_ID=" + flatID;

		int x = jtemplate.update(SQL);
		if (x == 1) {
			return "SUCCESS";
		}
		return "FAILED";
	}

	@Override
	public String linkResident(FlatDO flatdo) {
		String SQL = "update APT_DETAIL set owner_id=" + flatdo.getResidentID() + " where " + "flatno='"
				+ flatdo.getFlatNo() + "'";
		System.out.println(SQL);
		int x = jtemplate.update(SQL);
		// TODO Auto-generated method stub
		if (x == 1) {
			return "success";
		}
		return "fail";
	}

	@Override
	public String linkBulkResident(List residentList) {

		int x[] = jtemplate.batchUpdate("update APT_DETAIL set owner_id=? where flatno=? ",
				new BatchPreparedStatementSetter() {

					public void setValues(PreparedStatement ps, int i) throws SQLException {
						FlatDO flatDO = (FlatDO) residentList.get(i);
						ps.setInt(1, Integer.parseInt(flatDO.getResidentID()));
						ps.setString(2, flatDO.getFlatNo());
						;

					}

					public int getBatchSize() {
						return residentList.size();
					}
				});
		if (x.length > 0) {
			return "SUCCESS";
		}
		return "FAILED";

	}

	@Override
	public List<FlatDO> getFlatListNoOwner() {

		// System.out.println("inside getflatdeatils....");
		String SQL = "select FLAT_ID,flatno,TOWERNO,floorno,houseno,parkingno from "
				+ " APT_DETAIL where owner_id IS NULL";

		List<FlatDO> flatList = jtemplate.query(SQL, new FlatDetailNoOWMapper());
		System.out.println(flatList.size());
		return flatList;

	}

	@Override
	public String removeBulkFlat(List flatIds) {
		int x[] = jtemplate.batchUpdate("delete from APT_DETAIL where FLAT_ID=?", new BatchPreparedStatementSetter() {

			public void setValues(PreparedStatement ps, int i) throws SQLException {
				String flatID = (String) flatIds.get(i);
				ps.setInt(1, Integer.parseInt(flatID));

			}

			public int getBatchSize() {
				return flatIds.size();
			}
		});
		if (x.length > 0) {
			return "SUCCESS";
		}
		return "FAILED";

	}

	@Override
	public List<ResidentFlat> getFlatDetails(String restype) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public String linkBulkTenant(List tenantList){ String SQL="";
	 * System.out.println("Inside PTA"); SQL =
	 * "select a.TENANT_NAME ,a.TE_ADD_COMM,a.TE_CONTACT_NO,a.TE_ALT_CONTACT_NO,a.TE_EMAIL_ID,a.ID_PROOF_NO,a.ID_PROOF_TYPE,"
	 * + "a.OWNER_ID,a.FLAT_ID from "+ " TENANT_REQUEST a where a.REQID=? "; ptado =
	 * j = jtemplate.query(SQL,new Object[]{flatID},new WorkerMapper());
	 * System.out.println("size of residentdo ::::"+ptado.size());
	 * 
	 * int
	 * x[]=jtemplate.batchUpdate("update APT_DETAIL set tenant_id=? where flatno=? "
	 * , new BatchPreparedStatementSetter() {
	 * 
	 * public void setValues(PreparedStatement ps, int i) throws SQLException {
	 * FlatDO flatDO =(FlatDO)tenantList.get(i); ps.setInt(1,
	 * Integer.parseInt(flatDO.getResidentID())); ps.setString(2,
	 * flatDO.getFlatNo());;
	 * 
	 * }
	 * 
	 * public int getBatchSize() { return tenantList.size(); } }); int
	 * y[]=jtemplate.
	 * batchUpdate("update TENANT_DETAIL set isverified='Y',isactive='Y' where tenant_id=? "
	 * , new BatchPreparedStatementSetter() {
	 * 
	 * public void setValues(PreparedStatement ps, int i) throws SQLException {
	 * FlatDO flatDO =(FlatDO)tenantList.get(i); ps.setInt(1,
	 * Integer.parseInt(flatDO.getResidentID())); // ps.setString(2,
	 * flatDO.getFlatNo());;
	 * 
	 * }
	 * 
	 * public int getBatchSize() { return tenantList.size(); } });
	 * 
	 * if(x.length>0) { return "SUCCESS"; } return "FAILED";
	 * 
	 * }
	 */

}
