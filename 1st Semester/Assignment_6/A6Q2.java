
public class A6Q2 {
	
	public static int getPentagonalNumber(int n)
	{
		return (n * (3 * n - 1)) / 2;
	}
	
	public static void main(String[] args){
		
		int NUMBER_PER_LINE = 10; // Display 10 number per line
		
		System.out.println("The first 100 pentagonal numbers(ten per line) are : ");
		
		for (int i = 1; i <= 100; i++)
		{
			System.out.print(" "+ getPentagonalNumber(i));
			if (i % NUMBER_PER_LINE == 0)
				System.out.println(" " );
		}
	}

}