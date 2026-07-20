package com.rays.string;

public class FinedIndexNo {
	
	public static void main(String[] args) {
		
		String name = "Abeet Patel";
		name = name.toLowerCase();
		char ch = 't';
		for(int i = 0; i < name.length(); i++) {
			
			if(ch==name.charAt(i)) {
				System.out.println(i);
			}
			
		}
		
	}

}
