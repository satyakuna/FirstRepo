package com.demo.ams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ams.dao.ResidentDAO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.service.ResidentService;

@Service
public class ResidentServiceImpl implements ResidentService{
	
	@Autowired
    ResidentDAO ResidentDAO;
	@Override
	public List<ResidentDO> getResidentDetailsByID(int residentID) {
		// TODO Auto-generated method stub
		List<ResidentDO> Residentlist=ResidentDAO.getResidentDetailsByID(residentID);
	
		return Residentlist;
	}

}
