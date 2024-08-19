package com.java.training2;

import java.util.Scanner;

public class SumOfAllElementsInArray {
	static int sumOfArrayElements(int[] numberArray)
	{
		int sum=0;		
		for (int n:numberArray) {
			sum+=n;
			
		}
		return sum;
		
	}
	static void displayArrayElements(int[] numberArray)
	{
		System.out.println("sum of elements in the array are :");
		for (int n:numberArray) {
			System.out.println(" "+n);
			
		}
	}
	public static void main(String[] args) {
		
	System.out.println("enter the SIZE of the array");
	Scanner sc=new Scanner(System.in);
	int arraySize=sc.nextInt();
	int[] numberArray = new int[arraySize];
	System.out.println("enter the number of elements in the array");
	for (int i=0;i<=arraySize-1;i++) {
		numberArray[i]=sc.nextInt();
	}
	displayArrayElements(numberArray);
	int sumOfArrayElements= sumOfArrayElements(numberArray);
	System.out.println("sumOfArrayElements :"+sumOfArrayElements);
	
	
	}

}
