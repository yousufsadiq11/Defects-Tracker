package com.dt.referenceData;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dt.model.Module;
import com.dt.model.Role;
import com.dt.utility.DBUtility;
import com.dt.utility.SQLConstants;

public class GetReferenceDataDAOTest {
	Connection con;

	@Before
	public void setUp() throws Exception {
		con = DBUtility.getConnectionToTestDB();
	}

	@After
	public void tearDown() throws Exception {
		DBUtility.closeConnection(con);
	}

	@Test
	public final void testGetModuleList() {
		ArrayList<Module> listOfModules = new ArrayList<Module>();

		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_MODULE_LIST);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Module module = new Module();
				module.setModuleId(resultSet.getInt("module_id"));
				module.setModuleName(resultSet.getString("module_name"));
				listOfModules.add(module);
			}
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		assertNotEquals(listOfModules,null);
	}

	@Test
	public final void testGetRoleList() {
		ArrayList<Role> listOfRoles = new ArrayList<Role>();

		try {
			Connection con = DBUtility.getConnection();
			PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_ROLE_LIST);
			ResultSet resultSet = stmt.executeQuery();
			while (resultSet.next()) {
				Role role= new Role();
				role.setRoleId(resultSet.getInt("role_id"));
				role.setRoleName(resultSet.getString("role_name"));
				listOfRoles.add(role);
			}
			DBUtility.closeConnection(con);
		} catch (SQLException e) {
			System.err.println("ERROR : \nSQL Error Code : " + e.getErrorCode() + " SQL State : " + e.getSQLState());
		}
		assertNotEquals(listOfRoles,null);
	}

}
