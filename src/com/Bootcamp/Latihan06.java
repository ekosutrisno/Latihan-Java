package com.Bootcamp;

public class Latihan06 {

	public static void main(String[] args) {
		byte a = 3;
		byte b;
		String a_bits, b_bits, c_bits;
		
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
		System.out.printf("%s = %d \n",a_bits,a);
		
		System.out.println("----------SHIFT LEFT <<");
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
		System.out.printf("%s = %d \n",a_bits,a);
		
		b =(byte)(a<<3);
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
		System.out.printf("%s = %d \n",b_bits,b);
		
		
		System.out.println("----------SHIFT RIGH >>");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
		System.out.printf("%s = %d \n",a_bits,a);
		
		b =(byte)(a>>2);
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
		System.out.printf("%s = %d \n",b_bits,b);
		
		System.out.println("----------SHIFT OR |");
		a = 24;
		a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
		System.out.printf("%s = %d \n",a_bits,a);
		
		b = 12;
		b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
		System.out.printf("%s = %d \n",b_bits,b);
		
		System.out.println("----------SHIFT XOR ~ ");
		a = 24;
		b = (byte)(~a);
		c_bits = String.format("%8s", Integer.toBinaryString(b).substring(24));
		System.out.printf("%s = %d \n",c_bits,b);


	}

}
