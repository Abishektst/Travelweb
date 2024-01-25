package org.abi;

public class Overloading {
	
	
	private void team(int a,String name) {
		
		 System.out.println(a);
		 System.out.println(name);
		

	}
	
	private void team(int c,int b) {
		
		System.out.println(c);
		System.out.println(b);

	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Overloading a = new Overloading();
		a.team(0,"Abishek");
		a.team(1, 2);

	}

}
