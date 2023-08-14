package com.demo.ams.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dao.FlatDAO;
import com.demo.ams.dao.ResidentDAO;
import com.demo.ams.dobj.ResidentDO;
import com.demo.ams.service.ResidentFlatService;

@Service
public class ResidentFlatServiceImpl implements ResidentFlatService{
	@Autowired
	private FlatDAO FlatDAO;

	@Override
	public ResidentFlat addResidentflat(ResidentFlat residentFlat) {
		// TODO Auto-generated method stub
	//	residentFlat=FlatDAO.addFlatDetails(residentFlat);
		return residentFlat;
	}

	@Override
	public List<ResidentFlat> getResidentFlatDetails(String restype) {
		// TODO Auto-generated method stub
		List<ResidentFlat> resflatlist=FlatDAO.getFlatDetails(restype);
		return resflatlist;
	}

	

	
	

}
