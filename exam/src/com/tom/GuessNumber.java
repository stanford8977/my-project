package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        
        while( true )
        {
            System.out.println("Your guess:");
            int guess = scanner.nextInt();
        	if(guess > secret)
        	{
        		System.out.println("lower");
        	}
        	else if(guess < secret)
        	{
        		System.out.println("higher");
        	}
        	else
        	{
        		System.out.println("Great! The secret number is :" + secret);
        		break;
        	}
        }
        
	}

}
