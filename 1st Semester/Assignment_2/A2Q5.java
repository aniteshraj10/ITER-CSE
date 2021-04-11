/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double v0,v1,t,a;
		
		System.out.print("Enter initial velocity (in m/s):");
		v0 = sc.nextDouble();
		
		System.out.print("Enter final velocity (in m/s):");
		v1 = sc.nextDouble();
		
		System.out.print("Enter time (in sec):");
		t = sc.nextDouble();
		
		a = (v1-v0)/t;
		
		System.out.println("v0 = " + v0 + "\n" + "v1 = " + v1 + "\n" + "t = " + t);
		System.out.println("Average acceleration = " + a);
		
		sc.close();

	}

}
