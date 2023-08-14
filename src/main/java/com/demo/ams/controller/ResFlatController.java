package com.demo.ams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.service.ResidentFlatService;
import com.demo.ams.service.WorkerService;

@RestController
public class ResFlatController {
	
	@Autowired
	private ResidentFlatService residentflatService;
	
	
	@PostMapping("/getresidentflat")
	public List<ResidentFlat> getResidentFlat(@RequestBody ResidentFlat residentflat) {
		System.out.println(residentflat.getFlatID());
		List<ResidentFlat> resflatlist=residentflatService.getResidentFlatDetails(residentflat.getFlatID());
		return resflatlist;
		
	}

}
