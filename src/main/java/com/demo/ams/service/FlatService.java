package com.demo.ams.service;

import java.util.List;

import com.demo.ams.bean.vo.ResidentFlat;
import com.demo.ams.dobj.FlatDO;
import com.demo.ams.dobj.ResidentDO;

public interface FlatService {
	
	public ResidentFlat addResidentflat(ResidentFlat residentFlat);

	public List<FlatDO> getAllFlatDetails();


	

}
