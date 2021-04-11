import java.util.Scanner;

public class A5Q22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for (int i=2; i<=(int)Math.sqrt(n); i++) //i<n or i<n/2
		{
			if (n%i==0)
			{
				count = 1;
				break;
			}
		}
		
		if (count == 0)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
		
		sc.close();

	}

}
