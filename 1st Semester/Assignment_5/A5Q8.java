import java.util.*;

public class A5Q8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number : " );
		int n = input.nextInt();	
		
		int fact = 1;
		
		for (int i = n; i>=1; i--)
			fact*=i;
		
		System.out.println("Factorial of " + n + " is " + fact);
		
		input.close();

	}

}
