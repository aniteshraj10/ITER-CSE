import java.util.*;

public class A5Q20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter N : ");
		int N = input.nextInt();
		
		int i = 2;
		
		while (N>0)
		{
			int temp = N%i;
			if (Math.abs(temp) == 0)
			{
				N/=i;
				System.out.print(i + " ");
			}
			else 
				i++;
		}
		
		input.close();

	}

}
