  package com.tom;

    public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int age = 18;
	 float weight = 62f;
	 float height = 1.75f;
	 String firstname =("Lin");
	 String lastname = ("hao");
	 System.out.println(age);
	 System.out.println(weight);
     System.out.println(height);
     System.out.println(firstname);
     System.out.println(lastname);
	 float bmi = weight / (height * height);
	 System.out.println(bmi);
	 age = age + 1;
	 System.out.println(age);
	 Person p = new Person(62f,1.75f);
//	 p.weight = 62f;
//	 p.height = 1.75f;
	 
	 System.out.println(p.bmi());
	 p.hello();
//     Person Lin  = new Person();
//     Person jack = null ;
//     jack.hello();
     }

}
