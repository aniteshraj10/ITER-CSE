import java.util.*;

public class A5Q15 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter amount : ");
		double amount = input.nextDouble();
		
		System.out.print("Enter annual interest rate : ");
		double interest = input.nextDouble();
		
		System.out.print("Enter number of months : ");
		int month = input.nextInt();
		
		double new_amount = 0;
		
		interest/=1200;
		
		for (int i = 1; i <= month; i++)
		{
			if (i == 1) 
				new_amount = amount * (1 + interest);
			else
				new_amount = (amount + new_amount) * (1+ interest);
		}
		
		System.out.println("Updated value in account = " + new_amount);
		
		input.close();

	}

}
