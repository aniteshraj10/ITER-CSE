import java.util.*;

public class A5Q5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter total number of integers : " );
		int n = input.nextInt();
		
		int sum = 0;
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Enter number : ");
			int num = input.nextInt();
			
			sum+=num;
		}
		
		System.out.println("Sum = " + sum);
		
		input.close();

	}

}
