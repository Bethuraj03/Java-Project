package com.Oops.org;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Consept {
	
	public static void main(String[] args) {
		
		Set<Object> v=new LinkedHashSet <Object>();
		
		v.add(12);
		v.add(57);
		v.add(9);
		v.add(33);
		
		System.out.println(v);
		
		int size = v.size();
		System.out.println(size);
		
		boolean contains = v.contains(9);
		System.out.println(contains);
		
///		v.clear();
///		System.out.println(v);
		
		
		Set<Object> v1=new TreeSet<Object>();
		
		v1.add(11);
		v1.add(22);
		v1.add(33);
		v1.add(44);
		
		System.out.println(v1);
		
		v1.addAll(v);
		System.out.println(v1);
		
		v1.retainAll(v);
		System.out.println(v1);
		
		v1.removeAll(v);
		System.out.println(v1);
		
	}

}
