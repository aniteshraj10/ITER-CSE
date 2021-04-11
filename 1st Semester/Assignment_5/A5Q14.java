import java.util.*;

public class A5Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of term of fibonacci series : ");
		int n = sc.nextInt();
		
		int a=0, b=1;
		
		int i = 2;
		
		while (i<n)
		{
			System.out.print(a + " " + b + " ");
			a = a+b;
			b = a+b;
			i = i+2;
		}
		if (n == 1)
			System.out.print(a);
		else if (i%n==0)
			System.out.print(a + " " + b + " ");
		else
			System.out.print(a);

		sc.close();

	}

}
