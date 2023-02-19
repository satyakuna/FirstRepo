package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class WorkerSearchCNoMapper implements RowMapper<WorkerDO> {
	
	   public WorkerDO mapRow(ResultSet rs, int rowNum) throws SQLException {
		   WorkerDO workerDO=new WorkerDO();
		   workerDO.setWorkerID(rs.getInt(1));
		   workerDO.setWorkerName(rs.getString(2));
		   workerDO.setWorkerContactNo(rs.getString(3));
	//	   workerDO.setWorkerJobDesc(rs.getString(4));
		   return workerDO;
}
}