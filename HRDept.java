package com.HRdept;

import com.superdept.SuperDept;

public class HrDept extends SuperDept {
	public String a = "Hr Department";
	public String b = "Fill today's worksheet and mark your attendance";
	public String c = "Complete by EOD";
	public  String d = "Team lunch";
public String departmentName() {
		return a;
	}
public String getTodaysWork() {
		return b;
	}
public String getWorkDeadline() {
		return c;
	}

public String doActivity() {
		return d;
	}
}