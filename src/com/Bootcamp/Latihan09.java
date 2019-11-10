package com.Bootcamp;

public class Latihan09 {

	public static void main(String[] args) {
		//Loping Bersarang
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Loop ke- "+i+" | ");
			
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
			}
		System.out.print("\n");
		}
		
		System.out.print("\n"); // new line 1
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Loop ke- "+i+" | ");
			
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
				if(i==j) {break;}
			}
		System.out.print("\n");
		}
		
		System.out.print("\n"); // new line 2
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Loop ke- "+i+" | ");
			
			for(int j = 0; j < 5; j++) {
				System.out.print("* ");
				if(i+j==4) {break;}
				
			}
		System.out.print("\n");
		
		}
		
		
		System.out.print("\n"); // new line 3
		
		for(int i = 0; i < 9; i++) {
			System.out.print("Loop ke- "+i+" | ");
			
			for(int j = 0; j < 9; j++) {
				System.out.print("* ");
				if(i==j) {
					break;
				}else if((i+j)==8) {
					break;
				}
				
			}
		System.out.print("\n");
		
		}
		
		System.out.print("\n"); // new line 3
		
		for(int i = 0; i < 9; i++) {
			System.out.print("Loop ke- "+i+" | ");
			
			for(int j = 0; j < 9; j++) {
				System.out.print("* ");
				if(i==j) {
					break;
				}else if((i+j)==8) {
					break;
				}	
			}
		System.out.print("\n");
		
		}
		
	}
	
}
