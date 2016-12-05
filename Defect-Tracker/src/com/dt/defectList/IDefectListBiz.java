/**
 * 
 */
package com.dt.defectList;

import com.dt.model.Defect;
import com.dt.model.User;


/**
 * @author Abhishek
 *
 */
public interface IDefectListBiz {
	
	public String getDefectList(User obj);
	public String getDefectDetails(Defect defect);

}
