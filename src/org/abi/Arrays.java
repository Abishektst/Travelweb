package org.abi;

public class Arrays {

	public static void main(String[] args) {
		int b[]= new int[5];
		
		b[0]=100;
		b[1]=200;
		b[2]=300;
		b[3]=400;
		b[4]=500;
		
		int sum=0;
		
		for(int i:b) {
			System.out.println(i);
			sum=sum+i;
		}
  System.out.println(sum);
	}

}
