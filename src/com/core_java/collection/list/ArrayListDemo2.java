package com.core_java.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup = new ArrayList();
		
		al_dup.addAll(al); // Adding all the elements from the ArrayList 'al' to 'al_dup'
		
		System.out.println("After adding all the elemenets from the ArrayList 'al' in 'al_dup' : " + al_dup);
		
		al_dup.removeAll(al); // Removing all the elements from the ArrayList 'al' in 'al_dup'
		System.out.println("\nAfter removing all the elements of the ArrayList 'al' in 'al_dup' : " + al_dup);
		
		System.out.println("\nElements if the ArrayList 'al' : " + al); // [X, Y, Z, A, B, C]
		
		Collections.sort(al); // Sorting in Ascending order
		
		System.out.println("\nElements if the ArrayList 'al' after soting in ascending order : " + al); // [A, B, C, X, Y, Z]
		
		Collections.sort(al, Collections.reverseOrder()); // Sorting in Descending order
		
		System.out.println("\nElements if the ArrayList 'al' after soting in descending order : " + al); // [Z, Y, X, C, B, A]
		
		Collections.shuffle(al);
		System.out.println("\nElements in the ArrayList 'al' after shuffling : " + al); // Shuffling the elements in the ArrayList
		
	}
}
