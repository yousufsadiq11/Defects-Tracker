package com.dt.assignLead;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dt.model.Defect;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

public class assignLeadBizTest {

	@Test
	public void test() {
		List<Defect> listOfDefects = new ArrayList<Defect>();
		assignLeadDao defectListDao=new assignLeadDao();
		listOfDefects = defectListDao.getDefectList();
		
		
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfDefects,
	            new TypeToken<List<Defect>>() {
	            }.getType());
		System.out.println(jsonArray.toString());
	}

	public void assignDefectBiz(String assigned_to, int id) {
		// TODO Auto-generated method stub
		assignLeadDao defectListDao=new assignLeadDao();
		boolean flag=defectListDao.assignLeadDao("Team Lead",1003);
		assertEquals(1,flag);
	}
}


