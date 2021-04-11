/*Write a java program to compute the square root of a number using 
 * Newton’s method. 
 */

import java.util.*;

public class A5Q17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		double g1, g2;
		
		g2 = n/2;
		
		do
		{
			g1 = g2;
			g2 = (g1+(n/g1))/2.0;
		}while (Math.abs(g1-g2)>0.000001);
		
		double root = g2;
		
		System.out.println("The square root of " + n + " is " + root);
		
		sc.close();

	}

}
