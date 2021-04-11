/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double weight,height,bmi;
		
		System.out.print("Enter weight in pounds:");
		weight = sc.nextDouble();
		
		System.out.print("Enter height:");
		height = sc.nextDouble();
		
		System.out.println("Weight in pounds = " + weight);
		System.out.println("Height in inches = " + height);
		
		weight*= 0.45359237;
		height*= 0.0254;
		
		bmi = weight / Math.pow(height, 2);
		
		System.out.println("BMI is " + bmi);
		
		sc.close();
		
	}

}
