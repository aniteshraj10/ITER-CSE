import java.util.*;

public class A6Q9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a, b, c, d;
		
		System.out.print("Enter a : ");
		a = input.nextInt();
		
		System.out.print("Enter b : ");
		b = input.nextInt();
		
		System.out.print("Enter b : ");
		c = input.nextInt();
		
		System.out.print("Enter d : ");
		d = input.nextInt();
		
		scd(a, b, c, d);
		
		input.close();

	}
	
	public static void scd(int a, int b, int c, int d)
	{
		int lcm = find_lcm(b, d);
		
		double result = (double)(a * (lcm / b) + c * (lcm/d))/lcm;
		
		System.out.println("Sum of two fractions = " + result);
	}
	
	public static int find_lcm(int x, int y)
	{
		int product = x * y;
		while (y>0)
		{
			int r = x % y;
			x = y;
			y = r;
		}
		
		int gcd = x;
		
		return product/gcd;
	}

}
