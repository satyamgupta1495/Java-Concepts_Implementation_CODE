package com.satyamgupta;

import java.util.*;

public class Person
{
	public static void main(String[] args) {
		
		Map<Integer,String> person = new HashMap();
		person.put(100, "Satyam");
		person.put(102, "Ashutosh");
		person.put(101, "Deepak");
		person.put(105, "Satyam");
		person.put(103, "X AE 21");
		person.put(104, "Justin Shukla");

		List<String> nameList = new ArrayList<>();



	Set<Map.Entry<Integer,String>> values = person.entrySet();
			for (Map.Entry<Integer,String> elements: values   ) {
				nameList.add(elements.getValue());

		}

		System.out.println("Before Sorting");
		System.out.println(nameList);


		System.out.println("After Sorting");
		Collections.sort(nameList);


		System.out.println(nameList);

	}
}