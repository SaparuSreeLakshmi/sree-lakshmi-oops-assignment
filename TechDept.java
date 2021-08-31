package com.TechDept;

import com.superdept.SuperDepartment;

public class TechDept extends SuperDept {
	public String a = "Tech Department";
	public String b = "Complete coding of module 1";
	public String c = "Complete by EOD";
	public String d = "Core Java";
public String departmentName() {
		return a;
	}

public String getTodaysWork() {
		return b;
	}

public String getWorkDeadline() {
		return c;
	}

public String getTechStackInformation() {
		return d;
	}
}