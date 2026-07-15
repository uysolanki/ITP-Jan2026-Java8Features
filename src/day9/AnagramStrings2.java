package day9;

import java.util.Arrays;

public class AnagramStrings2 {

	//silent
	//listen
	
	//note tone 
	
	//cab bca abc
	
	//check wheter the 2 strings are anagrams
	
	public static void main(String[] args) {
		
		String s1="silent";
		String s2="listen";
		
//		String s1="apple";
//		String s2="mango";
		
		
		
		String s3=getSortedString(s1); //"eilnst"
		String s4=getSortedString(s2); //"eilnst"
		
		if(s3.equals(s4))
			System.out.println("Anangrams");
		else
			System.out.println("Not Anagrams");
	}
	
	
	public static String getSortedString(String str)
	{
		char arr1[]=str.toCharArray(); 
		Arrays.sort(arr1);
		String s=new String(arr1);
		return s;
	}
}
