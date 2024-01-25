package org.abi;

public class Eachwrd {

	public static void main(String[] args) {
	
		
		String str = "What are you doing";
		
		String[] words=str.split(" ");
		
		String revString="";
		
		for(String w:words)
		{
			String revword="";
			
			for(int i=w.length()-1;i>=0;i--) {
				revword = revword+w.charAt(i);
			}
			revString = revString+revword;
		}
              System.out.println(revString);
	}

}
