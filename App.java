
/*
* File: App.java
* Author: Megyeri Mark	
* Copyright: 2022, Megyeri Mark
* Group: Szoft 1/N
* Date: 2022-02-16
* Github: https://github.com/megyerimark/
* Licenc: GNU GPL
*/



import java.util.Scanner;

class App {
	public static void main (String[] args){
		
	
		System.out.println("Megyeri Mark , 2022-02-16");
		System.out.println("Feladat 0306");
		System.out.println("Haromszog teruletszamitas");
		
		
			Scanner sc = new Scanner(System.in);
			System.out.print("Alap: ");
		double alap= sc.nextDouble();
		System.out.print("Magassag: ");
		double magassag =sc.nextDouble();
		
		double terfogat=
		(alap * magassag)/2;
		System.out.println("terulet:" + terfogat);
		
		

		}
	
	}
