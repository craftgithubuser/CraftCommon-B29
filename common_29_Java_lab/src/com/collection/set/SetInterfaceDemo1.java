package com.collection.set;

import java.util.*;

public class SetInterfaceDemo1 {

	public static void main(String[] args) {

		// Creating a set using the HashSet class
		Set set1 = new HashSet<>();

		// Add elements to the set1
		set1.add(2);
		set1.add(3);

		System.out.println("Set1: " + set1);

		// Creating another set using the HashSet class
		Set set2 = new HashSet<>();
		
		// Add elements
		set2.add(1);
		set2.add(2);

		System.out.println("Set2: " + set2);
		
		// Union of two sets
		set2.addAll(set1);
		
		System.out.println("Union is: " + set2);

	}

}
