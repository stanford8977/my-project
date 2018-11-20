package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		
		int count = 1;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secret = random.nextInt(10)+1;
        System.out.println(secret);
        
        while( count <= 4 )
        {
            System.out.println("Your guess: ("+count+"/4):");
            count++;
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
        		break;
        	}
        }
        if(count < 2)
        {
        	System.out.println("Excellent! The secret number is :" + secret);
        }
        else if(count > 2 )
        {
        	System.out.println("Great! The secret number is :" + secret);
        }
	}

}
