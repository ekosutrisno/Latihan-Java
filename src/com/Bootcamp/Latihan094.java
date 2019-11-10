package com.Bootcamp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan094 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

		boolean kondisi = true;
		int proses = 1;

		while (kondisi) {

			System.out.print("Panjang: ");
			int panjang = Integer.parseInt(userInput.readLine());

			System.out.print("Lebar: ");
			int lebar = Integer.parseInt(userInput.readLine());

			System.out.println("---------------------------");
			System.out.println();
			fungsi_Gambar(panjang, lebar);

			tampil_Perhitungan(panjang, lebar);

			proses++;
			if (proses == 5) {
				kondisi = false;
			}
			System.out.println();
		}
	}

	// fungsi tampil_Perhitungan
	private static void tampil_Perhitungan(int panjang, int lebar) {
		System.out.println("Luas: " + fungsi_Luas(panjang, lebar));
		System.out.println("Keliling: " + fungsi_Keliling(panjang, lebar));
	}

	// fungsi fungsi_Luas
	private static int fungsi_Luas(int panjang, int lebar) {
		int hasil = panjang * lebar;
		return hasil;
	}

	// fungsi fungsi_Keliling
	private static int fungsi_Keliling(int panjang, int lebar) {
		int hasil = (panjang + lebar) * 2;
		return hasil;
	}

	// fungsi fungsi_Gambar
	private static void fungsi_Gambar(int panjang, int lebar) {
		for (int i = 0; i < lebar; i++) {
			for (int j = 0; j < panjang; j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}

}
