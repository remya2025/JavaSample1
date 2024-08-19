/**
 * 
 */
package com.java.training2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */
public class StringUtility {
	
	private static void changeStringsToUpperCase(List<String> fruitsList) {
		 for (int i = 0; i < fruitsList.size(); i++) {
	            String fruitName = fruitsList.get(i);
	            String upperCaseFruitName = fruitName.toUpperCase();
	            System.out.println(upperCaseFruitName);
	        }
		
	}
	
	private static void findStringsWithGivenChar(char c,List<String> fruitsList) {
		List<String> matchFruits=new ArrayList<String>();
		for (int i = 0; i < fruitsList.size(); i++) {
			/*
			 * if(fruitsList.get(i).indexOf(c)>=0) { matchFruits.add(fruitsList.get(i)); }
			 */  
			if(fruitsList.get(i).startsWith(Character.toString(c))) {
            	matchFruits.add(fruitsList.get(i));
            }
          
        }
		 System.out.println(matchFruits);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		   List<String> fruitsList = Arrays.asList("grape","apple","banana","orange","pineapple","guava");
           changeStringsToUpperCase(fruitsList);
           System.out.println("Enter the character to be searched in the list :");
           Scanner scanner = new Scanner(System.in);
           char ch = scanner.next().charAt(0); // Read a single character
           System.out.println("character : " + ch);
           findStringsWithGivenChar(ch,fruitsList);
           scanner.close();
	}
	
	

}
