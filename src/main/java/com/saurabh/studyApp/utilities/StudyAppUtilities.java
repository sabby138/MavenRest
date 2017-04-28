package com.saurabh.studyApp.utilities;

public class StudyAppUtilities {
	
	public static String removeASCIISymbolsFromString(String input){
		
		input = input.replace('\u000B', ' ');
		input = input.trim();
		 return input;
	}
	
}
