package com.demo.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ams.bean.vo.Worker;
import com.demo.ams.service.WorkerService;

@RestController
public class WorkerController {
	
	@Autowired
	private WorkerService workerService;
	
	@PostMapping("/insertworker")
	
	public Worker addWorker(@RequestBody Worker worker) {
		System.out.println(""+worker.getWorkerJobDesc());
		Worker w=workerService.addWorker(worker);
		
		return w;
		
	}
	@PostMapping("/getworker")
	public List<Worker> getWorker(@RequestBody Worker worker) {
		System.out.println(worker.getWorkerID());
		List<Worker> workerlist=workerService.getWorkersDetailsByID(worker.getWorkerID()); 
		return workerlist;
		
	}
	@PostMapping("/getworkerbytype")
	public List<Worker> getWorkerbyType(@RequestBody Worker worker){
		List<Worker> wlist=workerService.getWorkersDetailsByJobType(worker.getWorkerJobType());
		return wlist;
	}
	
	@PostMapping(path = "/updateworker")	
	public Integer updateWorker(@RequestBody Worker worker) {
		Integer w=workerService.updateWorkerdetails(worker);
		return w;
		
	}


}
