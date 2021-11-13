package com.demo;

import java.util.HashSet;
import java.util.Set;

public class Javademo {
	
	public static class Set_List 
	{
		public static void main(String[] args)
		{
			System.out.println("*** Set List ***");
	        HashSet<String>li = new HashSet<String>();
			li.add("One");
			li.add("Two");
			li.add("Three");
			li.add("Four");
			li.add("Five");
			System.out.println(li);
			
			int size= li.size();
			System.out.println(size);
			
		    li.remove("One");
			System.out.println(li);
			
			boolean contains = li.contains("Two");
			System.out.println(contains);
			
			li.clear();
			System.out.println(li );
			
			
			Set<String>li2 = new HashSet<String>();
			li2.add("Six");
			li2.add("Seven");
			li2.add("Eight");
			li2.add("Nine");
			
			li.addAll(li2);
			System.out.println(li);
			
			li.retainAll(li2);
			System.out.println(li);
			
			li.removeAll(li2);
			System.out.println(li);
			
			boolean empty =li.isEmpty();
			System.out.println(empty);
			
			boolean equals = li.equals(li2);
			System.out.println(equals);
			
		}

}
	
	
	
	
}
	
