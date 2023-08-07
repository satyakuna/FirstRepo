package com.demo.ams.service;

import java.util.List;

import com.demo.ams.dobj.ResidentDO;

public interface ResidentService {
	
	public List<ResidentDO> getResidentDetailsByID(int residentID);

}
