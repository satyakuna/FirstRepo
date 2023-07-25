 package com.demo.ams.service;

import java.util.List;

import com.demo.ams.bean.vo.Complaint;
import com.demo.ams.bean.vo.Owner;
import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.bean.vo.ResidentProfile;
import com.demo.ams.bean.vo.ResidentProfileDetail;
import com.demo.ams.bean.vo.Tenant;
import com.demo.ams.bean.vo.Worker;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.dobj.WorkerDO;

public interface WorkerService {
	
	public List<Worker> getWorkersDetailsList(String restype);

	//public String addWorker(WorkerDO workerDO);
	
	public Worker addWorker(Worker worker);

	public void deleteWorker(Integer workerId);
	
	public List<Worker> getWorkersDetailsByID(int workerID);
	
	public List<Worker> getWorkersDetailsByJobType(String workerJobType);

	public Integer updateWorkerdetails (Worker worker);

}
