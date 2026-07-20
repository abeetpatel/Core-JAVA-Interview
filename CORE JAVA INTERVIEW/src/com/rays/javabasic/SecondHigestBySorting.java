package com.rays.javabasic;

import java.util.Arrays;

public class SecondHigestBySorting {
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,30,10,25};
		
		Arrays.sort(arr);
		
		int sh = arr[arr.length -2];
		
		System.out.println(sh);
	}

}
