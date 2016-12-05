/**
 * 
 */
package com.dt.referenceData;

import java.util.ArrayList;

import com.dt.model.Module;
import com.dt.model.Role;

/**
 * @author Abhishek
 *
 */
public interface IGetReferenceDataDAO {
	
	ArrayList<Module> getModuleList();
	ArrayList<Role> getRoleList();

}
