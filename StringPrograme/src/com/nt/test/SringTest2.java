package com.nt.test;

import java.util.Scanner;

public class SringTest2 {

	public static void main(String[] args) {
		int count=0;
		String s1="Dog Dog doG,,,,,, mnmnmn";
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the character");
		String str=sc.nextLine();
		char ch=str.charAt(0);
		
		for(int i=0;i<=s1.length()-1;i++) {
			if(ch==s1.charAt(i))
				count++;
		}
		System.out.println(str+"="+count);
		System.out.println("!st changes for git test");
	}

}
