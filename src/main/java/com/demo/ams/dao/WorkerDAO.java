package com.demo.ams.dao;

import java.util.List;

import com.demo.ams.bean.vo.Worker;
import com.demo.ams.dobj.WorkerDO;

public interface WorkerDAO {
	

    public List<Worker> getWorkersAllByType(String resType);

	public Worker addNewWorker(Worker worker);

	public void deleteWorker(Integer workerId);
	
	public List<Worker> getWorkerByID(int WorkerID);
	
	public List<Worker> getWorkerByJobType(String WorkerJobType);
	
	
	
	

}
