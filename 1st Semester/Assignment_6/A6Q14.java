import java.util.Scanner;

public class A6Q14 {
	
	public static void password_check(String str)
	{
		int n = str.length();
		
		int count = 0;
		boolean length = false, character = false , digit;
		
		if  (n>=8)
			length = true;
		
		for (int i = n-1; i>=0; i--)
		{
			int a = str.charAt(i);

			if	((a >= 65 && a <= 90) || (a >= 97 && a <= 122) || (a >= 48 && a <= 57))
				character = true;
			else
			{
				character = false;
				break;
			}
		}
		
		for (int i = n-1; i>=0; i--)
		{
			int a = str.charAt(i);

			if	(a >= 48 && a <= 57)
				count++;
		}
		
		if (count >= 2)
			digit = true;
		else
			digit = false;
		
		if (length && character && digit)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
		
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter password : ");
		String password = input.next();

		password_check(password);

		input.close();

	}

}
