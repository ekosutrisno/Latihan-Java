package com.Bootcamp;

public class Latihan092 {

	public static void main(String[] args) {
		
		// y = (x + 2) + x
		int x, y;
		x= 5;
		y = hitung(x);
		System.out.println("Hasilnya adalah = "+y);
		
		x = 20;
		y = hitung(x);
		System.out.println("Hasilnya adalah = "+y);	
	}
	
	
	private static int hitung(int input) {
		
		int hasil;
		//hasil = (input + 2) * input;
		hasil = input * input;
		return hasil;
		
	}
	
}
