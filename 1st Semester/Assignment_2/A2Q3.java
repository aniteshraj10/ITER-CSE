/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a value for feet:");
		double feet = sc.nextDouble();
		
		double meter = feet * 0.305;
		
		System.out.println(feet + " feet is " + meter + " meters.");
		
		sc.close();

	}

}
