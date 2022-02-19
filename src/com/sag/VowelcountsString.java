package com.sag;
import java.util.*;

public class VowelcountsString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Scanner");
		String str=s.nextLine();
		
		int len=str.length();
		System.out.println(len);
		int count=0;
		
		for(int i=0;i<len;i++) {
			
			char ch=str.charAt(i);
		switch(ch) {
			
			case 'a':
			case 'A': count++;
			 break;
			 
			case 'e':
			case 'E':count++;
			break;
			
			case 'i':
			case 'I':count++;
			break;
			
			case 'o':
			case 'O':count++;
			break;
			
		    case 'u':
		    case 'U':count++;
		    break;
		    
		 	 
			}
		
		
		}
		System.out.println("Count of vowel:"+count);
		s.close();	

	}

}
