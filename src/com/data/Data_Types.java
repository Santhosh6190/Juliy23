package com.data;

public class Data_Types {
	
	
	public static void main (String [] args ) {
		
		int n;
		patternLn(n = 4);
		
}
	
	static void patternLn(int n) {
		
		for (int row = 1; row  <= n ; row ++) {
			
			for (int col = 1; col <= row ; col++) {
				System.out.print("*");
				
			}
			System.out.println();
			
			
		}

		
		
	}
	
	

}
