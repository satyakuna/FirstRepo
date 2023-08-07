package com.demo.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ams.dao.WorkerDAO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.dobj.WorkerDO;
import com.demo.ams.service.ResidentService;

@RestController
public class ResidentController {
	
	@Autowired
	private ResidentService residentService;
	
	@PostMapping("/getresident")
	public List<ResidentDO> getResident(@RequestBody ResidentDO residentdo){
		System.out.println(residentdo.getResidentID());
		List<ResidentDO> rl=residentService.getResidentDetailsByID(residentdo.getResidentID());
		return rl;
	}
	

}
