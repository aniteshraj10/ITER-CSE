/*Using Newton’s method, write a java program that takes integers N and 
 * k as command-line arguments and prints the kth root of N. 
 */

import java.util.*;

public class A5Q18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the value of k : ");
		int k = sc.nextInt();
		
		double g1, g2;
		
		g2 = n/2;
		
		do
		{
			g1 = g2;
			g2 = ((k-1)*g1+n/Math.pow(g1, k-1))/k;
		}while (Math.abs(g1-g2)>0.000001);
		
		double root = g2;
		
		System.out.println("The square root of " + n + " is " + root);
		
		sc.close();

	}

}
