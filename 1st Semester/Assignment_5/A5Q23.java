
public class A5Q23 {

	public static void main(String[] args) {

		int N = Integer.parseInt(args[0]);
		
		int count = 0;
		
		for (int i = 2; i <= N; i++)
		{
			int flag = 0;
			
			for (int j = 2; j <= (int)Math.sqrt(i); j++)
			{
				if (i%j == 0)
				{
					flag = 1;
					break;
				}
			}
			
			if (flag == 0)
				count++;
		}
		
		System.out.println("Number of prime less than or equal to " + N + " is " + count);

	}

}
