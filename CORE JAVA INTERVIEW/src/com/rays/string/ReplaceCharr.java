package com.rays.string;

public class ReplaceCharr {
	
	public static void main(String[] args) {
		
		String name = "Abeet Patel";
		name = name.toLowerCase();
		char ch = 't';
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < name.length(); i++) {
			if(ch==name.charAt(i)) {
				sb.append("k");
			}else {
				sb.append(name.charAt(i));
			}
		}
		System.out.println(sb);
		
	}

}
