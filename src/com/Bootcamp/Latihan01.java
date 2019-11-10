package com.Bootcamp;

public class Latihan01 {

	public static void main(String[] args) {
		
		int nilaiInt = 450;	
		System.out.println("Nilai int " +nilaiInt);
		
		long nilaiLong= nilaiInt;
		System.out.println("Nilai Long "+nilaiLong);

		byte nilaiByte =(byte) nilaiInt;
		System.out.println("Nilai Byte "+nilaiByte);

		//casting pembagian
		float a=10;
		int b=4;
		float c= a/b;
		
		System.out.printf("%f / %d = %f\n",a,b,c);
		
		int x = 10;
		int y = 4;
		float z =(float) x/y;
		System.out.printf("%d / %d = %f \n",x,y,z);
	}

}
