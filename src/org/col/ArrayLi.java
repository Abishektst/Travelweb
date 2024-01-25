package org.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayLi {

	public static void main(String[] args) {
		
		
		LinkedList al = new LinkedList();
		
		
		al.add("J");
		al.add("A");
		al.add("V");
		al.add("A");
				
		for(Object obj:al) {
			System.out.println(obj);
		}
		
		LinkedList a = new LinkedList();
		
		a.addAll(al);
		
		System.out.println(a);

	}

}
