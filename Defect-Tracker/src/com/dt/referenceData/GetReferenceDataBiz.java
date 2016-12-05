/**
 * 
 */
package com.dt.referenceData;

import java.util.ArrayList;
import java.util.List;

import com.dt.model.Module;
import com.dt.model.Role;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;

/**
 * @author Abhishek
 *
 */
public class GetReferenceDataBiz implements IGetReferenceDataBiz {

	@Override
	public String getModuleList() {
		List<Module> listOfModules = new ArrayList<Module>();

		IGetReferenceDataDAO getReferenceDataDAO = new GetReferenceDataDAO();
		listOfModules = getReferenceDataDAO.getModuleList();

		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfModules, new TypeToken<List<Module>>() {
		}.getType());

		return jsonArray.toString();
	}

	@Override
	public String getRoleList() {
		List<Role> listOfRoles = new ArrayList<Role>();

		IGetReferenceDataDAO getReferenceDataDAO = new GetReferenceDataDAO();
		listOfRoles = getReferenceDataDAO.getRoleList();

		JsonArray jsonArray = new JsonArray();
		jsonArray = (JsonArray) new Gson().toJsonTree(listOfRoles, new TypeToken<List<Role>>() {
		}.getType());

		return jsonArray.toString();
	}

}
