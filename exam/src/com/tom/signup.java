package com.tom;

import java.util.Scanner;

public class signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Are you 18?(y/N)");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        boolean adult = line.equalsIgnoreCase("y");
        System.out.println(adult);
        if (adult){
        	System.out.println("Your age?");
        	int age = scanner.nextInt();
        	scanner.nextLine();
        	System.out.println("Your name");
        	String name = scanner.nextLine();
        	System.out.println("Your nick name");
        	String nickname = scanner.nextLine();
        	System.out.println(age+"\t"+name+"\t"+nickname+"\t");
        
        }else{
        	System.out.println("xxxxx 888888");
        	
        	
        	
        }
        
	}

}
