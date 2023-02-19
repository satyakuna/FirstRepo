package com.demo.ams.dobj;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.ams.bean.vo.Worker;

public class WorkerMapper implements RowMapper<Worker> {
	
	   public Worker mapRow(ResultSet rs, int rowNum) throws SQLException {
		   Worker worker=new Worker();
		   worker.setWorkerID(rs.getInt(1));
		   worker.setWorkerName(rs.getString(2));
		   worker.setWorkerContactNo(rs.getString(3));
		   worker.setWorkerJobDesc(rs.getString(4));
		   return worker;
}
}