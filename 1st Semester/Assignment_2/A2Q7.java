/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : Calculate the area of hexagon
 *                              area = (3root(3)x^2)/2
 */

import java.util.Scanner;

public class A2Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double s,area;
		
		System.out.print("Enter side : ");
		s = sc.nextDouble();
				
		area = ((3 * Math.sqrt(3) * Math.pow(s,2))/2);
		
		System.out.println("The area of hexagon is " + area);
		
		sc.close();
	}

}
