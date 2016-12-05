/**
 * 
 */
package com.dt.defectList;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.Defect;
import com.dt.model.User;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;


/**
 * @author Abhishek
 *
 */
public class DefectListBiz implements IDefectListBiz {
	
	@Override
	public String getDefectList(User user) {
		List<Defect> listOfDefects = new ArrayList<Defect>();
		IDefectListDAO defectListDAO = new DefectListDAO();
		listOfDefects = defectListDAO.getDefectList(user);
		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfDefects,
	            new TypeToken<List<Defect>>() {
	            }.getType());
		
		return jsonArray.toString();
	}
	@Override
	public String getDefectDetails(Defect defect) {
		IDefectListDAO defectListDAO = new DefectListDAO();
		defect = defectListDAO.getDefectDetails(defect);
		return new Gson().toJson(defect, new TypeToken<Defect>(){}.getType());
	}

}
