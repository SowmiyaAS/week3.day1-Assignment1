package Org.student;

import Org.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("sowmiya");
	}
public void studentDept() {
	System.out.println("IT");
}
public void studentId()
{
	System.out.println("81005083");
}
public static void main(String[] args) {
	
	Student details=new Student();
	details.collegeCode();
	details.collegeName();
	details.deptNmae();
	details.collegeRank();
	details.studentDept();
	details.studentId();
	details.studentName();
	
}
}
