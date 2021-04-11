/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("No. of eggs you have : ");
		int n = sc.nextInt();
		
		int gross = n/144;  int a = n - (gross * 144); 
		// calculate gross of eggs 
		
		int dozen = a/12; //calculate dozen of eggs
		int n1 = n%12; // number of eggs left 
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + n1 + ".");		
		
		sc.close();

	}

}
