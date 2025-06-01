package com.core_java.collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		
		String arr[] = {"Dog", "Cat", "Elephant"};
		
		System.out.println("Values of the Array 'arr'");
		System.out.println("-------------------------");
		
		for(String value : arr) {
			System.out.println(value);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(arr)); // Converting Array into ArrayList
		
		System.out.println("\n\nElements of the ArrayList 'al' : " + al);
		
	}
}
