/**
 * 
 */
package com.dt.defectList;

import java.util.ArrayList;

import com.dt.model.Defect;
import com.dt.model.User;

/**
 * @author Abhishek
 *
 */
public interface IDefectListDAO {

	public ArrayList<Defect> getDefectList(User user);
	public Defect getDefectDetails(Defect defect);

}
