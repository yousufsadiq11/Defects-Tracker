package com.dt.assignLead;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.Defect;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

public class assignLeadBiz {
	
	
	public String getDefectList() {
		List<Defect> listOfDefects = new ArrayList<Defect>();
		assignLeadDao defectListDao=new assignLeadDao();
		listOfDefects = defectListDao.getDefectList();
		
		
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfDefects,
	            new TypeToken<List<Defect>>() {
	            }.getType());
		System.out.println(jsonArray.toString());
		
		return jsonArray.toString();
	}

	public boolean assignDefectBiz(String assigned_to, int id) {
		// TODO Auto-generated method stub
		assignLeadDao defectListDao=new assignLeadDao();
		boolean flag=defectListDao.assignLeadDao(assigned_to,id);
		
		return flag;
	}

	public String getDefectDescription(int id) {
		// TODO Auto-generated method stub
		assignLeadDao defectListDao=new assignLeadDao();
		return defectListDao.getDefectDescription(id);
	}


}
