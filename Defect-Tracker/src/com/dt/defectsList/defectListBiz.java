package com.dt.defectsList;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.Defect;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

public class defectListBiz {
	
	
	public String getDefectList() {
		List<Defect> listOfDefects = new ArrayList<Defect>();
		defectListDao defectListDao=new defectListDao();
		listOfDefects = defectListDao.getDefectList();
		
		
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfDefects,
	            new TypeToken<List<Defect>>() {
	            }.getType());
		System.out.println(jsonArray.toString());
		
		return jsonArray.toString();
	}


}
