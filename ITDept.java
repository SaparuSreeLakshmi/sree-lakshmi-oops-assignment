package com.ITDept;

import com.HRDept.HrDepartment;
import com.AdminDept.AdminDepartment;
import com.TechDept.TechDepartment;

public class ITDept{

	public static void main(String[] args) {
		
		AdminDepartment a = new AdminDept();
		HrDepartment b = new HrDept();
		TechDepartment c = new TechDept();
		System.out.println("Welcome to " + a.deptName());
		System.out.println(a.getTodaysWork());
		System.out.println(a.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + b.deptName());
		System.out.println(b.doActivity());
		System.out.println(b.getTodaysWork());
		System.out.println(b.getWorkDeadline());
		System.out.println(a.isTodayAHoliday());
		System.out.println();
		System.out.println("Welcome to " + c.deptName());
		System.out.println(c.getTodaysWork());
		System.out.println(c.getWorkDeadline());
		System.out.println(c.getTechStackInformation());
		System.out.println(c.isTodayAHoliday());
}

}