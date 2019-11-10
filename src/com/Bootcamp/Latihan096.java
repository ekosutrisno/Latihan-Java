package com.Bootcamp;

import java.util.Scanner;

public class Latihan096 {

	public static void main(String[] args) {

		Scanner input_Nilai;
		input_Nilai = new Scanner(System.in);

		System.out.println("latihan Fibonaci");
		System.out.print("Masukkan Nilai: ");
		int nilai = input_Nilai.nextInt();

		int nilai_Fibonaci = fibonaci(nilai, "Atas");
		System.out.println("Nilai Fibonaci ke " + nilai + " adalah " + nilai_Fibonaci);

		input_Nilai.close();
	}
	
	
	private static int fibonaci(int n, String daun) {
		System.out.println("Daun" + daun);
		System.out.println("Fibonaci ke " + n);
		if (n == 1 || n == 0) {
			return n;
		}
		
		return fibonaci(n - 1, "daun kiri") + fibonaci(n - 2, "daun kanan");
	} 
}
