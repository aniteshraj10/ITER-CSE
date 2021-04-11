import java.util.Scanner;

public class A6Q13 {
	
	public static boolean palindrome(String str)
	{
		String s="";

		int n = str.length();

		for (int i = n-1; i>=0; i--)
		{
			s = s + str.charAt(i);
		}
		
		if (s.equalsIgnoreCase(str))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String msg = input.next();
		
		if (palindrome(msg))
			System.out.println(msg + " is palindrome");
		else
			System.out.println(msg + " is not palindrome");
		
		input.close();

	}

}
