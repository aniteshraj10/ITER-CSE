import java.util.*;

public class A5Q9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x : " );
		int x = input.nextInt();	
		
		System.out.print("Enter n : " );
		int n = input.nextInt();
		
		int fact = 1;
		
		for (int i = n; i>=1; i--)
			fact*=i;
		
		int temp = (int)Math.pow(x, n);
		
		double div = temp/fact;
		
		System.out.println("x^n/n! = " + div);
		
		input.close();

	}

}
