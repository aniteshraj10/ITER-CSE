/*java program using method that displays the first 100 palindromic prime
 * numbers. Display 10 numbers per line, separated by exactly one space, 
 * as follows:*/

public class A6Q6 {

	public static boolean isPrime(int n) 
	{
		int flag = 0;
		for (int i = 2; i <= (int)Math.sqrt(n); i++)
		{
			if (n%i == 0)
			{
				flag = 1;
				break;
			}
		}

		if (flag == 0)
			return true;
		else
			return false;
	}

	public static boolean isPalindrome(int n)
	{
		int rev = 0, temp = n;

		while (n>0)
		{
			int r = n%10;
			rev = rev*10+r;
			n/=10;
		}

		if (temp == rev)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		int n = 100, count = 0, no = 2;

		while (count < n)
		{
			if (isPrime(no) && isPalindrome(no))
			{
				System.out.print(no + " ");
				count++;
				if (count % 10 == 0)
					System.out.println();
			}

			no++;

		}

	}

}
