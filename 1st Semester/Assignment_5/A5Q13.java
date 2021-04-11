import java.util.*;

public class A5Q13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of term of fibonacci series : ");
		int n = sc.nextInt();
		
		int a=0, b=1, c=0;
		
		if (n == 0)
			System.out.print("");
		else if (n == 1)
			System.out.print(a + " ");
		else
			System.out.print(a + " " + b + " ");
		
		for (int i = 3; i<=n; i++)
		{
			c = a+b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

		sc.close();
		
	}

}
