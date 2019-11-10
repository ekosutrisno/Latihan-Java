package com.Bootcamp;

public class Latihan02 {

	public static void main(String[] args) {
	//unari = operasi yang dilakukan pada satu variabel saja
		
		//unari + dan -
		int angka = 1;
		System.out.printf("Unari '-' %d menjadi %d\n",angka,-angka);
		System.out.printf("Unari '+' %d menjadi %d\n",angka,+angka);

		//unari increment dan decrement
		int angka2 = 10;
		angka2++;
		angka2++;
		System.out.println("Nilai dengan '++' menjadi = " +angka2);
		
		int angka3 = 10;
		angka3--;
		System.out.println("Nilai dengan '--' menjadi = " +angka3);
		
		int a = 5;
		System.out.printf("Nilai dengan '++' prefik menjadi = %d \n " ,++a);
		int b = 5;
		System.out.printf("Nilai dengan '++' postfik menjadi = %d \n " ,b++);
		System.out.printf("Hasil dari postfik menjadi = %d \n " ,b);
		
		//unari bolean dengan ! untuk negasi
		boolean eko = true;
		System.out.println("Nilai Boolean: "+eko);
		System.out.println("Nilai Boolean: "+!eko);
	}

}
