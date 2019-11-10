package com.Bootcamp;

public class Latihan05 {

	public static void main(String[] args) {
		
		boolean a,b,c;
		//OR / atau /(||)
		System.out.println("==== OR (||) ====");
		a = false;
		b = false;
		c = (a||b);
		System.out.println(a + " || " + b + " = " +c);
		
		a = false;
		b = true;
		c = (a||b);
		System.out.println(a + " || " + b + " = " +c);
		
		a = true;
		b = false;
		c = (a||b);
		System.out.println(a + " || " + b + " = " +c);
		
		a = true;
		b = true;
		c = (a||b);
		System.out.println(a + " || " + b + " = " +c);
		
		//AND / dan /(&&)
				System.out.println("==== AND (&&) ====");
				a = false;
				b = false;
				c = (a&&b);
				System.out.println(a + " && " + b + " = " +c);
				
				a = false;
				b = true;
				c = (a&&b);
				System.out.println(a + " && " + b + " = " +c);
				
				a = true;
				b = false;
				c = (a&&b);
				System.out.println(a + " && " + b + " = " +c);
				
				a = true;
				b = true;
				c = (a&&b);
				System.out.println(a + " && " + b + " = " +c);
				
				//XOR / Exclusif or /(^)
				System.out.println("==== XOR (^) ====");
				a = false;
				b = false;
				c = (a^b);
				System.out.println(a + " ^ " + b + " = " +c);
				
				a = false;
				b = true;
				c = (a^b);
				System.out.println(a + " ^ " + b + " = " +c);
				
				a = true;
				b = false;
				c = (a^b);
				System.out.println(a + " ^ " + b + " = " +c);
				
				a = true;
				b = true;
				c = (a^b);
				System.out.println(a + " ^ " + b + " = " +c);
				
				//NOT / Negasi /(!)
				System.out.println("==== NEGASI (!) ====");
				a = true;
				b = !a;
				System.out.println(a+ " ---> (!) = " +b);
				
	}
	
}
