package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/Jsp");
		set.add("Java");//-> 중복된객체라서 값이 들어가지못함.
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			
			System.out.println("\t"+element);
		}
		
		System.out.println();

	}

}
