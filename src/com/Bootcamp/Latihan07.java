package com.Bootcamp;
import java.util.*;

public class Latihan07 {

	public static void main(String[] args) {
		//Deret Vibonaci
		Scanner input;
		int n, f_n, f_n_1, f_n_2;
		input = new Scanner(System.in);
		
		System.out.print("MEngambil Nilai Fibonacci ke- :");
		n = input.nextInt();
		
		f_n_2 = 0;
		f_n_1 = 1;
		f_n = 1;
		
		for(int i=1; i<=n; i++)
		{
			System.out.println("Nilai Ke "+n +" Adalah " +f_n);
			f_n = f_n_1 + f_n_2;
			f_n_2 = f_n_1;
			f_n_1 = f_n;
		}
		
		input.close();
	} 
	
}
