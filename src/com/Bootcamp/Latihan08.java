package com.Bootcamp;

public class Latihan08 {

	public static void main(String[] args) {
		//Break, Continue, return
		
		int a = 0;
		while(true) {
			a++;
			if(a==10) {
				break; // Memaksa keluar program!
			}else if(a==5) {
				continue;
			}else if(a==7) {
				return;
			}
			
			System.out.println("Loping ke- "+a);
			
		}
		System.out.println("Akhir Program!");
	}
	
}
