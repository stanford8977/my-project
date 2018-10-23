package com.tom;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 System.out.println("Which number is between -3~5?(true/false)");
	 Scanner scanner = new Scanner(System.in);
     String  line = scanner.nextLine();
     boolean range = line.equalsIgnoreCase("true&&false");
     System.out.println(range);
    }

}
