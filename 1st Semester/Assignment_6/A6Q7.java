
public class A6Q7 {
	
	public static boolean isPrime(int n)
	{
		int flag = 0;
		for (int i = 2; i<=(int)Math.sqrt(n); i++)
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

	public static void main(String[] args) {
		
		for (int i = 2; i<1000; i++)
		{
			if (isPrime(i) && isPrime(i+2))
				System.out.println("(" + i +"," + (i+2) + ")");
		}

	}

}
