package com.Oops.org;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class List_Concept {
	
	public static void main(String[] args) {
		
		List<Object> b=new LinkedList<Object>();
		
		b.add("Bethu");
		b.add(3);
		b.add(11);
		b.add("Raj");
		
	    System.out.println(b);
	    
	    int size = b.size();
	    System.out.println(size);
	    
	    Object object = b.get(2);
	    System.out.println(object);
	    
	    Object set = b.set(2, 4);
	    System.out.println(b);
	    
	    Object remove = b.remove(3);
	    System.out.println(b);
	    
	    int indexOf = b.indexOf(3);
	    System.out.println(indexOf);
	    
	    boolean contains = b.contains("Bethu");
	    System.out.println(contains);
	    
//	    b.clear();
//	    System.out.println(b);
	    
	    List<Object> b1=new Vector<Object>();
	    
	    b1.add("Arun");
	    b1.add(3);
	    b1.add(2000);
	    b1.add("Kumar");
	    
	    System.out.println(b1);
	    
	    
	    b1.addAll(b);
	    System.out.println(b1);
	    
	    b1.retainAll(b);
	    System.out.println(b1);
	    
	    b1.removeAll(b);
	    System.out.println(b1);
	    
	    
	    
	    
		
		
		
		
	}

}
