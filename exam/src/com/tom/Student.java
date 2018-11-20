package com.tom;

public class Student {

	String name;
	int english;
	int math;
	
	
	public Student(String name,int english , int math)
	{
	   this.name = name;
	   this.english  = english;
	   this.math = math;
	}
	
	public void print()
	{
		System.out.print(name + "t" + english + "t" + math + "t" + (english + math)/2+ "t");
		System.out.println(getAverage() + "\t" + highest() + "\t");
		if(getAverage()<60)
		{
			System.out.println("Failed");
		}
		else
		{
			System.out.println("Pass");
		}
		System.out.println(getGrading());
	}
	
	public int highest()
	{
		if(english>math)
		{
			return english;
		}
		else
		{
			return math;
		}
	}
	
	public int getAverage()
	{
	     return(english + math)/2;
	}
    
	public char getGrading
	{
		char grading = 'F';
		int average = getAverage();
		switch(average/10)
		{
		    case 10:
		    case 9:
		    	 grading = 'A';
		    case 8:
		    	 grading = 'B';
		    case 7:
		         grading = 'C';
		    case 6:
		         grading = 'D';
		    
		}
	}
}
