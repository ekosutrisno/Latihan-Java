package com.LatihanSoal;

import java.io.IOException;
import java.util.Scanner;

public class Soal1 {

	//fungsi makanan
	public static void makanan() {
		String menu_makanan[] =
			{
			 "1.Burger 		: Rp.25000/pc",
			 "2.Pizza  		: Rp.60000/pc",
			 "3.Donut  		: Rp.10000/pc",
			 "4.Latagna		: Rp.35000/pc",
			 "5.Big Ramen 		: Rp.75000/pc",
			 "6.Sphagety   		: Rp.25000/pc"
			};
		
		System.out.println("==MENU MAKANAN==");
		for(int i=0; i<menu_makanan.length;i++) {
			System.out.println(menu_makanan[i]);
		}
	}
	
	//fungsi minuman
	public static void minuman() {
		String menu_minuman[] =
			{
			 "a.Lemon Tea		: Rp.15000/pc",
			 "b.Ice Tea		: Rp.10000/pc",
			 "c.Orange Jus		: Rp.15000/pc",
			 "d.Hot Coffe		: Rp.20000/pc",
			 "e.Es Kopi		: Rp.18000/pc"
			};

		System.out.println("==MENU MINUMAN==");
		
		for(int i=0; i<menu_minuman.length;i++) {
			System.out.println(menu_minuman[i]);
		}	
	}
	
	//eksekusi algo
	public static void main(String[] args ) throws IOException {
		
			Scanner input = new Scanner(System.in);
			double promo = 0.5;
			double ongkir = 0.1;
			double total_Beli, harga_Setelah_Diskon, harga_Ongkir;
			double total_Bayar,besar_Diskon;
			String menu;
			

			int ma1 = 0, ma2 = 0, mi1 = 0, mi2 = 0;
			
			System.out.println("======== PROMO GRAB FOOD ========");
			System.out.println("          Pilihan Menu           ");
			System.out.println("=================================");
			System.out.print("Tekan '0' Melihat MENU ");
			menu = input.next();
			switch(menu) {
			case "0":
				makanan();
				System.out.println();
				minuman();
				break;
			default:
				System.out.println("Kategori Tidak Tersedia");
			}
			
			System.out.println();
			System.out.println("------- wajib diisi dengan Angka-------");
			System.out.print("Harga Makanan 1 => Rp.");
			ma1 = input.nextInt();
			System.out.print("Harga Makanan 2 => Rp.");
			ma2 = input.nextInt();
			
			System.out.println();
			System.out.print("Harga Minuman 1 => Rp.");
			mi1 = input.nextInt();
			System.out.print("Harga Minuman 2 => Rp.");
			mi2 = input.nextInt();
			
			total_Beli = ((ma1+ma2)+(mi1+mi2));
			System.out.println("Total Pembelian Rp."+total_Beli);
			
			System.out.println();
			System.out.print("Masukkan Nama:");
			String nama = input.next();

			
			if(total_Beli >=30000) {
				
				if((nama.contains("a")||nama.contains("A")) && (nama.contains("i")||nama.contains("I"))) 
				{

					besar_Diskon = total_Beli*promo;
					if(besar_Diskon>30000) {
						besar_Diskon = 30000;
					}
					
					harga_Setelah_Diskon = total_Beli - besar_Diskon;
					harga_Ongkir = harga_Setelah_Diskon* ongkir;
					
					total_Bayar = harga_Setelah_Diskon + harga_Ongkir ;
					
					System.out.println();
					System.out.println("Total Belanja		: Rp."+total_Beli);
					System.out.println("Besar Diskon* 		: Rp."+besar_Diskon);
					System.out.println("Harga Setelah Diskon    : Rp."+harga_Setelah_Diskon);
					System.out.println("Harga Ongkir*		: Rp."+harga_Ongkir);
					System.out.println("------------------------------------");
					System.out.println("Total Pembayaran	: Rp."+total_Bayar);
					System.out.println();
					System.out.println("             Terima Kasih");
					System.out.println("          Copy @ ekosutrisno");
					
				}else {
					besar_Diskon = total_Beli*promo;
					if(besar_Diskon>20000) {
						besar_Diskon = 20000;
					}
					
					harga_Setelah_Diskon = total_Beli - besar_Diskon;
					harga_Ongkir = harga_Setelah_Diskon* ongkir;
					
					total_Bayar = harga_Setelah_Diskon + harga_Ongkir ;
					
					System.out.println();
					System.out.println("Total Belanja		: Rp."+total_Beli);
					System.out.println("Besar Diskon* 		: Rp."+besar_Diskon);
					System.out.println("Harga Setelah Diskon    : Rp."+harga_Setelah_Diskon);
					System.out.println("Harga Ongkir*		: Rp."+harga_Ongkir);
					System.out.println("------------------------------------");
					System.out.println("Total Pembayaran	: Rp."+total_Bayar);
					System.out.println();
					System.out.println("             Terima Kasih");
					System.out.println("          Copy @ ekosutrisno");
				}
				
			}else{
				System.out.println("Anda Tidak mendapatkan Diskon!");
				System.out.println("Total Belanja		: Rp."+total_Beli);
				System.out.println("------------------------------------");
				System.out.println("Total Pembayaran	: Rp."+total_Beli);
			}
			input.close();
	}

}
