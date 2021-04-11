/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q11 {

	public static void main(String[] args) {
		
		double ia, air, year, fiv;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter investment amount : ");
		ia = sc.nextDouble(); //investment amount input
		
		System.out.print("Enter annual interest rate in percentage : ");
		air = sc.nextDouble(); //annual interest rate input
		
		System.out.print("Enter number of year : ");
		year = sc.nextDouble(); //number of year input
		
		fiv = ia * (Math.pow(1 + (air/1200),year*12));
		
		System.out.println("Future Investment Value = " + fiv);
		
		sc.close();

	}

}
