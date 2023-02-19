package com.demo.ams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ams.bean.vo.Worker;
import com.demo.ams.dao.WorkerDAO;
import com.demo.ams.dobj.WorkerDO;
import com.demo.ams.service.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService {
	
	@Autowired
	private WorkerDAO WorkerDAO;
	@Override
	public List<Worker> getWorkersDetailsList(String restype) {
		// TODO Auto-generated method stub
		List<Worker> workerList=WorkerDAO.getWorkersAllByType(restype);
		return workerList;
	}
	
	
	@Override
	public void deleteWorker(Integer workerId) {
		// TODO Auto-generated method stub
		WorkerDAO.deleteWorker(workerId);
	}
	
	public WorkerDAO getWorkerDAO() {
		return WorkerDAO;
	}
	public void setWorkerDAO(WorkerDAO workerDAO) {
		WorkerDAO = workerDAO;
	}

	@Override
	public Worker addWorker(Worker worker) {
		// TODO Auto-generated method stub
		worker=WorkerDAO.addNewWorker(worker);
		return worker;
	}


	@Override
	public List<Worker> getWorkersDetailsByID(int workerID) {
		// TODO Auto-generated method stub
		List<Worker> workerList=WorkerDAO.getWorkerByID(workerID);
		return workerList;
	}


	@Override
	public List<Worker> getWorkersDetailsByJobType(String workerJobType) {
		// TODO Auto-generated method stub
		List<Worker> workerList=WorkerDAO.getWorkerByJobType(workerJobType);
		return workerList;
	}

	

}
