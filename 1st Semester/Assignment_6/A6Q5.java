
public class A6Q5 {
	
	public static boolean isPrime(int number)
	{
		int flag = 0;
		for (int i = 2; i <= Math.sqrt(number); i++)
		{
			if (number % i == 0)
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
	
	public static void main(String[] args){
		
		for (int i = 1; i < 1000; i++)
		{
			if (isPrime(i))
				System.out.print(i + " ");
		}
		
	}

}