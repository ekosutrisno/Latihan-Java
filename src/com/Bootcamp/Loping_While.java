package com.Bootcamp;

import java.util.Scanner;

public class Loping_While {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double angka1, angka2;

		int proses = 0;
		boolean kondisi = true;
		while (kondisi) {

			System.out.println();
			System.out.println("--------KALKULATOR SEDERHANA-------");
			System.out.println("Masukkan Angka");
			System.out.print("Angka 1: ");
			angka1 = scn.nextDouble();
			System.out.print("Angka 2: ");
			angka2 = scn.nextDouble();

			System.out.println("------------Pilih Operasi----------");
			System.out.printf("1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian");

			System.out.println("\n-----------------------------------");
			int pilihan = 0;
			double hasil;
			System.out.print("Masukkan Pilihan Operasi: ");
			pilihan = scn.nextInt();

			switch (pilihan) {
			case 1:
				System.out.println("*Penjumlahan");
				hasil = angka1 + angka2;
				System.out.println("Hasil dari (" + angka1 + " + " + angka2 + " = " + hasil + ")");
				break;

			case 2:
				System.out.println("*Pengurangan");
				hasil = angka1 - angka2;
				System.out.println("Hasil dari (" + angka1 + " - " + angka2 + " = " + hasil + ")");
				break;

			case 3:
				System.out.println("*Perkalian");
				hasil = angka1 * angka2;
				System.out.println("Hasil dari (" + angka1 + " x " + angka2 + " = " + hasil + ")");
				break;

			case 4:
				System.out.println("*Pembagian");
				if (angka2 == 0) {
					System.out.println("Pembagia tidak boleh 0");
				} else {
					hasil = angka1 / angka2;
					System.out.println("Hasil dari (" + angka1 + " : " + angka2 + " = " + hasil + ")");
				}
				break;

			default:
				System.out.println("Pilihan Tidak ada!");
			}

			proses++;
			if (proses == 5) {
				kondisi = false;
				scn.close();
			}
		}
	}
}
