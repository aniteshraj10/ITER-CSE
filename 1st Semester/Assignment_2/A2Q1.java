/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter celcius value:");
		double celcius=sc.nextDouble();
		
		double farenheit=(9.0/5)*celcius+32;
		
		System.out.println("Celcius = " + celcius);
		System.out.println("Farenheit = " + farenheit);
		
		sc.close();
		
	}

}
