package org.abi;

public class Javabasics {

	int empid;
	String empname;
	
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
	}
	
	
	public static void main(String[] args) {
		Javabasics a = new Javabasics();
		a.empid=10;
		a.empname="Abishek";
		a.display();

	}

}
