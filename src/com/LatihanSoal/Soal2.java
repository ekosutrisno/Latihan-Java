package com.LatihanSoal;

import java.util.*;

public class Soal2 {

	public static void main(String[] args) {
		/*
		 * Promo diskon 50%, Maks Rp.100000
		 * Cashback 10%, Maks Rp.30000
		 * Minimal Belanja Rp.40000
		 * Harga kopi susu Rp. 18000
		*/
		Scanner input;
		input = new Scanner(System.in);
		
		double diskon, harga, cashback, saldo, harga_diskon, total_bayar, info = 60000;
		System.out.println();
		System.out.println("----------PROMO DISKON-----------");
		System.out.println("Produk: Es Kopi");
		System.out.println("---------------------------------");
		System.out.println();
		System.out.println("Saldo anda Sebesar Rp. "+ info);
		System.out.print("Masukkan Jumlah Pembayaran => Rp. ");
		saldo = input.nextDouble();
		
		
		if(saldo >= 40000) {
			diskon = saldo * 50/100;
			if(diskon >= 100000) {
				diskon = 100000;
			}
			
			harga_diskon= saldo - diskon;
			cashback =  harga_diskon * 10/100;
					
			if(cashback >= 30000) {
				cashback = 30000;
			}
			harga = info - harga_diskon;
			total_bayar = harga + cashback;
			System.out.println();
			System.out.println("Total harga: Rp. "+harga_diskon);
			System.out.println("---------------------------------");
			System.out.println("Diskon : Rp. "+ diskon);
			System.out.println("Cashback: Rp. "+cashback);
			System.out.println("---------------------------------");
			System.out.println("Sisa Saldo Anda: Rp. "+ total_bayar);
			System.out.println();
			System.out.println("Terimakasih!");
		}else {
			System.out.println("Total harga: Rp. "+saldo);
			System.out.println("---------------------------------");
			System.out.println("Anda Tidak mendapatkan Diskon!");
			System.out.println("---------------------------------");
			System.out.println("Sisa Saldo Anda: Rp. "+ saldo);
			System.out.println();
			System.out.println("Terimakasih!");
		}
		
		input.close();
	}
}
