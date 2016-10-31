package com.dt.model;

public class Defect {
	int defect_id;
	String defect_name;
	String defect_desc;
	String assigned_to;
	String assigned_date;
	String defect_status;
	String defect_type;
	String severity;
	int module_id;
	public int getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(int defect_id) {
		this.defect_id = defect_id;
	}
	public String getDefect_name() {
		return defect_name;
	}
	public void setDefect_name(String defect_name) {
		this.defect_name = defect_name;
	}
	public String getDefect_desc() {
		return defect_desc;
	}
	public void setDefect_desc(String defect_desc) {
		this.defect_desc = defect_desc;
	}
	public String getAssigned_to() {
		return assigned_to;
	}
	public void setAssigned_to(String assigned_to) {
		this.assigned_to = assigned_to;
	}
	public String getAssigned_date() {
		return assigned_date;
	}
	public void setAssigned_date(String assigned_date) {
		this.assigned_date = assigned_date;
	}
	public String getDefect_status() {
		return defect_status;
	}
	public void setDefect_status(String defect_status) {
		this.defect_status = defect_status;
	}
	public String getDefect_type() {
		return defect_type;
	}
	public void setDefect_type(String defect_type) {
		this.defect_type = defect_type;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public int getModule_id() {
		return module_id;
	}
	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}
	

}
