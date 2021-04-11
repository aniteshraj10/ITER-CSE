import java.util.*;

public class A5Q6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, a;
		double H = 0, sum = 0;
		
		System.out.print("Enter number of integers : ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++)
		{
			System.out.print("Enter the value of a : ");
			a = sc.nextInt();
			
			sum = sum+1.0/a;
		}
		
		H = n/sum;
		
		System.out.println("Harmonic mean is " + H);
		
		sc.close();

	}

}
