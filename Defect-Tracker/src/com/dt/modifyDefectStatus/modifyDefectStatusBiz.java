package com.dt.modifyDefectStatus;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.Defect;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

public class modifyDefectStatusBiz {
	
	
	public String getDefectList() {
		List<Defect> listOfDefects = new ArrayList<Defect>();
		modifyDefectStatusDao defectListDao=new modifyDefectStatusDao();
		listOfDefects = defectListDao.getDefectList();
		
		
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfDefects,
	            new TypeToken<List<Defect>>() {
	            }.getType());
		System.out.println(jsonArray.toString());
		
		return jsonArray.toString();
	}

	public boolean assignDefectBiz(String defect_status, int id) {
		// TODO Auto-generated method stub
		modifyDefectStatusDao defectListDao=new modifyDefectStatusDao();
		boolean flag=defectListDao.assignLeadDao(defect_status,id);
		
		return flag;
	}


}
