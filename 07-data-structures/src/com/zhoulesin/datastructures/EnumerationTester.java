package com.zhoulesin.datastructures;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationTester {
	public static void main(String[] args) {
		Enumeration<String> days;
		Vector<String> dayNames = new Vector<>();
		dayNames.add("asd");
		dayNames.add("asd2");
		dayNames.add("asd3");
		dayNames.add("asd4");
		dayNames.add("asd5");
		dayNames.add("asd6");
		dayNames.add("asd7");
		dayNames.add("asd8");
		days = dayNames.elements();
		while(days.hasMoreElements()) {
			System.out.println(days.nextElement());
		}
		
		
	}
}
