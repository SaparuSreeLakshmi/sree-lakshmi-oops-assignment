package com.superdept;

public class SuperDept {
	public String a = "Super Department";
	public String b = "No work as of now";
	public String c = "Nil";
	public String d = "Today is not a holiday";

	public String departmentName() {
		return a;
	}

	public String getTodaysWork() {
		return b;
	}

	public String getWorkDeadline() {
		return c;
	}

	public String isTodayAHoliday() {
		return d;
	}

}