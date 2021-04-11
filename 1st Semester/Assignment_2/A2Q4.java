/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number between 0 and 1000:");
		int num=sc.nextInt();
		int num1=num;
		
		int sum = 0;
		
		sum+=(num % 10);
		num/=10;
		sum+= (num % 10);
		num/=10;
		sum+= (num % 10);
		num/=10;
		
		System.out.println("Sum of each digit of " + num1 + " is " + sum + ".");
				
		sc.close();

	}

}
