import java.util.*;

public class A4Q17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");
		int n = input.nextInt();
		
		for (int i=1; i<=n;i++) 
		{
			for (int j=1; j<=n;j++) 
			{
				if((i%j==0)||(j%i==0))
				{
					System.out.print("*  ");
				}
				else {
					System.out.print("    ");
				}
			}
			System.out.println(i);
		}
		
		input.close();

	}

}
