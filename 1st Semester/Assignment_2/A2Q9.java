/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x1, x2, y1, y2, distance, a, b;
		
		System.out.print("Enter x1 :");
		x1 = sc.nextDouble();
		
		System.out.print("Enter y1 :");
		y1 = sc.nextDouble();
		
		System.out.print("Enter x2 :");
		x2 = sc.nextDouble();
		
		System.out.print("Enter y2 :");
		y2 = sc.nextDouble();
		
		a = x2 - x1;
		b = y2 - y1;
		
		distance = Math.pow((Math.pow(a,2) + Math.pow(b,2)),0.5);
		
		System.out.println("(x1,y1) = (" + x1 + "," + y1 + ")");
		System.out.println("(x2,y2) = (" + x2 + "," + y2 + ")");
		System.out.println("The distance between two points is " + distance);

		sc.close();

	}

}
