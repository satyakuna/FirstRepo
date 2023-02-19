package com.demo.ams.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.ams.bean.vo.Worker;
import com.demo.ams.dao.WorkerDAO;
import com.demo.ams.dobj.WorkerMapper;


@Repository
public class WorkerDaoImpl implements WorkerDAO {
	
	@Autowired
	private JdbcTemplate jtemplate;

	@Override
	public List<Worker> getWorkersAllByType(String workerType) {
		System.out.println("WORKERTYPE     "+workerType);
		// TODO Auto-generated method stub
		String SQL = "";
		
		SQL = "SELECT WORKERID,WORKERNAME,WORKERCONTACTNO,WORKERJOBDESC FROM worker where WORKERJOBTYPE=? and ISACTIVE='Y'";
		
		
		List<Worker> workerList = jtemplate.query(SQL, new Object[] { workerType }, new WorkerMapper());
		System.out.println("workerList........"+workerList.size());
		return workerList;
	}

	@Override
	public Worker addNewWorker(Worker worker) {
		String SQL = "INSERT INTO worker (WORKERID, WORKERNAME, WORKERCONTACTNO, WORKERPROOFID, WORKERPROOFTYPE, WORKERADDR, WORKERJOBTYPE, WORKERJOBDESC,ISACTIVE) VALUES (NULL,'"
				+ worker.getWorkerName() + "','" + worker.getWorkerContactNo() + "','" + worker.getWorkerProofID() + "','"+ worker.getWorkerProofType() + "','"
				+ worker.getWorkerAddr() + "','" + worker.getWorkerJobType() + "','" + worker.getWorkerJobDesc()+"','"+'Y'+"')";
		

		System.out.println(SQL);
		int x = jtemplate.update(SQL);
		System.out.println("Add resident success......");

		return worker;
	}
	@Override
	public void deleteWorker(Integer workerId) {
		String SQL = "UPDATE WORKER SET ISACTIVE='N' where"+

		 					" WORKERID=?";

		 System.out.println("PRINT SQL  "+SQL);
	      int count = jtemplate.update(SQL,new Object[]{workerId});
				
	}

	public JdbcTemplate getJtemplate() {
		return jtemplate;
	}

	public void setJtemplate(JdbcTemplate jtemplate) {
		this.jtemplate = jtemplate;
	}

	@Override
	public List<Worker> getWorkerByID(int WorkerID) {
		// TODO Auto-generated method stub
		String SQL="";
		SQL= "SELECT WORKERID,WORKERNAME,WORKERCONTACTNO,WORKERJOBDESC FROM worker where WORKERID=?";
		List<Worker> workerList = jtemplate.query(SQL, new Object[] { WorkerID }, new WorkerMapper());
		System.out.println("workerList........"+workerList.size());
		return workerList;
	}

	@Override
	
	public List<Worker> getWorkerByJobType(String workerJobType) {
		// TODO Auto-generated method stub
		String SQL="";
		SQL= "SELECT WORKERID,WORKERNAME,WORKERCONTACTNO,WORKERJOBDESC FROM worker where WORKERJOBTYPE=?";
		List<Worker> workerList = jtemplate.query(SQL, new Object[] { workerJobType }, new WorkerMapper());
		System.out.println("workerList........"+workerList.size());
		
		return workerList;
	}

	
}
