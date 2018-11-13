package com.tom;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 5;
		while(true)
		{
		   System.out.print("Please enter number of tickets:");
		   n1 = scanner.nextInt();
		   if(n1 == -1)
			{
			  break;
			}  
		      System.out.print("How many round-trip tickets:");
		      int n2 = scanner.nextInt();
		      int p1 = 1000;
		      int p2 = 2000;
		      double total = p1 * (n1-n2) + (p2 * 0.9)* n2;
		      System.out.println("Total tickets:" + n1);
		      System.out.println("Total Round-trip:" + n2);
		      System.out.println("Total :" + total); 
		}     
	}

}
