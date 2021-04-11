/*
 *Name : Anitesh Raj
 *Registration No. : 2041018007
 *Semester : 1
 *Branch : CSE
 *Section : A
 *Problem Description : 
 */

import java.util.Scanner;

public class A2Q13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter minutes : ");
		int minute = sc.nextInt();
		
		int day = minute/(24*60);
		int year = day/365;
		day = day - (year*365);
		
		System.out.println(minute + " minutes is approximately " + year + " years and " + day + " days.");
		
		
		sc.close();

	}

}
