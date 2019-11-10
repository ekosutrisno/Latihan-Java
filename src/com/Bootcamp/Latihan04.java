package com.Bootcamp;

public class Latihan04 {

	public static void main(String[] args) {
		//operator comparasi akan menghasilkan dalam bentuk boolean
		int a,b;
		boolean hasilKomparasi;
		System.out.println();
		System.out.println("----------- PERSAMAAN -----------");
		a = 10;
		b = 10;
		//operator persamaan
		hasilKomparasi = (a==b);
		System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,hasilKomparasi);
		System.out.printf("%d == %d --> %s \n", a,b,hasilKomparasi);
		
		System.out.println();
		System.out.println("----------- PERTIDAKSAMAAN -----------");
		a = 10;
		b = 10;
		//operator pertidaksamaan
		hasilKomparasi = (a != b);
		System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,hasilKomparasi);
		System.out.printf("%d != %d --> %s \n", a,b,hasilKomparasi);
		
		System.out.println();
		System.out.println("----------- KURANG DARI -----------");
		a = 10;
		b = 12;
		//operator Kurang dari
		hasilKomparasi = (a < b);
		System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,hasilKomparasi);
		System.out.printf("%d < %d --> %s \n", a,b,hasilKomparasi);
		
		System.out.println();
		System.out.println("----------- LEBIH DARI -----------");
		a = 15;
		b = 10;
		//operator Lebih dari
		hasilKomparasi = (a > b);
		System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,hasilKomparasi);
		System.out.printf("%d > %d --> %s \n", a,b,hasilKomparasi);
		
		System.out.println();
		System.out.println("----------- >= dan <= -----------");
		a = 10;
		b = 10;
		//operator Lebih dari
		hasilKomparasi = (a >= b);
		System.out.printf("%d apakah sama dengan %d ? %s \n", a,b,hasilKomparasi);
		System.out.printf("%d >= %d --> %s \n", a,b,hasilKomparasi);

	}

}
