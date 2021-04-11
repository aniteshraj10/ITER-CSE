import java.util.Scanner;

public class A6Q3 {

	public static int reverse(int number)
	{
		int rev=0;
		while(number>0)
		{
			int r=number%10;
			rev=rev*10+r;
			number=number/10;
		}
		return rev;
	}
	
	public static boolean isPalindrome(int number)
	{
		if(number==reverse(number))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number");
		int n=sc.nextInt();
		
		boolean res=isPalindrome(n);
		
		if (res == true)
			System.out.println(n + "  is palindrome");
		else
			System.out.println(n + "  is not palindrome");
		
		sc.close();
		
	}
}