import java.util.*;

public class A5Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0, term = 0, sign = 1, k = 1;
		
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();

		for (int i=1; i<=n;i++)
		{
			term = sign * k;
			sum+=term;
			k+=2;
			sign*=-1;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
		
	}

}
