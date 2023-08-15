package com.demo.ams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dao.FlatDAO;
import com.demo.ams.dao.ResidentDAO;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.service.FlatService;

@Service
public class FlatServiceImpl implements FlatService{
	@Autowired
	private FlatDAO FlatDAO;

	@Override
	public ResidentFlat addResidentflat(ResidentFlat residentFlat) {
		// TODO Auto-generated method stub
	//	residentFlat=FlatDAO.addFlatDetails(residentFlat);
		return residentFlat;
	}

	

	@Override
	public List<FlatDO> getAllFlatDetails() {
		// TODO Auto-generated method stub
		List<FlatDO> flatList=FlatDAO.getAllFlatDetails();
		return flatList;
	}
	

}
