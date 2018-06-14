package com.EmpPayroll.domain;

public class Intern extends Employee implements IPrintable {
	
	private String schoolName;
	
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public void printMyData() {
		// TODO Auto-generated method stub
		
		System.out.println("Name : " + this.getName()+"\nYear of Birth :" + this.calcBrithYear() + "\nEmployee ha no Vehicle\nEmployee is Intern\n\tSchool :"
		+this.schoolName+"\n\tEarnings :"+this.getEarnings());
		
	}
	
	
}
