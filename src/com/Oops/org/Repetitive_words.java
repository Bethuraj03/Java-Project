package com.Oops.org;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Repetitive_words {

	
	public static void main(String[] args) {
		
		
		String b="Wlcome To Java";
		
		String[]word=b.split("");
		Map<String,Integer>wordmap=new HashMap<String,Integer>();
		
		for(String String :word) {
			if(wordmap.containsKey(String)) {
			Integer integer=wordmap.get(String);
			wordmap.put(String, integer+1);
			
		}else 
			wordmap.put(String, 1);
			
		}
		
		System.out.println("*********RepetitiveWords**********");
		Set<Map.Entry<String,Integer>>entryset=wordmap.entrySet();
		
		for(Map.Entry<String,Integer>entry:entryset) {
		
			if(entry.getValue()>=1) {
				
				String key =entry.getKey();
				Integer value =entry.getValue();
			  System.out.println(key+"="+value);	
			}
			
				
		
}
}
}