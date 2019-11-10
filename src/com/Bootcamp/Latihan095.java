package com.Bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *Fungsi  yanng mengembalikan fungsinya sendirinya sendiri dengan ciri return
 */

public class Latihan095 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Masukkan Nilai: ");
		int nilai = Integer.parseInt(userInput.readLine());
		System.out.println("Anda Memasukkan Nilai:" + nilai);
		cetak_Nilai(nilai);
		
		int jumlah = jumlah_Nilai(nilai);
		System.out.println("Jumlah: "+ jumlah);
		
		int faktorial = faktorial(nilai);
		System.out.println("Hasil Faktorial: "+ faktorial);
		
	}
	
	// fungsi 1
	private static int faktorial(int nilai) {
		System.out.println("Nilai Parameter: "+ nilai);
		if(nilai == 1) {
			
			return nilai;
		}
		return nilai * faktorial(nilai - 1);
	}
	
	// fungsi 2
	private static int jumlah_Nilai(int nilai) {
		System.out.println("Nilai Parameter: "+ nilai);
		if(nilai == 0) {
			
			return nilai;
		}
		return nilai + jumlah_Nilai(nilai - 1);
	}
	
	// fungsi 3
	public static void cetak_Nilai(int nilai) {
		System.out.println("Nilai: "+ nilai);
		
		if(nilai == 0) {
			return;
		}
					
		nilai--;
		cetak_Nilai(nilai);
	}
	
}
