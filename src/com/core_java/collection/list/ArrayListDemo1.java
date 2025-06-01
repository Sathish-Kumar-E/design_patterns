package com.core_java.collection.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		
		// Declare ArrayList for Heterogeneous Data
		ArrayList al = new ArrayList();
		
		// Add new elements to the ArrayList
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
				
		System.out.println(al);
		
		System.out.println("\nNumber of elements in ArrayList 'al' : " + al.size()); // Size of the ArrayList
		
		al.remove(0); // Removing the element by index
		System.out.println("\nAfter removing the element at index 0 : " + al);
		
		al.remove("Welcome"); // Removing the element by value
		System.out.println("\nAfter removing the element by value 'Welcome' : " + al);
		
		al.add(1, "Python"); // Insert a new element
		System.out.println("\nAfter insertion : " + al);
		
		System.out.println("\nElemet at 2nd index : " + al.get(2)); // Retreive specific element at kth index
		
		al.set(2,  "C#"); // Change element or Replace
		System.out.println("\nAfter replacing element : " + al);
		
		// Search - contains() - Returns true/false
		System.out.println("\nCheck if 'C#' is prent in the ArrayList 'al' : " + al.contains("C#"));
		System.out.println("\nCheck if 'C++' is prent in the ArrayList 'al' : " + al.contains("C++"));
		
		System.out.println("\nCheck if the ArrayList 'al' is empty : " + al.isEmpty()); // To check if the ArrayList is empty or not
		
		// Different ways to read the elements from the ArrayList : for loop, for..each loop, iterator()
		
		// 1) for loop
		System.out.println("\n1) Reading elements using for loop :");
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		// 2) for..each loop
		System.out.println("\n2) Reading elements using for..each loop :");
		for(Object e : al) {
			System.out.println(e);
		}
		
		// 3) iterator()
		System.out.println("\n3) Reading elements using iterator method :");
		Iterator it = al.iterator(); // It will read each and every method from the ArrayList and store in the variable 'it'
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Declare ArrayList for Homogeneous Data
		// ArrayList<Integer> al = new ArrayList<Integer>(); // OR  List al = new ArrayList<>();
		
	}
}
