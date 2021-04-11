import java.util.*;

public class A5Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");
		int n = sc.nextInt();
		
		for (int i=0;i<=n;i++)
		{
			int result = (int)Math.pow(2, i);
			System.out.println(i+" "+result);
		}
		
		sc.close();
	}

}
