package com.AdminDept;

import com.superDept.SuperDept;

public class AdminDept extends SuperDept{
	public String a = "Admin Department";
	public String b = "Complete your Documents Submission";
	public String c = "Complete by EOD";
public String departName() {
		return a;
	}
public String getTodaysWork() {
		return b;
	}
public String getWorkDeadline() {
		return c;
	}
}