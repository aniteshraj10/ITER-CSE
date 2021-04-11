/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q2 {

	public static void main(String[] args) {
		
		double radius, length, area, volume;
		//final double pi=3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius of cylinder:");
		radius = sc.nextDouble();
		
		System.out.print("Enter lenght of cylinder:");
		length = sc.nextDouble();
		
		area = radius * radius * Math.PI; //Math.PI is pre defined methos for value of pie
		volume = area * length;
		
		System.out.println("Area of Cylinder = " + area + "\n" + "Volume of cylinder = " + volume);
		
		sc.close();

	}

}
