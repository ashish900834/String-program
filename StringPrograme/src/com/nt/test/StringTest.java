package com.nt.test;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter your first name");
		String s1="ashish";
		String s2="ashish";
		
		if(s1.length()==s2.length()) {
			for(int i=0;i<=s1.length()-1;i++) {
				
				for(int j=0;j<=s2.length()-1;j++) {
					if(s1.charAt(i)==s2.charAt(j)) {
						
					}
					
				}
				
			}
			System.out.println("Two sTrInG are EQUALS");
			
		}
		else {
			System.out.println("Two string are not equal");
		}
		
		
		

		
	}

}
