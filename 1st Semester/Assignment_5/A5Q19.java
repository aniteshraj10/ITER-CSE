/*Write a java program that puts the binary representation of a positive 
 * integer N into a String s. 
 */

import java.util.*;

public class A5Q19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		String str = "";
		
		while (n>0)
		{
			int rem = n%2;
			str = rem + str;
			n/=2;
		}
		
		System.out.println(str);
		
		sc.close();

	}

}
