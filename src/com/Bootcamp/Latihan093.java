package com.Bootcamp;

public class Latihan093 {

	
	public static void main(String[] args) {
		// void artinya hampa
		System.out.println(simple());
		
		fungsi_Eko("EKo Sutrisno, I Love You");
		greeting("Puspita Sari");
		
	}
	// contoh fungsi
	private static void greeting(String nama) {
		System.out.println("Selamat Pagi, "+ nama);
	}
	
	//fungsi tanpa method pengembalian /return
	
	private static void fungsi_Eko(String input) {
		System.out.println(input);
	}
	
	//ini adalah fungsi atau method dengan prngambalian butuh return
	private static float simple() {
		return 10.0f;
	}
	
}
